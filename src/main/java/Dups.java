import java.util.Map;

public class Dups {

    public static void main(String[] args) {
        String str = "beautiful beach";

        System.out.println(str);
        System.out.println("dups are: ");
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.print(str.charAt(i) + " ");
                }
            }
        }

        System.out.println("using array");
        char [] chars = str.toCharArray();
        for(char dex : chars){
            if (chars[dex] == chars[dex + 1]){
                System.out.println(chars[dex]);

            }
        }
    }
}
