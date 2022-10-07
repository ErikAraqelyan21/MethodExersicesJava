import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = scan.nextLine();
        System.out.println("vowels in this word are: " + vowelsInWord(str) );

    }

    public static  int vowelsInWord(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}




