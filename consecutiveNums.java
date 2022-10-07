import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the three numbers to check are consecutive or not: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(areConsecutive(num1,num2,num3));
        }
        public static boolean areConsecutive(int num1, int num2, int num3){
        int maxNum = Math.max(num1,Math.max(num2,num3));
        int minNum = Math.min(num1,Math.min(num2,num3));
        int middleNum = (num1 + num2 + num3) - num1 - num3;
        return (maxNum - middleNum == 1) && (middleNum - minNum == 1);
        }
    }





