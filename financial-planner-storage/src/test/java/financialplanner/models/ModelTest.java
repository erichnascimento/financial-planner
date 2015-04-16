package financialplanner.models;

import financialplanner.BaseTestCase;
/**
 * User: erichnascimento <erichnascimento@gmail.com>
 * Date: 2/11/15
 * Time: 12:21 AM
 */
public class ModelTest extends BaseTestCase {
	private static class ModelImpl extends Model {}

	public void testCreationDate() {
		final long before = System.currentTimeMillis();
		final long created = new ModelImpl().getCreationDate().getTime();
		final long after = System.currentTimeMillis();

		assertTrue("Must set creation date when a model is instanced", created >= before && created <= after);
	}
}
