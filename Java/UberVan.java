package Java;

import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> SeatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted, ArrayList<String> SeatsMaterial){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.SeatsMaterial = SeatsMaterial;
    }

    public UberVan(String license, Account driver){
        super(license, driver);
        
    }

    @Override
    public void setPassenger(Integer passenger) {
        if(passenger == 6){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}