package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="";
	private int dni_numero=0;
	private char letra=' ';
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni=dni;
	}
	
	//REaliza el calculo
	public char devolverLetra(){
		return this.letra;
	}

}
