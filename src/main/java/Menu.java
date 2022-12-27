import java.util.Scanner;

public class Menu
{
    public static Scanner keyboard;
    private PasswordGenerator generator = new PasswordGenerator();
    private User currentUser = new User();


    public void run()
    {
        String userOption = "-1";
        System.out.println("Welcome to the login program\nLog in!");
        printLoginInfo();
        userOption = keyboard.nextLine();

        while(userOption != "3")
        {
            switch (userOption)
            {
                case "1" -> {
                    printLoginPrompt();

                }
                case "2" -> {
                    printNewUserCreationPrompt();

                }
                case "3" -> {
                    //printExitMessage();
                    System.exit(0);
                }
            }
        }


    }
    private void printLoginInfo()
    {
        System.out.println("Enter - 1 - to log in existing user");
        System.out.println("Enter - 2 - to register new user");
        System.out.println("Enter - 3 - to exit");
    }

    private void printLoginPrompt()
    {
        System.out.println("Enter Username:");

    }

    private void printNewUserCreationPrompt()
    {

    }


}
