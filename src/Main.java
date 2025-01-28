import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        /*
        * Shallow Copy  vs  Deep Copy
        *
        * A deep copy is a complete copy of an object,
        * and will be able to modify any element individually
        * without affecting the original copy.
        *
        * A shallow copy is a copy of an object's reference, not the actual object itself.
        * Changes made to the nested objects affect both the original and copied object since they share the same references.
        * */
        address addre = new address("Chalatenango","El Salvador");
        user user1= new user("Brenda", "Female", addre);

        user user2= (user)user1.clone();


        System.out.println("Object 1" + user1.toString());
        System.out.println("Object 2" + user2.toString());

        user1.addr.country = "Honduras";
        System.out.println("===================After Changing City===================");

        System.out.println("Object 1" + user1.toString());
        System.out.println("Object 2" + user2.toString());


        System.out.println("===================ArrayList===================");


                // Original list
                ArrayList<String> original = new ArrayList<>();
                original.add("Hello");
                original.add("World");
                System.out.println("Original: " + original);

                // Shallow copy
                ArrayList<String> shallowCopy = original;
                shallowCopy.set(0, "Hi"); // Changes original too!
                System.out.println("Original (after shallow copy modification): " + original);
                System.out.println("Shallow copy: " + shallowCopy);

                // Deep copy
                ArrayList<String> deepCopy = new ArrayList<>(original);
                deepCopy.set(0, "Hola"); // Does NOT change the original
                System.out.println("Original (after deep copy modification): " + original);
                System.out.println("Deep Copy: " + deepCopy);



    }
}