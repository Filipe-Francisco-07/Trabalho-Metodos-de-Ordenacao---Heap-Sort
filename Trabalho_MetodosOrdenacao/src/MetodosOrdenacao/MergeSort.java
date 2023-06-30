package MetodosOrdenacao;

public class MergeSort {
    private long troca = 0;
    private long comparacao = 0;

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

    public void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // O array já está ordenado ou vazio
        }

        int[] tempArray = new int[array.length];
        mergeSort(array, tempArray, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int[] tempArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, tempArray, left, middle); // Ordena a metade esquerda do array
            mergeSort(array, tempArray, middle + 1, right); // Ordena a metade direita do array

            merge(array, tempArray, left, middle, right); // Une as duas metades ordenadas
        }
    }

    private void merge(int[] array, int[] tempArray, int left, int middle, int right) {
        // Copia os elementos para o array temporário
        for (int i = left; i <= right; i++) {
            tempArray[i] = array[i];
        }

        int i = left; // Índice para a metade esquerda do array
        int j = middle + 1; // Índice para a metade direita do array
        int k = left; // Índice para o array ordenado final

        // Mescla as duas metades ordenadas
        while (i <= middle && j <= right) {
            comparacao++;
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            troca++;
            k++;
        }

        // Copia os elementos restantes da metade esquerda, se houver
        while (i <= middle) {
            array[k] = tempArray[i];
            i++;
            k++;
            troca++;
        }

        // Copia os elementos restantes da metade direita, se houver
        while (j <= right) {
            array[k] = tempArray[j];
            j++;
            k++;
            troca++;
        }
    }
}