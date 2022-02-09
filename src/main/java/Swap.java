public class Swap {

    public static void main(String[] args) {
        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);

        String st1 = "Love";
        String st2 = "You";
        String temp = "";
        System.out.println("Before swap: " + st1 + " " + st2);
        st1 = st1 + st2;
        st2 = st1.substring(0, st1.length() - st2.length());
        st1 = st1.substring(st2.length());


        System.out.println("After : " + st1 + " " + st2);

        temp = st1;
        st1 = st2;
        st2 = temp;
        System.out.println("After : " + st1 + " " + st2);















    }
}
