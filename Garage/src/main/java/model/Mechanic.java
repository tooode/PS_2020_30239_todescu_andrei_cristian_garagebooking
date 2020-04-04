package model;

import architecture.Observator;

public class Mechanic implements Observator {

    private int id;
    private String nume;
    private String message;
    public Mechanic(){

    }

    public Mechanic(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void update(String msg) {
        this.setMessage(msg);
        System.out.println(this.getMessage());
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }


    @Override
    public String toString() {
        return "Mechanic{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
