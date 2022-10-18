import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    public static int add(String num) {
//        if (num.replaceAll("[^A-za-z]","")){
//
//        }

        int result;
        if (num.isEmpty()) {
            return 0;
        } else {
            if (num.contains(".")) {
                var parseFloat = Float.parseFloat(num);
                num.replaceAll(".","|");
                System.out.println(parseFloat);
                var splitNum1 = splitNum(num);
                return pars(splitNum1);
            }

            var splitNum = splitNum(num);
            result = pars(splitNum);
        }
        return result;
    }

    private static int pars(String[] split) {
        int p = 0;

        for (String s : split) {
            Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
            Matcher matcher = pattern.matcher(s);
//            String s1= String.valueOf(s.charAt(0));
//            String s2=String.valueOf(s.charAt(1));
            if (matcher.matches()) {
//                s.replaceAll("",null);
                continue;
            }
            p = Integer.parseInt(s) + p;
        }
        return p;
    }

    private static String[] splitNum(String num) {
        var split = num.split(",");
        return split;

    }

    public static void main(String[] args) {
        System.out.println(add("9223372036854775807,5"));

    }
}