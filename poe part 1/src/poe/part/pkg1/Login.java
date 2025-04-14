
package poe.part.pkg1;
public class Login 
{
    
   public boolean checkUsername(String UserName){
      if(UserName.length() <=5 && UserName.contains("_")) {
          
          System.out.println("Enter your name");
          return true;
          
      }
      else{
          System.out.println("Try again");
      }
      return  false;
   } 
    public boolean checkpassword(String password){
        if(password.length() >8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9]*") && password.matches(".*[!@#$%^&*()-+=].*")){
            System.out.println("Enter your password");
            return true;
        }
      else{
            System.out.println("Try again");
        }
      return false;
    }
    public boolean checknumber(String number){
        if(number.matches("^\\d{9}$"))
        {
           
        System.out.println("your number has been captured successfuly");
      return true;
        }
        else{
        System.out.println("Number Invalid,Try again");
    }
       return false;
       
        
}

}