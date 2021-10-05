public class Main {
    public static void main(String[] args) throws Exception {
        Driver d1 = new Driver("Nicolai", 20);
        Car c1 = new Car("Tesla", "Model S", 2021, "sports car");
        Car c2 = new Car("BMW", "i4", 2022, "Gran Coupe");

        c1.setDriver(d1);
        c2.setDriver(d1);

        System.out.println(c1.toString() + d1);
        System.out.println(c2.toString() + d1);
    }
}
