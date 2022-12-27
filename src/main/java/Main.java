import java.util.Scanner;

public class Main
{
    public static PasswordGenerator generator = new PasswordGenerator();
    public static void main(String[] args)
    {
        Scanner bruh = new Scanner(System.in);
        int desiredLength;
        System.out.println("Enter your desired length for your password");
        desiredLength = bruh.nextInt();
        Password newPassword = generator.generatePassword(desiredLength);
        System.out.println(newPassword.getValue());
    }
}
