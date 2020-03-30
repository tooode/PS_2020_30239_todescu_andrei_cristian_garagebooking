package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clienti")
public class User {
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "platitReparatie")
    private boolean platitReparatie;
    @Column(name = "suma")
    private int suma;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "type")
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

