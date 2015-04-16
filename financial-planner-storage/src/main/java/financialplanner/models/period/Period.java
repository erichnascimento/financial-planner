package financialplanner.models.period;

import financialplanner.models.Model;

import java.util.Date;
import java.util.List;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 1/11/15
 * Time: 9:28 PM
 */
public class Period extends Model {
	public Date startDate;
	public Date finishDate;
	public String label;
	public List<Balance> balances;
	public List<Operation> operations;
}
