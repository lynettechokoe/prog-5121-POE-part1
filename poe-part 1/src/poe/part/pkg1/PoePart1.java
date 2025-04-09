
package poe.part.pkg1;
import java.util.Scanner;
public class PoePart1
     
{
    public static boolean isValidUsername(String username){
        return username.contains("_")&& username.length() <=5;
    }   
     
  
    public static boolean isValidPassword(String password){
        boolean hasUpper = false, hasNumber = false, hasSpecial = false;
        
        if(password.length()<8)return false;
        for(char ch:passwordtoCharArray()){
            if(Character.isUpperCase(ch))hasSpecial = true;
        }
               
     
        return hasUpper && hasNumber && hasSpecial;
    }
    public static boolean isValidPhoneNumber(String phone)
    {
        return phone.matches(0\\d{9}");// Start with 0 and has 10 digits
    }
    public static void main(String[]args){
        Scanner(system.in);
        
             System.out.println("Enter username:");
                String username = scanner.nextLine();
                if(!is ValidUsername(username)){
        
        System.out.println("Username is incorrectly formatted. it must contain an underscore and be no more than five characters.");
        return;
    }
                System.out.println("Enter password:");
                String password = scanner.nextLine();
                if(!isValidPassword(Password is incorrectly formatted. it must have at least 8 characters, a capital letter, a number, and a special character.")"
                    return;
    }   
        System    
     
               
  
    }
                        
        
        System.out.println("you've succesfully signed in. welcome, " + username + "!");
        Scanner.close();
    }
    
}
