package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "nume")
    private String nume;

    public Admin(){

    }

    public Admin(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                '}';
    }
}
