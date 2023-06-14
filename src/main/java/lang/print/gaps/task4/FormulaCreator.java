package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a=0, b=0;
        long power = (int)  Math.pow(2, a);
        long leftSide = (9*power - 5*b + 2 + a - 7);
        long rightside = (a+b-4*a*b)/2;
        long result = leftSide*rightside;
    }
}
