
package waytoolongwords;

import java.util.Scanner;
import java.util.ArrayList;
public class WayTooLongWords {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        num = scan.nextInt();
        scan.nextLine();
         ArrayList <String> str = new ArrayList<String> ();
        for (int i = 0; i < num; i++) {
            String v = scan.nextLine().toLowerCase();
            str.add(v);
            
        }
        for(int i =0; i< num ; i++){
            if (str.get(i).length() <= 10) {
                System.out.println(str.get(i));
            }
            
            else if (str.get(i).length() > 10) {
                char firstChar, lastChar;int nuberOfChar =0;
                firstChar = str.get(i).charAt(0);
                lastChar = str.get(i).charAt(str.get(i).length()-1);
                for (int j = 0; j < str.get(i).length()-1; j++) {
                     nuberOfChar =+j;
                }

                System.out.printf("%c%d%c\n", firstChar,nuberOfChar, lastChar);

            }

        } 
        
    }
    
}
