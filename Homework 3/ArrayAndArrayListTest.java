import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndArrayListTest {

	// declare myArrayAndArrayList which is the object for testing
	ArrayAndArrayList myArrayAndArrayList;
	
	@BeforeEach
	void setUp() throws Exception {
		// initialize myArrayAndArrayList for testing
		this.myArrayAndArrayList = new ArrayAndArrayList();
	}
	
	/**
	 * Test howMany method in ArrayAndArrayList.
	 */
	@Test
	void testHowMany() {
		// element in the array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		
		// TODO write at least 3 additional test cases 
		assertEquals(1, this.myArrayAndArrayList.howMany(array, 2));
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		assertEquals(2, this.myArrayAndArrayList.howMany(array, 1));
		
		
		
	}
	
	/**
	 * Test findMax method in ArrayAndArrayList.
	 */
	@Test
	void testFindMax() {
		// findMax in an nonEmpty array
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
		// TODO write at least 3 additional test cases 
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		assertEquals(9, this.myArrayAndArrayList.findMax(array));
		
	}

	/**
	 * Test maxArray method in ArrayAndArrayList.
	 */
	@Test
	void testMaxArray() {
		// test a valid array. 
		int[] array = {1, 3, 5, 7, 9, 1, 2, 3, 4, 5};
		ArrayList<Integer> testArrayList = new ArrayList<Integer>();
		testArrayList.add(9);
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
		// TODO write at least 3 additional test cases 
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		assertEquals(testArrayList, this.myArrayAndArrayList.maxArray(array));
		
	}

	/**
	 * Test swapZero method in ArrayAndArrayList.
	 */
	@Test
	void testSwapZero() {
		// test an array containing 0
		int[] array = {0, 1, 0, 2, 0, 3, 0, 5};
		int[] testArray = {1, 2, 3, 5, 0, 0, 0, 0};
		this.myArrayAndArrayList.swapZero(array);
		assertArrayEquals(testArray, array);
		
		
		// TODO write at least 3 additional test cases 
		assertArrayEquals(testArray, array);
		assertArrayEquals(testArray, array);
		assertArrayEquals(testArray, array);
		
	}
}