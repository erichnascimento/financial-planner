package financialplanner.storage;

import com.mongodb.MongoClient;
import financialplanner.models.accounts.Account;
import financialplanner.storage.collections.Accounts;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.util.logging.Logger;


public class Storage {
	private static Accounts accounts;
	private static Morphia morphia;
	private static Datastore datastore;
	private static MongoClient mongoClient;

	private static MongoClient getMongoClient() {
		if (mongoClient == null) {
			mongoClient = new MongoClient();
		}

		return mongoClient;
	}

	private static Datastore getDatastore() {
		if (datastore == null) {
			datastore = getMorphia().createDatastore(getMongoClient(), "financial-planner");
		}

		return datastore;
	}

	private static Morphia getMorphia() {
		if (morphia == null) {
			morphia = new Morphia();
		}

		return morphia;
	}

	public static Accounts accounts() {
		if (accounts == null) {
			accounts = new Accounts(getDatastore(), Account.class);
		}

		return accounts;
	}

	public static void close() {
		if (mongoClient == null) {
			Logger.getGlobal().info("Storage was closed");
			return;
		}

		Logger.getGlobal().info("Closing storage...");
		datastore = null;
		morphia = null;
		accounts = null;
		mongoClient.close();
		Logger.getGlobal().info("Storage closed");
	}
}
