/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploauto127;

import java.util.ArrayList;
import java.util.List;

public class Concesionario {
    private List<Auto> autos;

    public Concesionario() {
        autos = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) throws AutoRepetidoException {
        if (autos.contains(auto)) {
            throw new AutoRepetidoException();
        }
        autos.add(auto);
    }

    public void listarAutos() {
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public void removerAuto(Auto auto) {
        autos.remove(auto);
    }

    public void removerAuto(String patente) {
        autos.removeIf(auto -> auto.getPatente().equals(patente));
    }
}

