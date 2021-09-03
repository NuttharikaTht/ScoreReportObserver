package observer;

import java.util.ArrayList;

public class HeadQuater implements Source {
    private final ArrayList<MyRegistrar> list;
    private String score;

    public HeadQuater() {
        this.list = new ArrayList<MyRegistrar>();
    }
    public void setScore(String aData) {
        score = aData;
        notifyRegistrar();
    }
    public String getScore() {
	    return score;
    }

    @Override
    public void register (MyRegistrar registrar) {
        list.add(registrar);
    }
    @Override
    public void notifyRegistrar() {
        for (int j = 0; j < list.size(); ++j) {
            list.get(j).update(this);
	    }
    }
}
