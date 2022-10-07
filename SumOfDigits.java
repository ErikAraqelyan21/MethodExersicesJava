
public class Main {
    public static void main(String[] args) {
      int num = 25;
        System.out.println("The sum of digit this number: " + sumOfDigits(num));

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}




