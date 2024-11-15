/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploauto127;

public class GuiaPlay {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        try {
            // Crear algunos autos
            Auto auto1 = new Auto("ABC123", "Toyota", 2020);
            Auto auto2 = new Auto("DEF456", "Honda", 2019);
            Auto auto3 = new Auto("GHI789", "Ford", 2021);
            Auto autoDuplicado = new Auto("ABC123", "Chevrolet", 2022);

            // Agregar los autos al concesionario
            concesionario.agregarAuto(auto1);
            concesionario.agregarAuto(auto2);
            concesionario.agregarAuto(auto3);
            
            // Intentar agregar un auto con patente duplicada
            try {
                concesionario.agregarAuto(autoDuplicado);
            } catch (AutoRepetidoException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Listar los autos en el concesionario
            System.out.println("Lista de autos en el concesionario:");
            concesionario.listarAutos();

            // Eliminar un auto por su patente
            concesionario.removerAuto("DEF456");
            System.out.println("\nLista de autos después de eliminar el auto con patente DEF456:");
            concesionario.listarAutos();

        } catch (AutoRepetidoException e) {
            System.out.println("Ocurrió un error al agregar un auto: " + e.getMessage());
        }
    }
}

