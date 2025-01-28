


public class user implements Cloneable {
    public String name;
    public String gender;
    public address addr;

    //parametric constructor
    public user(String name, String gender, address addr) {
        this.name= name;
        this.gender=gender;
        this.addr=addr;
    }

    //copy cons

    //String output method
    @Override
    public String toString() {
        return " User[name=" + name + ", gender=" + gender + ", addre=" + addr + "]";
    }

    protected Object clone() throws CloneNotSupportedException {
        user user = null;
        try {
            user = (user)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clonable not supported");
        }
        user.addr = (address) this.addr.clone();
        return user;
    }
}
