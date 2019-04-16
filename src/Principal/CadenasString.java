package Principal;

public class CadenasString {
	public static void main(String[] args){
		
		// NUMEROS ENTEROS
		byte b= 127; // 1 byte - Desde el 0 hasta el 127 = son 128 numeros
		short corto= 32767; //  2 bytes
		int entero= 2147483647; // 4 bytes 
		long largo= 9223372036854775807L; // 8 bytes
		
		// NUMEROS DECIMALES
		float flotante= 5.5555555F; // 4 bytes  rango 1.40129846432481707e-45 to 3.40282346638528860e+38 (positive or negative).
		double doble= 5.1111; // 8 bytes rango 4.94065645841246544e-324d to 1.79769313486231570e+308d (positive or negative). 
		
		char caracter='a'; // 2 bytes  unsigned, Unicode, 0 to 65,535 
		
		boolean bool=true; // verdad y falso
		
		final float constante=3.14F; // constante no varia su valor
		
		String game="hoy estamos de gammer revisando los tipos de variables:"; // Es un objeto pertenece a la clase String
		
		System.out.println("Numero entero byte "+ b + " de 1 byte.");
		System.out.println("Numero entero short "+ corto + " de 2 bytes.");
		System.out.println("Numero entero int " + entero + " de 4 bytes.");
		System.out.println("Numero entero long " + largo + " de 8 bytes");
		System.out.println("Numero decimal float " + flotante + " de 4 bytes");
		System.out.println("Numero decimal double "+ doble + " de 8 bytes.");
		System.out.println("Numero Caracter char " + caracter + " de 2 bytes.");
		System.out.println("Dato Logico boolean "+ bool + " para evaluar condiciones.");
		System.out.println("Constante final " + constante + "definida.");
		
	}
}
