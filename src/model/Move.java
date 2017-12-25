package model;
import contract.PrototypeCapable;

public class Move implements PrototypeCapable{
	
	private String name = null;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public Move clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie object..");
        return (Move) super.clone();
    }
    @Override
    public String toString() {
        return "Movie";
    }

}
