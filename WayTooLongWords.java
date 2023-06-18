package waytoolongwords;
import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number;
        int count =0;
        number = scan.nextInt();

        int values[][] = new int[number][3];

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < 3; j++) {
                values[i][j] = scan.nextInt();
            }
        }
        
        
       

        for (int i = 0; i < number; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += values[i][j];  
            }
        if (sum == 2 || sum == 3) {
                  count++;
            }  
        }

        System.out.println(count);

    }

}
