public class Rectangulo extends Cuadrilatero implements Forma{

    private double base;

    private double altura;

    Rectangulo() {
    }

    Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {

        setVertices(p1, p2, p3, p4);

        this.base = Math.sqrt(Math.pow(p4.pos_x - p1.pos_x,2) + Math.pow(p4.pos_y - p1.pos_y,2));

        this.altura = Math.sqrt(Math.pow(p2.pos_x - p1.pos_x,2) + Math.pow(p2.pos_y - p1.pos_y,2));
    }

    public void dibujar_puntos() {

        System.out.println("Dibuja los puntos del rectangulo");
    }

    public void rellenar_forma() {

        System.out.println("Rellenar la forma del rectangulo");
    }

    public double calcular_area() {

        double area = base * altura;

        System.out.println("Área rectángulo: " + area);
        return area;
    }

    public double calcular_perimetro() {

        double perimetro = (base * 2) + (altura * 2);

        System.out.println("Perímetro rectángulo: " + perimetro);
        
        return perimetro;
    }
}