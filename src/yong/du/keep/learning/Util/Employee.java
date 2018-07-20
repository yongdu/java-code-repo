package yong.du.keep.learning.Util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    /*
    *   @parameter Address is not an serializable object,
    *   keyword transient to ignore class fields during serialization
    */
    private transient Address address;
    private Person person;

    public Employee(Person person, Address address) {
        this.person = person;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(address.getHouseNumber());
    }

    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        Integer houseNumber = (Integer) ois.readObject();
        Address a = new Address(houseNumber);
        a.setHouseNumber(houseNumber);
        this.setAddress(a);
    }

    @Override
    public  String toString() {
        return this.person.toString() + this.address.toString();
    }

}
