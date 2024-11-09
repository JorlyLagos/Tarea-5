
class Formas {

    
    public void establecerColor(String color) {
    }


    public void dibujar() {
        System.out.println("Dibujando una forma");
    }
}

class Circulo extends Formas {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    public double calcularRadio() {
        return this.radio;
    }

   
    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}


class Linea extends Formas {

    public Linea(double largo) {
    }

    
    @Override
    public void dibujar() {
        System.out.println("Dibujando una linea");
    }
}


class Triangulo extends Formas {
    private final double angulo;

    public Triangulo(double angulo) {
        this.angulo = angulo;
    }

    
    public double calcularArea() {
        return 0.5 * angulo; 
    }

   
    @Override
    public void dibujar() {
        System.out.println("Dibujando un triangulo");
    }
}

class Cuadrado extends Formas {
    private final double area;

    public Cuadrado(double area) {
        this.area = area;
    }

 
    public double calcularArea() {
        return this.area;
    }

    
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}


public class Main {
    public static void main(String[] args) {
      
        Circulo circulo = new Circulo(5.0);
        Linea linea = new Linea(10.0);
        Triangulo triangulo = new Triangulo(45.0);
        Cuadrado cuadrado = new Cuadrado(25.0);

       
        circulo.dibujar();
        System.out.println("Radio del circulo: " + circulo.calcularRadio());

        linea.dibujar();

        triangulo.dibujar();
        System.out.println("Area del triangulo: " + triangulo.calcularArea());

        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
    }
}
