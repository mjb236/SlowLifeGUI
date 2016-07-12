import static org.junit.Assert.*;

import org.junit.Test;


public class MainPanelTest {

	//Pinning test to ensure that convertToInt works as expected
	//I created a public method that will simply get the returned
	//value of the private convertToInt method so that tests could
	//be applied.
	@Test
	public void convertToIntPin1() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.intConvert(8), 8);
	}
	
	//Pinning test to make sure that convertToInt works with the value 0
	@Test
	public void convertToIntPin2() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.intConvert(0), 0);
	}
	
	//Pinning test to make sure that convertToInt works with MAXINT
	@Test
	public void convertToIntPin3() {
		MainPanel mp = new MainPanel(15);
		assertEquals(mp.intConvert(Integer.MAX_VALUE), Integer.MAX_VALUE);
	}
}