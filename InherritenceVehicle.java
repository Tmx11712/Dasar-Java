class Vehicle {
    String name;

    void startEngine(){
        System.out.println(name + " StartEngine");
        
    }
}
class Car extends Vehicle {
    void drive(){
        System.err.println(name + " Drive");
    }

    //overdrive
    void StartEngine(){
        System.out.println("Car start Engine");
    }
}


public class InherritenceVehicle{
    public static void main(String[] args) {
       Vehicle vehicle= new Vehicle();
       vehicle.name ="Mobil";
       vehicle.startEngine();

       Car Car = new Car();
       Car.name = "Toyota";
       Car.startEngine();
       Car.drive();

    }
}