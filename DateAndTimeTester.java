
import java.util.Scanner;


public class DateAndTimeTester {
	
		public static void main(String[] args) {
			// Creating a new instance of DateAndTimeTester 
			DateAndTimeTester tester = new DateAndTimeTester();
			// Calling the run method from the DateAndTimeTester instance called "Tester"
			tester.run();
			}
	
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date and time (MM/DD hh:mm) or 'exit' to quit:");
        String inputLine = scanner.nextLine();

        while (!inputLine.equalsIgnoreCase("exit")) {
            if (isValid(inputLine)) {
                System.out.println("The entered date and time is valid.");
            } else {
                System.out.println("The entered date and time is NOT valid.");
            }
            System.out.println("Enter a date and time (MM/DD hh:mm) or 'exit' to quit:");
            inputLine = scanner.nextLine();
        }
        scanner.close();
        System.out.println("Exiting Date And Time Tester.");
    }

//    Checks if a given string represents a valid date and time in "MM/DD hh:mm" format.
  
    public boolean isValid(String dateTimeString) {
        // Find the index of the space separating date and time
        int spaceIndex = dateTimeString.indexOf(' ');
        if (spaceIndex == -1) {
            return false; // No space found, invalid format
        }

        String datePart = dateTimeString.substring(0, spaceIndex);
        String timePart = dateTimeString.substring(spaceIndex + 1);

        return isValidDate(datePart) && isValidTime(timePart);
    }

    
//     Checks if a given string represents a valid date in "MM/DD" format.
     
    public boolean isValidDate(String dateString) {
        try {
            int month = getMonth(dateString);
            int day = getDay(dateString);

            if (month < 1 || month > 12) {
                return false;
            }
            if (day < 1) {
                return false;
            }

            // Handle days in different months
            if (month == 2) { 
                return day <= 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) { 
                return day <= 30;
            } else { 
                return day <= 31;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false; 
        }
    }

   
    public boolean isValidTime(String timeString) {
        try {
            int hour = getHour(timeString);
            int minute = getMinute(timeString);

            return hour >= 1 && hour <= 12 && minute >= 0 && minute <= 59;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            return false; 
        }
    }

    public int getMonth(String dateString) {
        int slashIndex = dateString.indexOf('/');
        return Integer.parseInt(dateString.substring(0, slashIndex));
    }


    public int getDay(String dateString) {
        int slashIndex = dateString.indexOf('/');
        return Integer.parseInt(dateString.substring(slashIndex + 1));
    }


    public int getHour(String timeString) {
        int colonIndex = timeString.indexOf(':');
        return Integer.parseInt(timeString.substring(0, colonIndex));
    }

    public int getMinute(String timeString) {
        int colonIndex = timeString.indexOf(':');
        return Integer.parseInt(timeString.substring(colonIndex + 1));
    }
}
