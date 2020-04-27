package model;



public class User {

    private int id;

    private String nume;

    private boolean platitReparatie;

    private int suma;

    private String phoneNumber;

    private String type;

    public User(){

    }

    public User(int id, String nume, boolean platitReparatie, int suma, String phoneNumber, String type) {
        this.id = id;
        this.nume = nume;
        this.platitReparatie = platitReparatie;
        this.suma = suma;
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public User(int id, String nume, boolean platitReparatie, int suma, String phoneNumber) {
        this.id = id;
        this.nume = nume;
        this.platitReparatie = platitReparatie;
        this.suma = suma;
        this.phoneNumber = phoneNumber;
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


    public boolean isPlatitReparatie() {
        return platitReparatie;
    }

    public void setPlatitReparatie(boolean platitReparatie) {
        this.platitReparatie = platitReparatie;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", platitReparatie=" + platitReparatie +
                ", suma=" + suma +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

