/* Create a Person Class  
 * 
*/
public class Person {

   String firstName = "Faith";
   String lastName = "Wilkins El";

   int age = 26;

   // Person to speak

   void speak() {
        System.out.println("Hello");
   }

   boolean isNameChanged(String changedName) {
       return this.firstName.equals(changedName);
   }

   String changeFirstName(String changedName) {
        this.firstName = changedName;

        System.out.println(this.firstName);
        return this.firstName;
   }

}