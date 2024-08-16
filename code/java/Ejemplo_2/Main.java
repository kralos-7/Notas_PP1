public class Main {

    public static void main(String[] args) {

        //Creamos los objetos
        Cuenta miCuenta = new Cuenta("Juan Perez");

        //Llamamos a los métodos
        miCuenta.setCantidad(10000);
        //Mostramos la informacion
        System.out.println(miCuenta);
		
		System.out.println("Se realiza un ingreso de 5000 \n");	
		if(miCuenta.ingresar(5000)){
			System.out.println("La cantidad ingreso a la cuenta exitosamente.\n");
		}else{
			System.out.println("La cantidad no se ingreso a la cuenta.\n");
		}
        //Mostramos la informacion
        System.out.println(miCuenta);
        
		//Llamamos a los métodos
		System.out.println("Se realiza un retiro de 8500 \n");
		double sobra = miCuenta.retirar(8500);
		System.out.println("Luego del retiro quedaron:" + sobra  + " \n");
        
		//Mostramos la informacion
        System.out.println(miCuenta);
    }

}
