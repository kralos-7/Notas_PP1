public class Cuenta{
	
	private String titular;
	private double cantidad;

	public Cuenta(){
		this.titular = "Sin nombre";
	}
	
	public Cuenta(String titular){
		this.titular = titular;
	}

	public void setCantidad(double cantidad){
		this.cantidad = cantidad;
	}
	
	public boolean ingresar(double cantidad){
		if(cantidad > 0){
			this.cantidad += cantidad;
			return true;
		}
		return false;
	}

	public double retirar(double cantidad){
		if(this.cantidad >= cantidad){
			return this.cantidad -= cantidad;
		}
		return this.cantidad;
	}
	
	public String toString() {
        return super.toString()+" - Titular:" + this.titular + " - Cantidad:" + this.cantidad + "\n" ;
    }
}
