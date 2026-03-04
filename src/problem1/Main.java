package problem1;

public class Main {

    public static void main(String[] args) {

        UsernameService service = new UsernameService();

        // Existing users
        service.registerUser("john_doe", 101);
        service.registerUser("admin", 102);


        System.out.println("john_doe available? "
                + service.checkAvailability("john_doe"));

        System.out.println("jane_smith available? "
                + service.checkAvailability("jane_smith"));

        System.out.println("Suggestions for john_doe: "
                + service.suggestAlternatives("john_doe"));

        service.checkAvailability("admin");
        service.checkAvailability("admin");
        service.checkAvailability("admin");

        System.out.println("Most attempted username: "
                + service.getMostAttempted());
    }
}