package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "mecanici")
public class Mechanic {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nume")
    private String nume;
    @Column(name = "listaMasini")
    private Set<Car> listaMasini;

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

    public Set<Car> getListaMasini() {
        return listaMasini;
    }

    public void setListaMasini(Set<Car> listaMasini) {
        this.listaMasini = listaMasini;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", listaMasini=" + listaMasini +
                '}';
    }
}
