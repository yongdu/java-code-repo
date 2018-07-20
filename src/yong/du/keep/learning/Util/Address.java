package yong.du.keep.learning.Util;

public class Address {

    private int houseNumber;

    public Address(int husnummber) {
        this.houseNumber = husnummber;
    }
    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return this.houseNumber + " ";
    }
}
