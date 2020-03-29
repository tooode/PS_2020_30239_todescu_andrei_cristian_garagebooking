package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "clienti")
public class Client {
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "masina")
    private List<Car> masini;
    @Column(name = "platitReparatie")
    private boolean platitReparatie;
    @Column(name = "suma")
    private int suma;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Client(){

    }

    public Client(int id, String nume, List<Car> masini, boolean platitReparatie, int suma, String phoneNumber) {
        this.id = id;
        this.nume = nume;
        this.masini = masini;
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

    public List<Car> getMasini() {
        return masini;
    }

    public void setMasini(List<Car> masini) {
        this.masini = masini;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", masini=" + masini +
                ", platitReparatie=" + platitReparatie +
                ", suma=" + suma +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

