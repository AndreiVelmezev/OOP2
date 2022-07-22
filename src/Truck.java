public class Truck extends WheelableTransport implements Serviceble, Engineable {


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing the tire of the truck");
    }

    @Override
    public void checkEngine() {
        System.out.println("checking the engine of the truck");
    }

    private void checkTrailer() {
        System.out.println("Checking the trailer at the truck");
    }

    @Override
    public void check() {
        System.out.println("Servicing the truck " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
