import java.util.Scanner;

public class GettingGreater
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Getting the Greater Value");
        
        System.out.print("Enter first character: ");
        char firstCharacter = input.next().charAt(0);
        
        System.out.print("Enter second character: ");
        char secondCharacter = input.next().charAt(0);
        
        char greaterCharacter = (char) Math.max(firstCharacter, secondCharacter);
        
        System.out.println("----------------------------------------");
        System.out.println("The character with greater value is: " + greaterCharacter);
        System.out.println("----------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(firstCharacter + " : " + (int) firstCharacter);
        System.out.println(secondCharacter + " : " + (int) secondCharacter);
    }
}
