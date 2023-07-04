
public class Calle {
    private String nombre;
    private Prostitutas prostitutas;

    public Calle(String nombre, Prostitutas prostitutas) {
        this.nombre = nombre;
        this.prostitutas = prostitutas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Prostitutas getProstitutas() {
        return prostitutas;
    }

    public void setProstitutas(Prostitutas prostitutas) {
        this.prostitutas = prostitutas;
    }
}
