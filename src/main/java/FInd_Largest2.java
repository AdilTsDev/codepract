public class FInd_Largest2 {

    public static void main(String[] args) {

        int [] numbers = {0, 303, 6, 89, 45, 96, 64, 808, 64, 8, 66, 202};

        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > max1){
                max2 = max1;
                max1 = numbers[i];
            }
            else if(numbers[i] > max2){
                max2 = numbers[i];
            }
        }
        System.out.println(max1 + " and " + max2);


















    }
}
