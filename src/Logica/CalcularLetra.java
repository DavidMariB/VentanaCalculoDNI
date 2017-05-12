package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularLetra {
	
	private String dni="";
	private int dni_numero=0;
	private char letrasDni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
	private char letra=' ';
	private int restoDni = 0;
	private String msgerror="";
	public boolean error=false;
	
	//El constructor recibe el DNI en formato String
	public CalcularLetra(String dni) {
		this.dni = dni;
		if(this.dni.length()==8 && isNumeric(this.dni)){
			//Pasamos el DNI que entra como un String a int
			this.dni_numero = Integer.parseInt(this.dni);
			
			//Sacamos el Resto del DNI entre 23
			this.restoDni = this.dni_numero%23;
			
			//Calculamos la letra 
			this.letra = this.letrasDni[this.restoDni];
		}else{
			//Esto indica un error si el usuario introduce mal el DNI
			this.msgerror = "El DNI introducido no es valido";
			this.error = true;
		}
	}
	
	//Devolvemos la letra
	public char devolverLetra(){
		return this.letra;
	}
	
	public String devolverError(){
		return this.msgerror;
	}
	
	//Comprueba que el DNI recibido sea un numero
	public static boolean isNumeric(String str){
	    try {
	      double d = Double.parseDouble(str);
	    }catch(NumberFormatException nfe){
	      return false;
	    }
	    return true;
	  }

}