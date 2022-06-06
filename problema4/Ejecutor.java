package problema4;

public class Ejecutor {
    public static void main(String[] args) {
        String nombre = "Maria Seline";
        String banco = "Banco Loja";
        double valor = 812;
        Cheque che1 = new Cheque();

        che1.calcularComision();
        Cheque che2 = new Cheque(nombre, banco, valor);
        che2.calcularComision();
        System.out.println(che1);
        System.out.println("------------");
        System.out.println(che2);
    }
}
