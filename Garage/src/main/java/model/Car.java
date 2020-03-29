package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "masini")
public class Car {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "numarInmatriculare")
    private String numarInmatriculare;
    @Column(name = "proprietar")
    private Client proprietar;
    @Column(name = "marcaModel")
    private String marcaModel;
    @Column(name = "anFabricatie")
    private int anFabricatie;
    @Column(name = "nrKilomatrii")
    private int nrKilometrii;

    public Car(){

    }

    public Car(Client proprietar, String numarInmatriculare, String marcaModel, int anFabricatie, int nrKilometrii) {
        this.proprietar = proprietar;
        this.numarInmatriculare = numarInmatriculare;
        this.marcaModel = marcaModel;
        this.anFabricatie = anFabricatie;
        this.nrKilometrii = nrKilometrii;
    }

    public Client getProprietar() {
        return proprietar;
    }

    public void setProprietar(Client proprietar) {
        this.proprietar = proprietar;
    }

    public String getNumarInmatriculare() {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare) {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getMarcaModel() {
        return marcaModel;
    }

    public void setMarcaModel(String marcaModel) {
        this.marcaModel = marcaModel;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getNrKilometrii() {
        return nrKilometrii;
    }

    public void setNrKilometrii(int nrKilometrii) {
        this.nrKilometrii = nrKilometrii;
    }

    @Override
    public String toString() {
        return "Car{" +
                "proprietar=" + proprietar +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", marcaModel='" + marcaModel + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrKilometrii=" + nrKilometrii +
                '}';
    }
}
