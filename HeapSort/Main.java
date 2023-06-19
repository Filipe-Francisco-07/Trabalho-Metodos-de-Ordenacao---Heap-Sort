package HeapSort;

import Algoritmos_De_Ordenacao.HeapSort;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array [] = new int [10];
		array[0] = 12;
		array[1] = 1555;
		array[2] = 134;
		array[3] = 11;
		array[4] = 21;
		array[5] = 10;
		array[6] = 1;
		array[7] = 12;
		array[8] = 144;
		array[9] = 2;
		
		HeapSort heap  = new HeapSort();
		
		heap.heapSort(array);
		
		for(int num:array) {
			System.out.println(num);
		}
		
	}

}