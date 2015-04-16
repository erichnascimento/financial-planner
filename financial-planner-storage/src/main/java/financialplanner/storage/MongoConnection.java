package financialplanner.storage;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 4/15/15
 * Time: 11:38 PM
 */
public class MongoConnection {
	private static Morphia morphia;
	private static MongoClient mongoClient;
	private static org.mongodb.morphia.Datastore datastore;

	public MongoConnection(String dbName) {
		if (mongoClient == null) {
			mongoClient = new MongoClient();
		}

		if (morphia == null) {
			morphia = new Morphia();
		}

		if (datastore == null) {
			datastore = morphia.createDatastore(mongoClient, dbName);
		}
	}

	public void close() {
		datastore = null;
		morphia = null;
		if (mongoClient != null) {
			mongoClient.close();
		}
		mongoClient = null;
	}

	public Datastore getDatastore() {
		return datastore;
	}
}
