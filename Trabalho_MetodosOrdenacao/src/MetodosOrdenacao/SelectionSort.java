package MetodosOrdenacao;

public class SelectionSort {
	private long troca;
	private long comparacao;
	
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

	public int[] selectionSort(int array[]) {
		int min,temp;
		for(int i = 0; i<array.length-1;i++) {
			min = i;
			for(int j = i+1; j<array.length;j++) {
				comparacao++;
				if(array[j]< array[min]) {
					min = j;
				}
			}
			if(min != i)
				troca++;
			
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return array;
	}
}
