public class selectionSort {
    public static int[] selection(int[] number) {
        for (int i = 0; i < number.length - 1; i++) { // 玡常逼Ч程﹚竚﹚琌癸┮-1
            int min = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[j] < number[min]) {
                    min = j;
                }
            }
 
            if (i != min) { // 狦材ぃ琌程碞癸传
                int temp = number[i];
                number[i] = number[min];
                number[min] = temp;
            }
        }   
        return number;
    }
    public static void main(String[] args){
        int[] a = {70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
        int[] b = selection(a);
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}