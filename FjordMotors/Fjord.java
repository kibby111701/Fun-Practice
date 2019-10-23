public class Fjord{
    public static void main(String[] args) {

        Car takk = new Car("Takk", "Sedan", 40, 9.5);
        Car beklager = new Car("Beklager", "Sedan", 45, 7.5);
        Car vakker = new Car("Vakker", "SUV", 60, 7.5);
        Car stygg = new Car("Stygg", "SUV", 50, 9);
        Car vanskellig = new Car("Vanskellig", "Truck", 60, 8.75);
        Car lastebill = new Car("Lastebill", "Truck", 70, 5.5);

        System.out.println(takk.meetsStandards());
        System.out.println(beklager.meetsStandards());
        System.out.println(vakker.meetsStandards());
        System.out.println(stygg.meetsStandards());
        System.out.println(vanskellig.meetsStandards());
        System.out.println(lastebill.meetsStandards());
        
    }


}