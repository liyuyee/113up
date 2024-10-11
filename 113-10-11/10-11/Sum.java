import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int sum= 0; 
        int number=0;
        do { 
            System.out.printf("輸入數字");
            number = Integer.parseInt(console.nextLine());
            sum+=number;
        } while (number!=0);
        System.out.printf("總合"+sum);

    }
}
