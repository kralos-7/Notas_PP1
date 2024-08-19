/**
 * Clase Persona
 * Contiene información de una persona
 * @author DiscoDurodeRoer
 */
public class Persona {

    //Atributos
    /**
     * Nombre de la persona
     */
    private String nombre;

    /**
     * Edad de la persona
     */
    private int edad;

    /**
     * DNI de la persona, se genera al construir el objeto
     */
    private String DNI;

    /**
     * Sexo de la persona, true hombre false mujer
     */
    private boolean sexo;

    /**
     * Peso de la persona
     */
    private double peso;

    /**
     * Altura de la persona
     */
    private double altura;

    //Contructores
    /**
     * Constructor por defecto
     */
    public Persona() {
        this("Sin nombre", 0, true, 0, 0);
    }

    /**
     * Constructor con 3 parametroe
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     */
    public Persona(String nombre, int edad, boolean sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    /**
     * Constructor con 5 parametros
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param peso de la persona
     * @param altura de la persona
     */
    public Persona(String nombre, int edad, boolean sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    //Métodos privados
    private void comprobarSexo() {

        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != true && sexo != false) {
            this.sexo = true;
        }
    }

    private void generarDni() {
        final int divisor = 23;

        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);

        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);

        //Pasamos el DNI a String
        DNI = Integer.toString(numDNI) + letraDNI;
    }

    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return letras[res];
    }

    //Métodos publicos
    /**
     * Modifica el nombre de la persona
     *
     * @param nombre a cambiar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Modifica la edad de la persona
     *
     * @param edad a cambiar
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Modifica el sexo de la persona, comprueba que es correcto
     *
     * @param sexo a cambiar
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * Modifica el peso de la persona
     *
     * @param peso a cambiar
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Modifica la altura de la persona
     *
     * @param altura a cambiar
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Calcula el indice de masa corporal
     *
     * @return codigo numerico
     * <ul><li>-1: la persona esta por debajo de su peso ideal</li>
     * <li>0: la persona esta en su peso ideal</li>
     * <li>1: la persona esta por encima de su peso ideal</li></ul>
     */
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        if (pesoActual >= 20 && pesoActual <= 25) {
            return 1;
        } else if (pesoActual < 20) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Indica si la persona es mayor de edad
     *
     * @return true si es mayor de edad y false es menor de edad
     */
    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    /**
     * Devuelve informacion del objeto
     *
     * @return cadena con toda la informacion
     */
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == true) {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

}