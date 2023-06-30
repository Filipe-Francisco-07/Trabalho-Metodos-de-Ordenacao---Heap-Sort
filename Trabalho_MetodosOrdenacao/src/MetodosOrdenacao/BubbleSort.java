package MetodosOrdenacao;

public class BubbleSort {
	public long troca = 0;
	public long comparacao = 0;
	
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
	
	public int[] bubbleSort(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++){
			for(int j = 0; j < array.length -i-1; j++) {
				comparacao++;
				if(array[j] > array [j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					troca++;
				}
			}	
		}
		
		return array;
	}
}
