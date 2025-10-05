//write a program to find if a given year is leap year.

//divisible by 400 or divisible by 4 but not by 100

class leapYear {
    public static void main(String[] args) {
        int year = 2020; 
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
