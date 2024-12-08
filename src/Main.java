public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Truck truck = new Truck("Камаз", 8);
        serviceStation.check(truck);
        Vehicle [] vehicle=new Vehicle[6];
        vehicle[0] =new Car("car1", 4) ;
        vehicle[1]  = new Car("car2", 4);
        vehicle[2] = new Truck("truck1", 6);
        vehicle[3] = new Truck("truck2", 8);
        vehicle[4] = new Bicycle("bicycle1", 2);
        vehicle[5] = new Bicycle("bicycle2", 2);



        for (int i = 0; i < vehicle.length; i++) {
        serviceStation.check(vehicle[i]);

        }

    }




}