public class PositiveOrNegative {

    public void check(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        } else if (number < 0) {
            System.out.println(number + " is a negative number");
        } else {
            System.out.println(number + " is neither positive nor negative");
        }
    }
    
}
