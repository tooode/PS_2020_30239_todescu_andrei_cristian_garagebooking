package architecture;

import java.util.ArrayList;

public class GarageObserver {
    private String msg;
    private ArrayList<Observator> observers = new ArrayList<>();
    /**
     * Insert observer
     * @param o
     */
    public void addObserver(Observator o){
        this.observers.add(o);
    }
    /**
     * Delete observer
     * @param o
     */
    public void removeObserver(Observator o){
        this.observers.remove(o);
    }
    /**
     * Set message
     * @param msg
     */
    public void setMsg(String msg){
        this.msg = msg;
        for(Observator observer : observers)
            observer.update(msg);
    }
}
