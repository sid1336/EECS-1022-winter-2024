package lab6;
import java.util.Arrays;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name  : utkarsh sachdeva		
//Yorku Email : sid1336@my.yorku.ca
//Date : Marxh 16th, 2024
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////



public class Order {

    private Child[] listOfChildren;
    private int numberOfChildren;

    public Order() {
        this.listOfChildren = new Child[0];
        this.numberOfChildren = 0;
    }

    public int getNumofChilds() {
        return this.numberOfChildren;
    }

    public void addChildtoOrder(Child child) {
        if (this.listOfChildren.length < 5) {
            Child[] array = Arrays.copyOf(this.listOfChildren, this.listOfChildren.length + 1);
            array[array.length - 1] = child;
            this.listOfChildren = array;
            this.numberOfChildren++;
        }
    }

    public void removeChildfromOrder(Child child) {
        int index = -1;
        for (int i = 0; i < this.listOfChildren.length; i++) {
            if (this.listOfChildren[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Child[] newArray = new Child[this.listOfChildren.length - 1];
            for (int i = 0, j = 0; i < this.listOfChildren.length; i++) {
                if (i != index) {
                    newArray[j++] = this.listOfChildren[i];
                }
            }
            this.listOfChildren = newArray;
            this.numberOfChildren--;
        }
    }

    public Child[] getChildren() {
        return this.listOfChildren;
    }

    public String toString() {
        return "The order contains " + this.numberOfChildren + " Childs";
    }

    public Child[] getChilds() {
        if (numberOfChildren == 0) {
            return new Child[0]; // Return an empty array
        } else {
            return listOfChildren;
        }
    }
}


class Child {

    private String name;
    private int age;
    private Toy[] toys;
    private int numberOfToys;

    public Child(String name, int age, Toy[] toys) {
        this.name = name;
        this.age = age;

        if (toys != null) {
            this.toys = new Toy[toys.length];
            for (int i = 0; i < toys.length; i++) {
                Toy current = toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

    public int getNumberofToys() {
        return numberOfToys;
    }


    public int getChildAge() {
        return age;
    }

    public String getChildName() {
        return name;
    }
    public Toy[] getChildToy() {
        if(this.toys.length == 0) {
        	return null;
        }
        return toys;
    }


    public void setChildName(String name) {
        this.name = name;
    }

    public void setChildAge(int age) {
        this.age = age;
    }

    public void setChildToys(Toy[] toys) {
        if (toys != null) {
            this.toys = new Toy[toys.length];
            for (int i = 0; i < toys.length; i++) {
                Toy current = toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

    public String addToy(Toy toy) {
        for (int i = 0; i < numberOfToys; i++) {
            if (toys[i].getToyName().equals(toy.getToyName())) {
                toys[i].setToyQuantity(toys[i].getToyQuantity() + toy.getToyQuantity());
                return "Toy with the same name already exists. Toy is updated";
            }
        }

        Toy[] updatedToys = Arrays.copyOf(toys, toys.length + 1);
        updatedToys[toys.length] = toy;
        toys = updatedToys;
        numberOfToys++;
        return "Toy is added";
    }

    public void donate(Child recipient) {
        Toy[] combined = new Toy[toys.length + recipient.numberOfToys];
        System.arraycopy(toys, 0, combined, 0, numberOfToys);
        System.arraycopy(recipient.toys, 0, combined, numberOfToys, recipient.numberOfToys);
        recipient.setChildToys(combined);
        this.toys = new Toy[0];
        this.numberOfToys = 0;
    }

    public Child(Child other) {
        this.name = other.name;
        this.age = other.age;

        if (other.toys != null) {
            this.toys = new Toy[other.toys.length];
            for (int i = 0; i < other.toys.length; i++) {
                Toy current = other.toys[i];
                Toy toyCopy = new Toy(current.getToyID(), current.getToyName(), current.getToyQuantity(), current.getToyPrice());
                this.toys[i] = toyCopy;
            }
            this.numberOfToys = other.toys.length;
        } else {
            this.toys = new Toy[0];
            this.numberOfToys = 0;
        }
    }

    public void disposeToys() {
        this.toys = new Toy[0];
        this.numberOfToys = 0;
    }

    public String toString() {
        return "Child [" + name + "] of age <" + age + "> has (" + numberOfToys + ") toys";
    }
//
//	public int getNumberofToys() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	public Toy[] getChildToy() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

class Toy {

    private int id;
    private String name;
    private int quantity;
    private double price;

    public Toy(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getToyID() {
        return id;
    }

    public String getToyName() {
        return name;
    }

    public int getToyQuantity() {
        return quantity;
    }

    public double getToyPrice() {
        return price;
    }

    public String getToyInformation() {
        return "Toy(" + this.id + "," + this.name + "), quantity(" + this.quantity + ") with $(" + String.format(" %.2f", this.price) + ")/toy";
    }

    public void setToyID(int id) {
        this.id = id;
    }

    public void setToyName(String name) {
        this.name = name;
    }

    public void setToyQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setToyPrice(double price) {
        this.price = price;
    }
}
