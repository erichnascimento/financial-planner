package financialplanner.storage.collections;


import financialplanner.models.Model;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Key;

import java.util.Iterator;


public abstract class Collection<T extends Model> {
	private Class<T> clazz;
	protected Datastore datastore;

	public Collection(Datastore datastore, Class<T> clazz) {
		this.datastore = datastore;
		this.clazz = clazz;
	}

	public Iterator<T> getAll() {
		return datastore.find(clazz).iterator();
	}

	public Key<T> save(T value) {
		return datastore.save(value);
	}

	public Iterable<Key<T>> save(Iterable<T> value) {
		return datastore.save(value);
	}
}
