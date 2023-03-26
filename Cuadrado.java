public class Cuadrado extends Cuadrilatero implements Forma{

    private double lado;

    Cuadrado() {
    }

    Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4) {

        setVertices(p1, p2, p3, p4);

        this.lado = Math.sqrt(Math.pow(p2.pos_x - p1.pos_x,2) + Math.pow(p2.pos_y - p1.pos_y,2));

    }

    public void dibujar_puntos() {

        System.out.println("Dibuja los puntos del cuadrado");

    }

    public void rellenar_forma() {

        System.out.println("Rellena la forma del cuadrado");

    }

    public double calcular_area() {

        double area = lado * lado;

        System.out.println("Área cuadrado: " + area);

        return area;

    }

    public double calcular_perimetro() {

        double perimetro = (lado * 4);

        System.out.println("Perímetro cuadrado: " + perimetro);

        return perimetro;
        
    }
}