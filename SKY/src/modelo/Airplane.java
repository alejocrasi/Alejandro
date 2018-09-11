package modelo;

public abstract class Airplane extends Vehicle implements Flayer{

	
	public abstract void takeOff();

	
	public abstract void land();

	
	public abstract void fly() ;

	public abstract void echarCombustible(String echar);
	
	public abstract void tipoAlas();
	
	

}
