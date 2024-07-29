package lab5;

public class RideRequest {
    private String customerName;
    private String rideDetails;
    private double ridePrice;
    private boolean hasDiscount;

    private static double taxRate;
    private static double discountRate;
    private static int rideCounter;

    public RideRequest() {
        this.customerName = "";
        this.rideDetails = "";
        this.ridePrice = 0.0;
        this.hasDiscount = false;
    }

    public RideRequest(String input) {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }
        String[] parts = input.split(",");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Invalid input format");
        }
        this.customerName = parts[0].trim();
        this.rideDetails = parts[1].trim();
        this.ridePrice = Double.parseDouble(parts[2].trim());
        this.hasDiscount = parts[3].trim().equalsIgnoreCase("Y");
    }

    public RideRequest(RideRequest other) {
        if (other == null) {
            throw new IllegalArgumentException("Input RideRequest cannot be null");
        }
        this.customerName = other.customerName;
        this.rideDetails = other.rideDetails;
        this.ridePrice = other.ridePrice;
        this.hasDiscount = other.hasDiscount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName != null ? customerName.substring(0, Math.min(10, customerName.length())) : "";
    }

    public String getRideDetails() {
        return rideDetails;
    }

    public void setRideDetails(String rideDetails) {
        this.rideDetails = rideDetails != null ? rideDetails.trim() : "";
    }

    public double getRidePrice() {
        return ridePrice;
    }

    public void setRidePrice(double ridePrice) {
        this.ridePrice = ridePrice;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public static double getTaxrate() {
        return taxRate;
    }

    public static void setTaxrate(double rate) {
        taxRate = rate;
    }

    public static double getDiscount() {
        return discountRate;
    }

    public static void setDiscount(double rate) {
        discountRate = rate;
    }

    public static int getRideCounter() {
        return rideCounter;
    }

    @Override
    public String toString() {
        ++rideCounter;
        double priceWithTax;
        double discountedPrice;
        double totalPrice;


        priceWithTax = ridePrice * (1 + taxRate);

        if (hasDiscount) {
            discountedPrice = priceWithTax;
            totalPrice = discountedPrice - (discountedPrice * discountRate);
            return String.format(" %d. %-10s|%-25s|%-10.2f  |   %10.2f", 
                    rideCounter, customerName.trim(), rideDetails.trim(), discountedPrice, totalPrice);
            
        } else {
        	
            totalPrice = priceWithTax ;
            return String.format(" %d. %-10s|%-25s|%-10.2f  |", 
                    rideCounter, customerName.trim(), rideDetails.trim(), totalPrice);
        }
        
    




    }
    
}
