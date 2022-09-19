/*
 * @author NeuenMartinez
 * Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo 
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro 
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al 
usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en 
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa 
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la 
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona 
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la 
función devuelve un 1. 
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve 
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es 
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package POOej07;

import Entidades07.Persona;
import Servicios07.PersonaService;

public class POOej07 {

    public static void main(String[] args) {
        double bajo = 0;
        double ok = 0;
        double sobre = 0;
        double mayor = 0;
        double menor = 0;
        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();
        switch (ps.calcularIMC(p1)) {
            case -1:
                System.out.println(p1.getNombre() + " esta por debajo del peso ideal.");
                bajo++;
                break;
            case 0:
                System.out.println(p1.getNombre() + " esta en su peso ideal.");
                ok++;
                break;
            default:
                System.out.println(p1.getNombre() + " esta por encima de su peso ideal.");
                sobre++;
                break;
        }
        if (ps.mayorDeEdad(p1) == true) {
            mayor++;
        } else {
            menor++;
        }
        Persona p2 = ps.crearPersona();
        switch (ps.calcularIMC(p2)) {
            case -1:
                System.out.println(p2.getNombre() + " esta por debajo del peso ideal.");
                bajo++;
                break;
            case 0:
                System.out.println(p2.getNombre() + " esta en su peso ideal.");
                ok++;
                break;
            default:
                System.out.println(p2.getNombre() + " esta por encima de su peso ideal.");
                sobre++;
                break;
        }
        if (ps.mayorDeEdad(p2) == true) {
            mayor++;
        } else {
            menor++;
        }
        Persona p3 = ps.crearPersona();
        switch (ps.calcularIMC(p3)) {
            case -1:
                System.out.println(p3.getNombre() + " esta por debajo del peso ideal.");
                bajo++;
                break;
            case 0:
                System.out.println(p3.getNombre() + " esta en su peso ideal.");
                ok++;
                break;
            default:
                System.out.println(p3.getNombre() + " esta por encima de su peso ideal.");
                sobre++;
                break;
        }
        if (ps.mayorDeEdad(p3) == true) {
            mayor++;
        } else {
            menor++;
        }
        Persona p4 = ps.crearPersona();
        switch (ps.calcularIMC(p4)) {
            case -1:
                System.out.println(p4.getNombre() + " esta por debajo del peso ideal.");
                bajo++;
                break;
            case 0:
                System.out.println(p4.getNombre() + " esta en su peso ideal.");
                ok++;
                break;
            default:
                System.out.println(p4.getNombre() + " esta por encima de su peso ideal.");
                sobre++;
                break;
        }
        if (ps.mayorDeEdad(p4) == true) {
            mayor++;
        } else {
            menor++;
        }

        System.out.println("El " + (bajo / 4 * 100) + "% de las personas esta por debajo de su peso ideal");
        System.out.println("El " + (ok / 4 * 100) + "% de las personas esta en su peso ideal");
        System.out.println("El " + (sobre / 4 * 100) + "% de las personas esta por encima de su peso ideal");
        System.out.println("El " + (mayor / 4 * 100) + "% de las personas es mayor de edad");
    }

}
