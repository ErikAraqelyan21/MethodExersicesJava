
public class Main {
    public static void main(String[] args) {
        int num = 12541;
        System.out.println("This count number of digits with value: " + numberOfDigitsWithValue(num));


    }
    public static int numberOfDigitsWithValue(int num){
        int countNumber = 0;
        do{
            if(num % 10 == 2){
                countNumber++;
            }
            num /= 10;
        }while (num > 0);
            return countNumber;
        }
    }





