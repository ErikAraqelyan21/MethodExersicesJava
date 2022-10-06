
public class Main {
    public static void main(String[] args) {
        double num1 = 37;
        double num2 = 25;
        double  num3 = 29;
        System.out.println("Smallest Number is : " + smallest(num1, num2, num3));

    }
    public static double smallest(double num1, double num2, double num3){

        return Math.min(Math.min(num1, num2) , num3);
    }
}




