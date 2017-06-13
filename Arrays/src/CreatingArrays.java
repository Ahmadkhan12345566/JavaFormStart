
public class CreatingArrays {
	public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		   }
		}
	public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[5];
		for(int i =0;i<5;i++){
			arr1[i]=i;
			
		}
	/*	System.out.println("Data of array : \n");
		for(int i =0;i<5;i++){
		System.out.println(arr1[i]);
			
		}
		System.out.println("Using for each : \n");
		for(int element:arr1){
			System.out.println(element);
		}
		*/
		int[] arr2=new int[5];
		printArray(arr1);
		System.out.println("\n");
		 arr2=reverse(arr1);
		 printArray(arr2);
	}

}
