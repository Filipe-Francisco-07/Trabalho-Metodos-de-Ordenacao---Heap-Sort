package MetodosOrdenacao;

public class QuickSort {
    private long comparacoes;
    private long trocas;
     
    
    public long getComparacoes() {
		return comparacoes;
	}

	public void setComparacoes(long comparacoes) {
		this.comparacoes = comparacoes;
	}

	public long getTrocas() {
		return trocas;
	}

	public void setTrocas(long trocas) {
		this.trocas = trocas;
	}

	public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            comparacoes++;
            if (arr[j] <= pivot) {
                i++;
     
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                trocas++;
            }
        }
     
        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        trocas++;
     
        return i + 1;
    }
     
    public void sort(int arr[], int low, int high) {
    	comparacoes++;
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
     
    public void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}