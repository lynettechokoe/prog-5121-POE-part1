
package poe.part.pkg1;
import java.util.Scanner; 
public class PoePart1 
{      
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      Login login = new Login();
      String UserName;
      String password;
      String number;
      String capturedUsername;
      String capturedPassword;
      String capturedNumber;
        do{
            System.out.println("Enter username");
            UserName = scanner.next();
        }while(login.checkUsername(UserName)==false); 
        
        do{
            System.out.println("Enter password");
            password = scanner.next();
        }while(login.checkpassword(password)==false);
        
        do{
            System.out.println("Enter number");
            System.out.println("+27");
            number = scanner.next();
        }while(login.checknumber(number)==false);
        
        do{
        System.out.println("Enter captured username");
        capturedUsername = scanner.next();
        }while(capturedUsername.equals(UserName)==false);     ;
        
        do{
        System.out.println("Enter captured password");
        capturedPassword = scanner.next();
        }while(capturedUsername.equals(password)==false);
        
        do{
        System.out.println("Enter captured number");
        capturedNumber = scanner.next();
        }while(capturedUsername.equals(number)==false);
        
        
          
    }
   
           
    
       
        
        
        
        
        
        
        
        
        
                
             
    }
    

