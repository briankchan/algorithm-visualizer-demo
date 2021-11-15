package objects;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Dummy d;
		create1: d = new Dummy();
		d.number++;
		change: d.bool = true;
		create2: d = new Dummy();
		finish: assert Boolean.TRUE;
	}
}
