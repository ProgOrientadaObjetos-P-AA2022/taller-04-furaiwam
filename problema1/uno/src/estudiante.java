package problema1.uno.src;

public class estudiante {
        private String estudiante;
        private double materia1;
        private double materia2;
        private double materia3;
        private double promedio;

        public estudiante() {
            estudiante = "Carlos Jaramillo";
            materia1 = 9.00;
            materia2 = 2.00;
            materia3 = 10.00;
        }

        public estudiante(String x, double a, double b, double c) {
            estudiante = x;
            materia1 = a;
            materia2 = b;
            materia3 = c;
        }

        public void establecerNombre(String c) {
            estudiante = c;
        }

        public void establecerMateria1(double c) {
            materia1 = c;
        }

        public void establecerMateria2(double c) {
            materia2 = c;
        }

        public void establecerMateria3(double c) {
            materia3 = c;
        }

        public void calcularPromedio() {
            promedio = (materia1 + materia2 + materia3) / 3;
        }

        public String obternerNombre() {
            return estudiante;
        }

        public double obtenerMateria1() {
            return materia1;
        }

        public double obtenerMateria2() {
            return materia2;
        }

        public double obtenerMateria3() {
            return materia3;
        }

        public double obtenerPromedio() {
            return promedio;
        }

        @Override
        public String toString() {
            String cadena = "";
            cadena = String.format("%s%s\nNota1: %.2f\nNota2: %.2f\nNota3: %.2f\n"
                            + "Promedio: %.2f",
                    cadena, estudiante, materia1, materia2, materia3, promedio);
            return cadena;
        }
}
