/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package p.test.projects;
import java.util.*;

/**
 *
 * @author robbe
 */
public class TestProjects {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 - 7: ");
        int n = input.nextInt();
        String day;
        
        switch (n) {
            case 1:
                day = "Today is Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "";
        }
        
        if (day != "") {
            System.out.format("The day #%d in week is: %s. \n", n, day);
        } else {
            System.out.print("The input is invalid");
        }
    }
}
