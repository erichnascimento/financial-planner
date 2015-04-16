package financialplanner.storage;

import financialplanner.models.accounts.Account;
import financialplanner.storage.collections.Accounts;
import org.mongodb.morphia.Datastore;


public class Storage {
	private static Accounts accounts;
	private static MongoConnection connection;

	public static Datastore getDataStore() {
		if (connection == null) {
			connection = new MongoConnection("financial-planner");
		}

		return connection.getDatastore();
	}

	public static void close() {
		if (connection != null) {
			accounts = null;
			connection.close();
		}
	}

	public static Accounts accounts() {
		if (accounts == null) {
			accounts = new Accounts(getDataStore(), Account.class);
		}

		return accounts;
	}
}
