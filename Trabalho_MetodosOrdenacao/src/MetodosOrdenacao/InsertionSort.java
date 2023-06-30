package MetodosOrdenacao;

public class InsertionSort {
	private long troca;
	private long comparacao;

	public long getTroca() {
		return troca;
	}
	public void setTroca(int troca) {
		this.troca = troca;
	}
	public long getComparacao() {
		return comparacao;
	}
	public void setComparacao(int comparacao) {
		this.comparacao = comparacao;
	}

	public int[] insertionSort(int array[]) {
		int pivo,j;
		for(int i = 0; i<array.length;i++) {
			pivo = array[i];
			j=i-1;
			comparacao++;
			while(j>= 0 && array[j] > pivo) {
				array[j+1] = array[j];
				j=j-1;
				troca++;
				
			}
			array[j+1] = pivo;
		}
		return array;
	}
}
