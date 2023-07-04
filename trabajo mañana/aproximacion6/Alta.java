public class Alta extends Prostituta {
    private String calle;
    private String barrio;
    private int direccion;

    public Alta(String raza, String genero, int numeroDeProstitutas, double costo, double vueltas, String metodoPago, String calle, String barrio, int direccion) {
        super(raza, genero, numeroDeProstitutas, costo, vueltas, metodoPago);
        this.calle = calle;
        this.barrio = barrio;
        this.direccion = direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }
}
