package final_exam;

public class questions {

    public static void main(String[] args) {
        Car carA = new Car("KIA", 50);
        carA.incSpeed(20);
        carA.decSpeed(30);
        carA.incSpeed(50);

        System.out.println("Speed of carA: " + carA.getSpeed());
    }
}

class Car {
    private static long carNumber = 0;
    private String model;
    private long carID;
    private int speed;

    public Car(String model, int speed) {
        carID = ++carNumber;
        this.model = model;
        this.speed = speed;
        carNumber = carID;
    }

    public void incSpeed(int value) {
        if (value < 0)
            speed -= -value;
        else
            speed += value;
    }

    public void decSpeed(int value) {
        if (value < 0)
            speed -= -value;
        else
            speed -= value;
    }

    // Getter for speed to display it in the main method
    public int getSpeed() {
        return speed;
    }
}

