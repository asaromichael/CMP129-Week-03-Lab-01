import java.util.Scanner;
public class Date {
    
    private int month;
    private int day;
    private int year;
    Scanner scanner = new Scanner(System.in);


    public Date(int m, int d, int y) {

        while (m > 12 || m < 1) {

            System.out.println("Your month input is invalid, please enter a valid month.");
            m = scanner.nextInt();


        } //end of while month

        while (d > 31 || d < 1) {

            System.out.println("Your day input is invalid, please enter a valid day.");
            d = scanner.nextInt();



        } //end of while day

        month = m;
        day = d;
        year = y;

    } //end of date constructor


    public void setMonth(int monthIn) {

        month = monthIn;

    } //end of setMonth

    public int getMonth() {

        return month;

    } //end of getMonth

} //end of date class
