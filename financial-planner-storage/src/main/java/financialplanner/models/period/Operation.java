package financialplanner.models.period;

import java.util.Date;

import financialplanner.models.Model;
import financialplanner.models.common.Entry;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 1/11/15
 * Time: 9:43 PM
 */
public class Operation extends Model {
	public Date executionDate;
	public String description;
	public Entry entry;
	public Operation relatedOperation;
}
