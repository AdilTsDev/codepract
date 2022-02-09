public class Revers_String {

    public static void main(String[] args) {

        String str = "this is not reverse";
        String result = "";


        System.out.println(str);

        for(int i = str.length() -1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        System.out.println(result);


        System.out.println("~~~~~~~~~~");

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(str);












    }
}
