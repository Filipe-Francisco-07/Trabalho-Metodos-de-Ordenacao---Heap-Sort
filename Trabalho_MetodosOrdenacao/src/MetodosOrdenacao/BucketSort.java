package MetodosOrdenacao;

public class BucketSort {
	public static long troca;
	public  static long comparacao;
	  

	public static long getTroca() {
		return troca;
	}
	public static void setTroca(long troca) {
		BucketSort.troca = troca;
	}
	public static long getComparacao() {
		return comparacao;
	}
	public static void setComparacao(long comparacao) {
		BucketSort.comparacao = comparacao;
	}
		public static void bucketSort(int []array) {
	        if(array.length <= 1) {
	            return;
	        }

	        // criação dos buckets
	        ListaEncadeada[] buckets = new ListaEncadeada[array.length];

	        // maior valor
	        int maiorValor = array[0];
	        for(int i: array){
	        	comparacao++;
	            if(i > maiorValor) {
	            	troca++;
	                maiorValor = i;
	            }
	        }
	        //Distribuição dos elementos nos bucket's
	        for (int i=0;i<array.length;i++){
	        	int indiceBucket = (int) ((double) array[i] / (maiorValor + 1) * (array.length - 1));
	        	comparacao++;
	            if(buckets[indiceBucket] == null) {
	                buckets[indiceBucket] = new ListaEncadeada();
	                buckets[indiceBucket].inserirOrdenado(array[i]);
	                troca++;
	            }else {
	                buckets[indiceBucket].inserirOrdenado(array[i]);
	            	troca++;
	            }
	        }
	        // Combinar os elementos dos buckets em uma única lista ordenada
	        int index = 0;
	        for(int i=0;i<array.length;i++) {
	            if(buckets[i] != null) {
	                Nodo aux = buckets[i].getInicio();
	                while(aux != null) {
	                    array[index++] = aux.getDado();
	                    aux = aux.getProx();
	                }
	            }
	        }
	      
	    }
	    public static void main(String[] args) {

	    	ArrayGenerator ag = new ArrayGenerator();
	    	
	        int[] array = ag.criarArray(1000000);
	        array = ag.preencherAleatorio(array);

	    	long time1 = System.currentTimeMillis();
			
			bucketSort(array);
			
			long time2 = System.currentTimeMillis();
			double tempoExecucao = ((time2 - time1));
			
			for(int num:array) {
				System.out.println(num);
			}
			
			System.out.println("Tempo de execução: "+ tempoExecucao+ " ms.");
			System.out.println("Tempo de execução: "+ (tempoExecucao/1000)+ " segundos.");
			System.out.println("Tempo de execução: "+ (tempoExecucao/60000)+ " minutos.");
			System.out.println("Trocas: "+getTroca());
			System.out.println("Comparacoes: "+getComparacao());
	    }

}