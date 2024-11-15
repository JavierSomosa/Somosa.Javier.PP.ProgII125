/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploauto127;

public class AutoRepetidoException extends Exception {
    private static final String MESSAGE = "El auto con esta patente ya está registrado en el concesionario.";

    public AutoRepetidoException() {
        super(MESSAGE);
    }
}
