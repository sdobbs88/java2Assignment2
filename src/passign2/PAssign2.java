/* Shaun Dobbs
 * CSCI 1302
 * Assignment 2
 * February 10, 2016
 * Purpose : Using a superclass, create four distinct vehicles from the 
 * original superclass
 */
public class PAssign2 {

    public static void main(String args[]) {
        // Create a generic vehicle   
        Vehicle myCar = new Vehicle(2013, "Toyota", "Camry");
        System.out.println(myCar.toString());

        // Create some buses   
        Bus myBus = new Bus(2006, "Mercedes-Benz", "Toursimo");
        myBus.setRouteStart("Downtown");
        myBus.setRouteEnd("Ogelthorpe Mall");
        myBus.setStartTime("8:30am");
        System.out.println(myBus.toString());
        Bus myBus2 = new Bus("Midtown", "Georgetown", "7:00am");
        System.out.println(myBus2.toString());

        // Create some garbage trucks   
        GarbageTruck myGTruck = new GarbageTruck();
        System.out.println(myGTruck.toString());
        GarbageTruck myRTruck = new GarbageTruck("Southside", "Monday", "Recycling");
        myRTruck.setModelYear(2016);
        myRTruck.setModel("King Cobra");
        System.out.println(myRTruck.toString());
    }
}   

class Vehicle {

    private double curbWeight;
    private double fuelCapacity;
    private int modelYear;

    private String make;
    private String model;

    /**
     * Constructors
     */
    public Vehicle() {
        setModelYear(2016);
        setMake("Honda");
        setModel("Civic");
        setCurbWeight(2500.0);
        setFuelCapacity(15.0);
    }

    public Vehicle(int modelYear, String make, String model) {
        this();
        setModelYear(modelYear);
        setMake(make);
        setModel(model);
    }

    public Vehicle(int modelYear, String make, String model, double curbWeight, double fuelCapacity) {
        this(modelYear, make, model);
        setCurbWeight(curbWeight);
        setFuelCapacity(fuelCapacity);
    }

    /**
     * * @return the curbWeight
     */
    public double getCurbWeight() {
        return curbWeight;
    }

    /**
     * * @param curbWeight the curbWeight to set
     */
    public void setCurbWeight(double curbWeight) {
        if (curbWeight > 0) {
            this.curbWeight = curbWeight;
        } else {
            this.curbWeight = 0;
        }
    }

    /**
     * * @return the fuelCapacity
     */
    public double getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(double fuelCapacity) {
        if (fuelCapacity > 0) {
            this.fuelCapacity = fuelCapacity;
        } else {
            this.fuelCapacity = 0;
        }
    }

    /**
     * * @return the modelYear
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * * @param modelYear the modelYear to set
     */
    public void setModelYear(int modelYear) {
        if (modelYear > 0 && modelYear <= 2016) {
            this.modelYear = modelYear;
        } else {
            this.modelYear = 2016;
        }
    }

    /**
     * * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * returns a textual description of the vehicle
     */
    @Override
    public String toString() {
        return "The vehicle is a " + getModelYear() + " " + getMake() + " "
                + getModel() + ", weighs " + getCurbWeight() + " pounds, and holds "
                + getFuelCapacity() + " gallons of fuel.";
    }
}


class Bus extends Vehicle {

    String routeStart;
    String routeEnd;
    String startTime;

    public Bus() {
        super();
        routeStart = "Westside";
        routeEnd = "Southside";
        startTime = "08:00";
    }

    public Bus(int modelYear, String make, String model) {
        super(modelYear, make, model);
        setModelYear(modelYear);
        setMake(make);
        setModel(model);

    }

    public Bus(String routeStart, String routeEnd, String startTime) {
        setModelYear(2009);
        setMake("Mercedes-Benz");
        setModel("Travego");
        setRouteStart(routeStart);
        setRouteEnd(routeEnd);
        setStartTime(startTime);
    }

    void setRouteStart(String routeStart) {
        this.routeStart = routeStart;
    }

    public String getRouteStart() {
        return routeStart;
    }

    void setRouteEnd(String routeEnd) {
        this.routeEnd = routeEnd;
    }

    public String getRouteEnd() {
        return routeEnd;
    }

    void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStartTime() {
        return startTime;
    }

    @Override
    public String toString() {
        String output;
        output = "The bus is a " + getModelYear() + " " + getMake() + " " + getModel()
        + ". It runs " + "from " + getRouteStart() + " to " + getRouteEnd() + " starting at " + getStartTime() + ".";
        
        return output;
    }
}


class GarbageTruck extends Vehicle {

    String operatingArea;
    String pickupDay;
    String pickupType;

    public GarbageTruck() {
        super();
        setModelYear(2015);
        setMake("New Ways");
        setModel("Cobra");
        operatingArea = "Southside";
        pickupDay = "Monday";
        pickupType = "Trash";
    }


    public GarbageTruck(String operatingArea, String pickupDay, String pickupType) {
        setModelYear(2015);
        setMake("New Ways");
        setOperatingArea(operatingArea);
        setPickupDay(pickupDay);
        setPickupType(pickupType);
    }

    public void setOperatingArea(String operatingArea) {
        this.operatingArea = operatingArea;
    }

    public String getOperatingArea() {
        return operatingArea;
    }

    public void setPickupDay(String pickupDay) {
        this.pickupDay = pickupDay;
    }

    public String getPickupDay() {
        return pickupDay;
    }

    public void setPickupType(String pickupType) {
        this.pickupType = pickupType;
    }

    public String getPickupType() {
        return pickupType;
    }

    @Override
    public String toString() {
        String output;
        output = "The truck is a " + getModelYear() + " " + getMake() + " " + getModel()
        + ". It runs in the " + getOperatingArea() + " area on " + getPickupDay() + " and picks up " + getPickupType() + ".";
        return output;
    }
} 

