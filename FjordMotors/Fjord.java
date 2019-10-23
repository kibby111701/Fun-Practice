public class Fjord{
    public static void main(String[] args) {

        Car takk = new Car("Takk", "Sedan", 50, 8);
        Car beklager = new Car("Beklager", "Sedan", 40, 7.5);
        Car vakker = new Car("Vakker", "SUV", 60, 5);
        Car stygg = new Car("Stygg", "SUV", 55, 6);
        Car vanskellig = new Car("Vanskellig", "Truck", 65, 4.75);
        Car lastebill = new Car("Lastebill", "Truck", 70, 5.5);

        System.out.println(takk.meetsStandards());
        System.out.println(beklager.meetsStandards());
        System.out.println(vakker.meetsStandards());
        System.out.println(stygg.meetsStandards());
        System.out.println(vanskellig.meetsStandards());
        System.out.println(lastebill.meetsStandards());
        
    }


}