import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(23);
        numbers.add(34);
        numbers.add(3);
        numbers.add(64);
        numbers.add(88);
        numbers.add(54);

        System.out.println("for loop");

        for(int i = 0; i < numbers.size(); i ++){
            System.out.println(numbers.get(i));
        }

        System.out.println("advanced for loop");
        for (int num : numbers){
            System.out.println(num);
        }

        System.out.println("while loop");
        int dex = 0;
        while (numbers.size() > dex){
            System.out.println(numbers.get(dex));
            dex++;
        }

        System.out.println("Using Iterator");
        Iterator<Integer> iter = numbers.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }












    }
}
