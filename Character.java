/*
 * Challenge Assignment
 * 
 * Create a class called Character and do the following:
 * 1. Give the Character a name variable
 *      Give the character a level variable
 *      Give the character a points variable
 * 2. Make 3 methods for actions (i.e. run(), jump(), etc.)
 * 3. Implement if-else logic in a method called checkLevel()
 *      to check the level. If the level is greater than 50, add 25 points to 
 *      their points variable. 
 * 
 */

 public class Character {
    // Variables for the character's name, level, and points
    public String name;
    public int level;
    public int points;

    // Constructor to initialize the character
    public Character(String name, int level, int points) {
        this.name = name;
        this.level = level;
        this.points = points;
    }

    // Method for the character to run
    public void run() {
        System.out.println(name + " is running!");
    }

    // Method for the character to jump
    public void jump() {
        System.out.println(name + " is jumping!");
    }

    // Method for the character to attack
    public void attack() {
        System.out.println(name + " is attacking!");
    }

    // Method to check the level and update points
    public void checkLevel() {
        if (level > 50) {
            points += 25;
            System.out.println(name + " has leveled up! 25 points added.");
        } else {
            System.out.println(name + " needs more experience to level up.");
        }
    }

    // Main method to test the Character class
    public static void main(String[] args) {
        // Creating a Character object
        Character myCharacter = new Character("Hero", 55, 100);
        
        // Display initial character status
        System.out.println("Initial Points: " + myCharacter.points);
        
        // Perform actions
        myCharacter.run();
        myCharacter.jump();
        myCharacter.attack();
        
        // Check level and update points
        myCharacter.checkLevel();
        
        // Display final character status
        System.out.println("Final Points: " + myCharacter.points);
        
        // Create to increase the points
        int i = 1;

        while( i <= 6) {
            myCharacter.checkLevel();
            i = i + 1; //i++
        }
        System.out.println("Loop Final Points: " + myCharacter.points);

        //FOR -LOOP 
        for (int k=1 ; k <= 6; k++){
            myCharacter.checkLevel();
        }

        System.out.println("Loop Final Points: " + myCharacter.points);

    }
}

