public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado1 = new Cuadrado();

        Rectangulo rectangulo1 = new Rectangulo();

        Triangulo triangulo1 = new Triangulo();

        Forma[] arrayMain = new Forma[4];

        arrayMain[0] = cuadrado1;

        arrayMain[1] = rectangulo1;

        arrayMain[2] = triangulo1;

        arrayMain[3] = triangulo1;

        arrayMain[0].rellenar_forma();

        arrayMain[1].dibujar_puntos();

        arrayMain[2].calcular_area();

        arrayMain[3].calcular_perimetro();
        
    }
}