package org.example;

public class Calc2 {
    public static long add(String num) {


        long result;
        if (num.isEmpty()) {
            return 0;
        } else {


//            var splitNum1 = splitNum(num);
//            return pars(splitNum1);


            var splitNum = splitNum(num);
            result = pars(splitNum);

            return result;
        }
    }

    private static long pars(String[] split) {

        long p = 0;
        for (String s : split) {
            //p = Long.parseLong(s) + p;
            System.out.println(s);
//            Pattern pattern = Pattern.compile(".*[a-zA-Z]+.*");
//            Matcher matcher = pattern.matcher(s);matcher.matches()
            if (Character.isAlphabetic(s.charAt(0))) {
                continue;
            }
            p = Long.parseLong(s) + p;
        }
        return p;
    }

    private static String[] splitNum(String num) {
        return num.split(",");
    }

    public static void main(String[] args) {
        System.out.println(add("1,1111111111111111"));
    }

}