public class WhiteSpace_Remove {
    public static void main(String[] args) {
//        \s+	Find all space
//        \s+	Find all spaces at line beginning
//        \s+$	Find all spaces at line ending


        String str = "this is the string with space it between.";

        System.out.println(str);
        System.out.println(str.replaceAll("\s+", ""));









    }
}
