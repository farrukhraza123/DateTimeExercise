/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetimeexercise;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author User
 */
public class DateTimeExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       LocalDateTime mydatetime=LocalDateTime.now();
       LocalDate mydate=LocalDate.now();
       mydate=mydate.minusDays(15);
       //mydate=mydate.plusMonths(2);
       LocalTime mytime=LocalTime.now();
        System.out.println("Today date is " + mydate);
        System.out.println("Today date is " + mydatetime);
        System.out.println("Today date is " + mytime);
    }
    
}
