import java.util.*;
class ConsolebasedLogin{
    public static void main(String[] args) {
        System.out.println("Enter email id: ");
        Scanner s=new Scanner(System.in);
        String email=s.nextLine();
        System.out.println("Enter password: ");
        String password =s.nextLine();

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
        {
            System.out.println("Invalid Email format");
        }
        else if(password.length()<6){
            System.out.println("Invalid Password");
        }
        else{
            System.out.println("Login Successful");
        }
    }
    }
