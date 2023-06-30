package MetodosOrdenacao;

public class BucketSort {
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
	  
	public void bucketSorting(int []array) {
		if(array.length <= 1) {
			return;
		}
		
		//creating buckets
		ListaEncadeada[] buckets = new ListaEncadeada[array.length];
		
		//biggest value
		int maiorValor= array[0];
		for(int i: array) {
			if(i > maiorValor)
				maiorValor = i;
		}
		
		//distribution of elements 
		for(int i=0;i<array.length;i++) {
			int indiceBucket = (array[i]*array.length/(maiorValor+1));
			if(buckets[indiceBucket] == null) {
				buckets[indiceBucket] = new ListaEncadeada();
				buckets[indiceBucket].inserirOrdenado(array[i]);
			}else
				buckets[indiceBucket].inserirOrdenado(array[i]);
		}
		
		int index = 0;
		for(int i=0; i<array.length;i++) {
			if(buckets[i] != null) {
				Nodo aux = buckets[i].getInicio();
				while(aux != null) {
					array[index++] = aux.getDado();
					aux = aux.getProx();
				}
			}
		}
	}
	
}