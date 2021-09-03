package observer;

public class Registrar2 implements MyRegistrar {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((HeadQuater) o).getScore());
    }
}
