package Servicios07;

import Entidades07.Persona;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class PersonaService {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean exit = false;

    public Persona crearPersona() {
        System.out.println("Nombre:");
        String nombre = leer.next();
        System.out.println("Edad:");
        int edad = leer.nextInt();
        System.out.println("Sexo: ('H' hombre, 'M' mujer, 'O' otro)");
        String aux = leer.next();
        do {
            if (aux.equalsIgnoreCase("H") || aux.equalsIgnoreCase("M") || aux.equalsIgnoreCase("O")) {
                String sexo = aux;
                exit = true;
            } else {
                System.out.println("La letra ingresada es incorrecta, intente de nuevo...");
                aux = leer.next();
                exit = false;
            }
        } while (exit == false);
        String sexo = aux;
        System.out.println("Ingresar su peso: (en KG)");
        double peso = leer.nextDouble();
        System.out.println("Ingresar su altura: (en Mts)");
        double altura = leer.nextDouble();
        return new Persona(nombre, edad, sexo, peso, altura);

    }

    public int calcularIMC(Persona p) {
        double IMC = p.getPeso() / (p.getAltura() * p.getAltura());
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean mayorDeEdad(Persona p) {
        return p.getEdad() >= 18;
    }
}
