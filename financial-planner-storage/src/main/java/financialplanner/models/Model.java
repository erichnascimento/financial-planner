package financialplanner.models;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

import java.util.Date;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 1/22/15
 * Time: 2:04 AM
 */
public abstract class Model {
	@Id
	public ObjectId id;

	private Date creationDate;

	public Date getCreationDate() {
		return creationDate;
	}

	public Model() {
		creationDate = new Date();
	}

	@PreLoad
	@SuppressWarnings("UnusedDeclaration")
	public void preLoad(DBObject dbObject) {
		creationDate = (Date) dbObject.get("creationDate");
	}
}
