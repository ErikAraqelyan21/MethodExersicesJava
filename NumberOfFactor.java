
public class Main {
    public static void main(String[] args) {
      int n = 81;
        System.out.print("81 = ");
        factorOF3(n);

        }

        public static void factorOF3(int n){
            int result = n;
        while (result % 3 == 0){
            System.out.print("3 * ");
            result /= 3;
        }
            System.out.print(result);
        }
    }





