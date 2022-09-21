import java.util.*;
public class CustomIntegerArrayList {
	private ArrayList<Integer> arr;
	public CustomIntegerArrayList() {
		this.arr = new ArrayList<Integer>();
	}

	public CustomIntegerArrayList(ArrayList<Integer> arr) {
		this.arr = new ArrayList<Integer>(arr);
	}

	public ArrayList<Integer> getArrayList() {
		// TODO Implement method
		return this.arr;
	}

	public int get(int index) {
		// TODO Implement method
		return this.arr.get(index);
	}

	public void add(int element) {
		// TODO Implement method
		this.arr.add(element);
	}

	public void add(int index, int element) {
		// TODO Implement method
		this.arr.add(index,element);
	}

	public int remove(int index) {
		// TODO Implement method
		this.arr.remove(index);
		return 0;
	}

	public void remove(int num, int element) {
		// TODO Implement method
		int count=0;
		while (count<element){
			if (this.arr.contains(Integer.valueOf(element)))
				this.arr.remove(Integer.valueOf(element));
			count+=1;
		}
	}

	public ArrayList<Integer> splice(int index, int num) {
		// TODO Implement method
		int count = 0;

		while(count<num) {

			this.arr.remove(index);

			count += 1;
		}
		return null;
	}

	public int[] splice(int index, int num, int[] otherArray) {
		// TODO Implement method
		int count = 1;

		while(count<num){

			otherArray[count] = this.arr.get(index);

			this.arr.remove(index);

			count+=1;

		}
		return otherArray;
	}
	
	public static void main(String args[]) {
		
		//create new empty CustomIntegerArrayList
		CustomIntegerArrayList arr1 = new CustomIntegerArrayList();

		//add element
		arr1.add(2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [2]

		//add element
		arr1.add(0, 5);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [5, 2]

		//remove element
		arr1.remove(2, 2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [5]

		//add more elements
		arr1.add(6);
		arr1.add(2);
		arr1.add(7); // [3, 6, 2, 7]
		
		//splice 2 elements at index 0
		arr1.splice(0, 2);
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [2, 7]

		//splice 1 element at index 0 and add [4, 5]
		arr1.splice(0, 1, new int[] { 4, 5 });
		
		//get internal arraylist of elements
		System.out.println(arr1.getArrayList()); // [4, 5, 7]
				
		//create new CustomIntegerArrayList with the elements in the given ArrayList
		ArrayList<Integer> arr2Elements = new ArrayList<Integer>();
		arr2Elements.add(5);
		arr2Elements.add(15);
		arr2Elements.add(27);
		
		CustomIntegerArrayList arr2 = new CustomIntegerArrayList(arr2Elements);
		
		//get internal arraylist of elements
		System.out.println(arr2.getArrayList()); // [5, 15, 27]
	}
}