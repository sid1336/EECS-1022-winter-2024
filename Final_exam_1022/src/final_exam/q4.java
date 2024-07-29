package final_exam;

public class q4 {

	public static class BscPoint {
	    private int x;
	    private int y;

	    public BscPoint(int x) {
	        this(x, 4); // Sets x to the given value and y to 4
	    }

	    public BscPoint(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public BscPoint(BscPoint a) {
	        this(a.getY(), a.getX()); // Swaps x and y from the given object
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }

	    public static void doSomething(BscPoint a1, BscPoint a2) {
	        BscPoint t = a1;
	        a1 = a2;
	        a2 = t;
	    }

	    public static void main(String[] args) {
	        BscPoint p = new BscPoint(40);
	        BscPoint q = new BscPoint(p);

	        p.setX(30);
	        q.setY(10);

	        BscPoint.doSomething(p, q);

	        System.out.println("The value of x in p is: " + p.getX()); // Prints the value of x
	    }
	}


}
