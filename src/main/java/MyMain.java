import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, "+name+"! It's nice to meet you!\n");
        System.out.println("What is your favorite number?");
        String number = scan.next();
        System.out.println("Great my favorite number is "+ number+ ", too!\n");
        System.out.println("What is your favorite movie?");
        String movie = scan.next();
        System.out.println(movie+"is a great movie, but my favorite is Whiplash!\n");
        System.out.println("Where was you born?");
        String birthplace = scan.next();
        System.out.println("Great, "+birthplace+" is a good place!\n");
        System.out.println("Where did you go to school?");
        String school = scan.next();
        System.out.println("Wow, I wish I could go to "+school+" one day!");


        scan.close();
    }
}
