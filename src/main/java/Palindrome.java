public class Palindrome {
    public static void main(String[] args) {

        String clean = "madammadam";

        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = clean.charAt(forward++);
            char backwardChar = clean.charAt(backward--);
            if (forwardChar == backwardChar){
                System.out.println("yes!");
            }

        }
        System.out.println("~~~~~~~~~~~~~~");
        String result = "";
        for (int i = clean.length() - 1; i >= 0; i--){
            result += clean.charAt(i);
        }
        if(clean.equals(result)){
            System.out.println("for loop yeas");
        }







    }
}
