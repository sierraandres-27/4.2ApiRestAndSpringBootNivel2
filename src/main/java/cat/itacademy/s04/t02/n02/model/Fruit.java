package cat.itacademy.s04.t02.n02.model;


import jakarta.persistence.*;

@Entity
@Table(name="fruit")
public class Fruit {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @Column (name="cantidad_quilos")
    private int cantidadQuilos;

    public Fruit(){


    }

    public Fruit(int id, int cantidadQuilos, String name) {
        this.id = id;
        this.cantidadQuilos = cantidadQuilos;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCantidadQuilos() {
        return cantidadQuilos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCantidadQuilos(int cantidadQuilos) {
        this.cantidadQuilos = cantidadQuilos;
    }
}
