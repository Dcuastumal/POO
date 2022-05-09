package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Uber");
        Car car = new Car("AMQ123 ", new Account("Andres Herrera", "AND123") );
        car.passegenger = 4;
        car.printDataCar();

        System.out.println("Uber X");
        UberX uberx = new UberX("SADA1453 ", new Account("Jose Rosero", "JORO650"), "Chevrolet", "Spark");
        uberx.passegenger = 4;
        uberx.printDataUberX();

        System.out.println("User");
        User user = new User("Laura Otalora", "LAOT3564", "Lato123@gmail.com", "lau1234");
        user.printDataUser();
    }
}

