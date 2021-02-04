
//author Vitalie ADOMNITA
//task: temperature transformation F to C

package tempCtoF;

import java.util.Scanner;

public class TempCalc {
    public static void main(String[] args) {
        System.out.println("Introduceti temperatura grade F: ");
        Scanner ut =  new Scanner(System.in);
        int userTemp = ut.nextInt();
        System.out.println("Temperatura in grade Celsius este: "+ (5*(userTemp-32))/9);
    }
}
