import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /*  String changedName = "Max";

        Person p = new Person();

        p.speak();
        
        p.changeFirstName(changedName);*/
       

        //Create Scanner Object
        Scanner scan = new Scanner(System.in);

        //Prompt the user for their name
        System.out.print("What's your name?: ");

        //Read the information from the terminal
        String name = scan.nextLine();

        if (name.equals("Jacob")) {
            System.out.println("Happy Birthday " + name + "!");
        } else {
            //Greet them with a welcome message
            System.out.println("Welcome not Jacob!");
        }
        
        //Check how old are you
        System.out.print("How old are you?: ");
        int age = scan.nextInt();

        if (age < 18 ) {
            System.out.println(name + " You're too young to vote because you are " + age);
        } else {
            System.out.println(name + " You're allowed to vote because you are " + age);
        }

        //Check if they have pets

        System.out.print("Do you own pets? ");
        
        String answer = scan.nextLine();

        if (answer.equals("Yes")) {
            System.out.println("That's cool. Which pet do you have?");
            
            String petAns = scan.nextLine();
            if (petAns.equals("Cat")) {
                System.out.println("Cats are awesome!");
            } else if (petAns.equals("Dog")) {
                System.out.println("Dogs are okay.");
            } else if (petAns.equals("Bunny")) {
                System.out.println("Bunnies are cute.");
            } else {
                System.out.println("Your pet " + petAns + "is not cool");
            }
        } else {
            System.out.println(name + " get a pet, loser!");
        }

        //close the scanner 
        scan.close();

    }
    
}
