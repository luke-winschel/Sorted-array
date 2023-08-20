public class Main {
    public static void main(String[] args) {
        int [] array = new int [9];
        for (int i = 0; i < array.length; i++){
            array [i] = (int) (Math.random()*10);
        }
        print (array);
        System.out.println();
        sort (array);
    }




    public static void print (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void sort (int [] array){
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}