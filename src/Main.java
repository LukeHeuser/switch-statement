public class Main {
    public static void main(String[] args) {

//      The below if-else statement is written like a switch statement
//        int value = 3;
//        if (value == 1){
//            System.out.println("Value is 1");
//        } else if (value == 2) {
//            System.out.println("Value is 2");
//        } else {
//            System.out.println("Value is not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value was neither 1, 2, 3, 4 , or 5");
        }

        String month = "cx";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

    }

    public static String getQuarter(String month) {

        return switch (month) {
            case "January", "February", "March" -> { yield "1st"; }
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "Novemeber", "December" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }

}
