

public class ServiceStation implements UpdateTyre {
    @Override
    public void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void updateTyre(Bicycle bicycle) {
        System.out.println("Меняем покрышку");
    }
    @Override
    public void updateTyre(Car car) {
        System.out.println("Меняем покрышку");
    }
    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int i = 0; i < car.getWheelsCount(); i++) {
            updateTyre(car);
        }
        car.checkEngine();
    }
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int i = 0; i < truck.getWheelsCount(); i++) {
            truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
    }
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int i = 0; i < bicycle.getWheelsCount(); i++) {
            bicycle.updateTyre();
        }
    }

}