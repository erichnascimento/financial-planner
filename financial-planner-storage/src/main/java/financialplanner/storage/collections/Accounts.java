package financialplanner.storage.collections;


import financialplanner.models.accounts.Account;
import org.mongodb.morphia.Datastore;

public class Accounts extends Collection<Account>  {
	public Accounts(Datastore datastore, Class<Account> clazz) {
		super(datastore, clazz);
	}
}