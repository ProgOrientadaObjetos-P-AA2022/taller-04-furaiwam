package problema4;

public class Cheque {
    private String nombre;
    private String banco;
    private double valor;
    private double valorComision;

    public Cheque() {
        nombre = "Jose Val";
        banco = "Banco Bolivariano";
        valor = 8666886;
    }

    public Cheque(String a, String b, double c) {
        nombre = a;
        banco = b;
        valor = c;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerBanco(String c) {
        banco = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void calcularComision() {
        valorComision = (valor * 0.003) / 100;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double Comision() {
        return valorComision;
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = String.format("%sNombre del cliente: %s\nNombre del banco: %s\n"
                        + "Valor: %.2f\nValor de comision: %.2f",
                cadena, nombre, banco, valor, valorComision);
        return cadena;
    }
}
