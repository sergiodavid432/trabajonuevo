public class Prostitutas {
    private String raza;
    private String sexo;
    private double presupuesto;
    private double pago;
    private double numeroDeProstitutas;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getNumeroDeProstitutas() {
        return numeroDeProstitutas;
    }

    public void setNumeroDeProstitutas(double numeroDeProstitutas) {
        this.numeroDeProstitutas = numeroDeProstitutas;
    }

    public void restarPresupuesto(double cantidad) {
        presupuesto -= cantidad;
    }
}

