from UberBlack import UberBlack
from car import Car
from account import Account
from UberBlack import UberBlack
from user import User

if __name__ == "__main__":
    print("Hola mundo")

    print("Uber 1")
    car = Car("AMS123", Account("Andres Herrera", "ANDA876"))
    print(vars(car))
    print(vars(car.driver))

    print("Uber 2")
    car2 = Car("DFG567", Account("Jesus Rosero", "JESU123"))
    print(vars(car2))
    print(vars(car2.driver))

    print("Uber Black")
    car3 = UberBlack("DFG1234", Account("Julian Ramirez", "JURA123"), "Ferrary", "Cuero" )
    print(vars(car3))
    print(vars(car3.driver))

    print("User")
    user = User("Rodrigo Dominguez", "RODO6732", "Rodi123@gmail.com", "rod765")
    print(vars(user))