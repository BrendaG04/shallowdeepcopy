//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        address addre = new address("Chalatenango","El Salvador");
        user user1= new user("Brenda", "Female", addre);

        user user2= (user)user1.clone();


        System.out.println("Object 1" + user1.toString());
        System.out.println("Object 2" + user2.toString());

        user1.addr.country = "Honduras";
        System.out.println("===================After Changing City===================");

        System.out.println("Object 1" + user1.toString());
        System.out.println("Object 2" + user2.toString());

    }
}