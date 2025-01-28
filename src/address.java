


public class address implements Cloneable {
    public String country;
    public String city;

    //parametric constructor
    public address(String city,String country ) {
        this.country = country;
        this.city = city;
    }

    public address() {

    }

    protected Object clone() throws CloneNotSupportedException {
        return (address) super.clone();
    }

    @Override
    public String toString() {
        return "Address[city=" + city + "," + "country=" + country + "]";
    }
}
