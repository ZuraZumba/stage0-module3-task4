package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a=3;
        int b=2;
        double res = (int) ((9*Math.pow(a, 2) - 5*b + 2 + a - 7) * ((a + b - 4*a*b) / 2));
        System.out.println(res);
//        long power = (int)  Math.pow(2, a);
//        long leftSide = (9*power - 5*b + 2 + a - 7);
//        long rightside = (a+b-4*a*b)/2;
//        long result = leftSide*rightside;
    }
}
