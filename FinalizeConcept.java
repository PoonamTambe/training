/**
 * 
 */

/**
 * @author test
 *
 */
class A {
	protected void finalize() throws Throwable {
		// System.out.println("I am from Finalize");
	}
}

public class FinalizeConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		a1 = a2;
		System.out.println("done");

		FinalizeConcept fc1 = new FinalizeConcept();
		fc1 = null;
		System.gc();
	}

	public void finalize() {
		System.out.println("I am from Finalize ");
	}
}