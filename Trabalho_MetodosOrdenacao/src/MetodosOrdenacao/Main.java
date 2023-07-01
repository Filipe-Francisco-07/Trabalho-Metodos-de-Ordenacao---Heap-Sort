package MetodosOrdenacao;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayGenerator ag = new ArrayGenerator();
		BubbleSort bbs = new BubbleSort();
		HeapSort hs  = new HeapSort();
		BucketSort bs = new BucketSort();
		InsertionSort is = new InsertionSort();
		SelectionSort ss = new SelectionSort();
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		
		int [] array = ag.criarArray(1000000);
		
		array = ag.preencherAleatorio(array);
		
		long time1 = System.currentTimeMillis();
		
		hs.heapSort(array);
		
		long time2 = System.currentTimeMillis();
		
		double tempoExecucao = ((time2 - time1));
		
		for(int num:array) {
			System.out.println(num);
		}
		
		System.out.println("Tempo de execução: "+ tempoExecucao+ " ms.");
		System.out.println("Tempo de execução: "+ (tempoExecucao/1000)+ " segundos.");
		System.out.println("Tempo de execução: "+ (tempoExecucao/60000)+ " minutos.");
		System.out.println("Trocas: "+ hs.getTroca());
		System.out.println("Comparacoes: "+ hs.getComparacao());
		
	}

}