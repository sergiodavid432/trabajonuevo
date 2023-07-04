public class Prostituta {
    private String raza;
    private String genero;
    private int numeroDeProstitutas;
    private double costo;
    private double vueltas;
    private String metodoPago;

    public Prostituta(String raza, String genero, int numeroDeProstitutas, double costo, double vueltas, String metodoPago) {
        this.raza = raza;
        this.genero = genero;
        this.numeroDeProstitutas = numeroDeProstitutas;
        this.costo = costo;
        this.vueltas = vueltas;
        this.metodoPago = metodoPago;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumeroDeProstitutas() {
        return numeroDeProstitutas;
    }

    public void setNumeroDeProstitutas(int numeroDeProstitutas) {
        this.numeroDeProstitutas = numeroDeProstitutas;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getVueltas() {
        return vueltas;
    }

    public void setVueltas(double vueltas) {
        this.vueltas = vueltas;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}