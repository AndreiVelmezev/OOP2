public class Bicycle extends WheelableTransport implements Serviceble {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("We change the tire of the bike");
    }

    @Override
    public void check() {
        System.out.println("We serve " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}

