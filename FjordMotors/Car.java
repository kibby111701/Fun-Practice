public class Car{
    private String model;
    private String type;

    private double tankSize;
    private double time;

    public static final double LITERS_TO_GALLONS = 0.264172;
    public static final double TEST_SPEED = 60.0;

    public Car(String model, String type, double tankSize, double time){
        this.model = model;
        this.type = type;
        this.tankSize = tankSize;
        this.time = time;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    private double convertTank(double tankSize){
        return LITERS_TO_GALLONS * tankSize;

    }

    public double milesPerGallon(){
        return (TEST_SPEED * time)/convertTank(tankSize);
    }

    public String meetsStandards(){
        if (type.equals("Sedan") && milesPerGallon() >= 50){
            return model + " meets standards";
        }
        else if (type.equals("SUV") && milesPerGallon() >= 40){
            return model + " meets standards";
        }
        else if (type.equals("Truck") && milesPerGallon() >= 30){
            return model + " meets standards";
        }
        else{
            return model + " does not meet standards";
        }
    }




}