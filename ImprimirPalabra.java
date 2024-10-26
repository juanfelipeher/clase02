import java.util.Scanner;

public class ImprimirPalabra {
    public static void main(String[] args) {
       var Lector = new Scanner(System.in);

       System.out.println("Binvnido al Sistema");
        
System.out.println("Ingrese su Medio de Transporte Favorito");
String palabra1 = Lector.nextLine();

System.out.println("Escriba un Conector, ejemplo: Y, O");
String palabra2 = Lector.nextLine();

System.out.println("Escriba Otro Medio de Transporte");
String palabra3 = Lector.nextLine();


System.out.println(palabra1 + " " + palabra2 + " " + palabra3);


    }
    
}
