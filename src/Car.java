public class Car extends WheelableTransport implements Serviceble, Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Servicing the car " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    @Override
    public void updateTyre() {
        System.out.println("We change the tire of the car");
    }

    @Override
    public void checkEngine() {
        System.out.println("We check the engine of the car");
    }
}