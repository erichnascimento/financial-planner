package financialplanner.models.accounts;

import financialplanner.models.Model;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.Map;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 1/11/15
 * Time: 7:39 PM
 */
@Entity("accounts")
public abstract class Account extends Model {
	public String label;
}
