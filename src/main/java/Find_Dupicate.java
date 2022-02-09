import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Find_Dupicate {


    public static void main(String[] args) {
        String[] names = {"adil", "alex", "adil", "mamat", "azin", "mamat", "kaka", "a", "a", "blabla", "kaka"};

        for (int i = 0; i < names.length; i++){
            for(int j = i + 1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                }
            }
        }


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Set<String> dups = new HashSet<String>();
        for (String same : names){
            if(!dups.add(same)){
                System.out.println(same);
            }
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Arrays.sort(names);
        for (int i = 0; i < names.length - 1; i++){
            if(Objects.equals(names[i], names[i + 1])){
                System.out.println(names[i]);
            }
        }

        int [] numbers = {24, 43, 24, 3, 5, 64, 46, 43, 66};

        for (int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }




















    }
}
