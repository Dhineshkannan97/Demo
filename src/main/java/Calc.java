public class Calc {
    public static int add(String num) {

        int result;
        if (num.isEmpty()) {
            return 0;
        } else {
            if(num.matches("\n")){
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
            p = Integer.parseInt(s) + p;
        }
        return p;
    }

    private static String[] splitNum(String num) {
        return num.split(",|\n");
    }

    public static void main(String[] args) {
        System.out.println(add("1,2\n3"));
    }
}