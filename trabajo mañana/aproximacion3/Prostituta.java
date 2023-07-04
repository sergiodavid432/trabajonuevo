public class Prostituta {
    private String sexo;
    private String raza;
    private double presupuesto;
    private double pago;
    private int numeroDeProstitutas;

    public Prostituta(String sexo, String raza, double presupuesto, double pago, int numeroDeProstitutas) {
        this.sexo = sexo;
        this.raza = raza;
        this.presupuesto = presupuesto;
        this.pago = pago;
        this.numeroDeProstitutas = numeroDeProstitutas;
    }

 

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getNumeroDeProstitutas() {
        return numeroDeProstitutas;
    }

    public void setNumeroDeProstitutas(int numeroDeProstitutas) {
        this.numeroDeProstitutas = numeroDeProstitutas;
    }
}



