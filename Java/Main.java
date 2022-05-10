package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Uber");
        Car car = new Car("AMQ123 ", new Account("Andres Herrera", "AND123") );
        car.setPassenger(4);
        car.printDataCar();

        System.out.println("Uber X");
        UberX uberx = new UberX("SADA1453 ", new Account("Jose Rosero", "JORO650"), "Chevrolet", "Spark");
        uberx.setPassenger(4);
        uberx.printDataCar();

        System.out.println("Uber Van");
        UberVan uberVan = new UberVan("FGH523", new Account("Jairo Ramirez", "JARO943"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        System.out.println("User");
        User user = new User("Laura Otalora ", "LAOT3564 ", "Lato123@gmail.co ", "lau1234");
        user.printDataUser();
    }
}

