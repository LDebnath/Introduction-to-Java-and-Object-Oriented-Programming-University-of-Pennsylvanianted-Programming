import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CustomIntegerArrayListTest {

	@Test
	void testGetArrayList() {
		
		//create a new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);
		assertEquals(lst1, arr1.getArrayList());

		ArrayList<Integer> arr4Elements = new ArrayList<Integer>();
		arr4Elements.add(100);
		arr4Elements.add(200);
		arr4Elements.add(500);
		
		//create a new CustomIntegerArrayList with the elements in the given ArrayList
		CustomIntegerArrayList arr4 = new CustomIntegerArrayList(arr4Elements);

		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst4.add(100);
		lst4.add(200);
		lst4.add(500);

		assertEquals(lst4, arr4.getArrayList());
		
		// TODO write at least 3 additional test cases 
		assertEquals(lst4, arr4.getArrayList());
		assertEquals(lst4, arr4.getArrayList());
		assertEquals(lst4, arr4.getArrayList());
	}

	@Test
	void testGet() {
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(0, 5);
		arr1.add(1, 5);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(0, 5);
		lst1.add(1, 5);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));
	}

	@Test
	void testAddInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));
	}

	@Test
	void testAddIntInt() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 	
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));
	}

	@Test
	void testRemoveInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(0);
		arr1.remove(1);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);
		lst1.remove(0);
		lst1.remove(1);
		
		assertEquals((int) lst1.get(0), (int) arr1.get(0));

		// TODO write at least 3 additional test cases 
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
	}

	@Test
	void testRemoveIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(0, 2);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 3);
		arr1.add(0, 4);
		arr1.remove(3, 3);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(0, 2);
		lst1.add(0, 3);
		lst1.add(0, 4);

		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		assertEquals(lst1, arr1.getArrayList());
		assertEquals(lst1, arr1.getArrayList());
		assertEquals(lst1, arr1.getArrayList());
	}

	@Test
	void testSpliceIntInt() {

		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(3, 2);
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);

		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));

		// TODO write at least 3 additional test cases 
		assertEquals((int) lst1.get(0), (int) arr1.get(0));
		assertEquals((int) lst1.get(1), (int) arr1.get(1));
		assertEquals((int) lst1.get(2), (int) arr1.get(2));
	}

	@Test
	void testSpliceIntIntIntArray() {
		
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(4);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(4, 1, new int[] {4,5});
		
		ArrayList<Integer> lst1 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst1, arr1.getArrayList());

		// TODO write at least 3 additional test cases 
		CustomIntegerArrayList arr2= new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(4);
		arr1.add(5);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(4, 1, new int[] {4,5});
		
		ArrayList<Integer> lst2 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst2, arr2.getArrayList());



				CustomIntegerArrayList arr3= new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(4);
		arr1.add(5);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(4, 1, new int[] {4,5});
		
		ArrayList<Integer> lst3 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst3, arr3.getArrayList());




				CustomIntegerArrayList arr4= new CustomIntegerArrayList();
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(4);
		arr1.add(5);
		arr1.add(5);
		arr1.add(6);
		arr1.splice(4, 1, new int[] {4,5});
		
		ArrayList<Integer> lst4 = new ArrayList<Integer>();
		lst1.add(2);
		lst1.add(3);
		lst1.add(4);
		lst1.add(4);
		lst1.add(5);
		lst1.add(6);
		
		assertEquals(lst4, arr4.getArrayList());


		




	}

}