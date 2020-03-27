package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clienti")
public class Client {
    @Id
    @Column(name = "Id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "masina")
    private Car masina;
    @Column(name = "platitReparatie")
    private boolean platitReparatie;
    @Column(name = "Suma")
    private int suma;

    public Client(){

    }

    public Client(int id, String nume, Car masina, boolean platitReparatie, int suma) {
        this.id = id;
        this.nume = nume;
        this.masina = masina;
        this.platitReparatie = platitReparatie;
        this.suma = suma;
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

    public Car getMasina() {
        return masina;
    }

    public void setMasina(Car masina) {
        this.masina = masina;
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

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", masina=" + masina +
                ", platitReparatie=" + platitReparatie +
                ", suma=" + suma +
                '}';
    }
}
