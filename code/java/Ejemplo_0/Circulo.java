package Ejemplo_0;

class Circulo {

    // Atributo
    double radio;

    // Método para calcular el área del círculo
    double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    // Sobrecarga del método para calcular el perímetro del círculo
    double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }

    /**
     * Ejercicio 0
     * @return
     */
    // Sobrecarga del método para calcular el perímetro del círculo
    double calcularPerimetro(double valorPI){
        return 2 * valorPI * radio;
    }

    // Sobrecarga del método para establecer el radio del círculo
    void setRadio(double nuevoRadio){
        radio = nuevoRadio;
    }
    
    // Sobrecarga del método para establecer el radio con un valor por defecto
    void setRadio(){
        radio = 1.0; // valor por defecto si no se proporciona un nuevo radio
    }

    public static void main(String[] args) {

        // Se instancia la clase Circulo
        Circulo miCirculo = new Circulo();

        // Se asigna un valor al atributo radio
        miCirculo.radio = 1.0;

        // Se muestra el resultado de los métodos sobrecargados
        System.out.println("Perimetro sin cambiar los valores de PI y de radio : "+ miCirculo.calcularPerimetro());
        miCirculo.setRadio(10.5); // cambia el valor de radio
        System.out.println("Perimetro con cambios de los valores de PI y de radio : "+ miCirculo.calcularPerimetro(3.1416));

    }
}
