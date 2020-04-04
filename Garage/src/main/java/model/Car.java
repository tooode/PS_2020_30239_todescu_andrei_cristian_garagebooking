package model;

public class Car {

    private int id;
    private String numarInmatriculare;
    private int idproprietar;
    private String marcaModel;
    private int anFabricatie;
    private int nrKilometrii;//oare incap pe int?:))

    public Car(){

    }

    public Car(int id, String numarInmatriculare, int idproprietar, String marcaModel, int anFabricatie, int nrKilometrii) {
        this.id = id;
        this.numarInmatriculare = numarInmatriculare;
        this.idproprietar = idproprietar;
        this.marcaModel = marcaModel;
        this.anFabricatie = anFabricatie;
        this.nrKilometrii = nrKilometrii;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdproprietar() {
        return idproprietar;
    }

    public void setIdproprietar(int idproprietar) {
        this.idproprietar = idproprietar;
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
                "id=" + id +
                ", numarInmatriculare='" + numarInmatriculare + '\'' +
                ", idproprietar=" + idproprietar +
                ", marcaModel='" + marcaModel + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrKilometrii=" + nrKilometrii +
                '}'+"\n";
    }
}
