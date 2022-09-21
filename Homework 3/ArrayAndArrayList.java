import java.util.ArrayList;
public class ArrayAndArrayList {
	public int howMany(int[] array, int element) {        
		int count = 0;  
		for(int i = 0; i < array.length; i++) 
			if(array[i] == element)
				count++;
		return count;     }  
	public int findMax(int[] array){   
		if(array.length == 0)
			return -1;
		int max = array[0];                  
		for(int i = 0; i < array.length; i++)              
			if(array[i] > max)
				max = array[i];
		return max;
	}              
	public ArrayList<Integer> maxArray(int[] array) {
		if(array.length == 0)
			return null;
		ArrayList<Integer> list = new ArrayList<>();             
		int max = findMax(array);                              
		for(int i = 0; i < array.length; i++)                    
			if(array[i] == max)
				list.add(max);
		return list;
	}           
	public void swapZero(int[] array) {
		int last = array.length;                
		for(int i = 0; i < last; i++) {    
			if(array[i] == 0) {
				for(int j = i + 1; j < last; j++)
					array[j - 1] = array[j];                              
				array[last - 1] = 0;
				last--;
				i--;
			}
		}
	}
}