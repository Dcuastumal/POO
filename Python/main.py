from UberBlack import UberBlack
from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS123", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("DFG567", Account("Jesus Rosero", "JESU123"))
    print(vars(car2))
    print(vars(car2.driver))

    car3 = UberBlack("DFG1234", Account("Julian Ramirez", "JURA123"), "Ferrary", "Cuero" )
    print(vars(car3))
    print(vars(car3.driver))