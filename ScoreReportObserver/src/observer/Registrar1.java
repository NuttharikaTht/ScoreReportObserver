package observer;

public class Registrar1 implements MyRegistrar {
    @Override
    public void update(Source o) {
        System.out.println("live result: " + ((HeadQuater) o).getScore());
    }
}
