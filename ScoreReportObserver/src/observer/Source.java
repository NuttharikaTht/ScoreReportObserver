package observer;

public interface Source {
    public void notifyRegistrar ();
    public void register (MyRegistrar registrar);
}