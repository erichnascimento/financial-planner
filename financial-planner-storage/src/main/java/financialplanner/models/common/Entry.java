package financialplanner.models.common;

import financialplanner.models.Model;

/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 1/11/15
 * Time: 9:38 PM
 */
public class Entry extends Model {
	public static final char ET_CREDIT = 'c';
	public static final char ET_DEBT = 'd';
	public float value;
	public char type;
}
