




    import java.util.Scanner;

     public class PalindromeChecker {

         public static void main(String[] args) {

             Scanner scanner = new Scanner(System.in);

             // Welcome Message
             System.out.println("====================================");
             System.out.println("      Palindrome Checker App");
             System.out.println("====================================");

             // Taking input from user
             System.out.print("Enter a string: ");
             String original = scanner.nextLine();

             // Reverse the string using for loop
             String reversed = "";

             for (int i = original.length() - 1; i >= 0; i--) {
                 reversed = reversed + original.charAt(i);
             }


             if (original.equals(reversed)) {
                 System.out.println("Result: The entered string is a Palindrome.");
             } else {
                 System.out.println("Result: The entered string is NOT a Palindrome.");
             }

             scanner.close();
         }
     }

