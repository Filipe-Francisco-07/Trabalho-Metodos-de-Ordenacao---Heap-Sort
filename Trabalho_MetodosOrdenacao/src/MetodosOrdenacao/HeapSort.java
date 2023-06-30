package MetodosOrdenacao;

public class HeapSort {
	public long troca;
	public long comparacao;
	   
	public long getTroca() {
		return troca;
	}
	public void setTroca(long troca) {
		this.troca = troca;
	}
	public long getComparacao() {
		return comparacao;
	}
	public void setComparacao(long comparacao) {
		this.comparacao = comparacao;
	}
	public void heapSort(int[] array) {
		int n = array.length;
	       
	     // Constrói a heap máxima (árvore heap)
	     for (int i = n / 2 - 1; i >= 0; i--) {
	         heapify(array, n, i);
	     }

	     // Extrai os elementos da heap um por um
	     for (int i = n - 1; i > 0; i--) {
	         // Move a raiz (maior elemento) para o final do array
	         int temp = array[0];
	         array[0] = array[i];
	         array[i] = temp;

	         // Reconstrói a heap
	         heapify(array, i, 0);
	     }
  }
   private void heapify(int[] array, int n, int i) {
	     int largest = i; // Inicializa a raiz como o maior elemento
	     int leftChild = 2 * i + 1; // Filho esquerdo
	     int rightChild = 2 * i + 2; // Filho direito

	     // Se o filho esquerdo é maior que a raiz
	     comparacao++;
	     if (leftChild < n && array[leftChild] > array[largest]) {
	         largest = leftChild;
	         troca++;
	     }

	     // Se o filho direito é maior que a raiz
	     comparacao++;
	     if (rightChild < n && array[rightChild] > array[largest]) {
	         largest = rightChild;
	         troca++;
	     }

	     // Se a raiz não é o maior elemento
	     comparacao++;
	     if (largest != i) {
	    	 troca++;
	         // Troca a raiz com o maior elemento
	         int temp = array[i];
	         array[i] = array[largest];
	         array[largest] = temp;

	         // Recursivamente reconstrói a heap afetada
	         heapify(array, n, largest);
	     }
	 }

	 // Função auxiliar para imprimir o array
	 public void printArray(int[] array) {
	     int n = array.length;
	     for (int i = 0; i < n; ++i) {
	         System.out.print(array[i] + " ");
	     }
	     System.out.println();
	 }
	   
}