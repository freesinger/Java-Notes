/** Print true if n correspond to a leap year, false otherwise.
 * Assume n >= 1582, corresponding to a year in the Gregorian calender.
 */

public class LeapYear {
    public static void main(String[] args) {
        /** if (year is not divisible by 4) then (it is a common year)
            else if (year is not divisible by 100) then (it is a leap year)
            else if (year is not divisible by 400) then (it is a common year)
            else (it is a leap year) */
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);

        System.out.println(isLeapYear);
    }
}