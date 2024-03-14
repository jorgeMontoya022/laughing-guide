package co.edu.uniquindio.parcial1fx.empresatransportefx.model;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.builder.VehiculoPasajeroBuilder;

import java.util.ArrayList;
import java.util.List;

public class VehiculoPasajero extends  Vehiculo {
    private int numeroMaximoPasajeros;
    private List<Usuario> listaUsuariosAsociados = new ArrayList<>();

    public VehiculoPasajero(String placa, String modelo, String color, Propietario propietario, String marca, int numeroMaximoPasajeros, List<Usuario>listaUsuariosAsociados) {
        super(placa, modelo, color, propietario, marca);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }




    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }
    public List<Usuario>getListaUsuariosAsociados(){
        return listaUsuariosAsociados;
    }

    public static VehiculoPasajeroBuilder builder(){
        return  new VehiculoPasajeroBuilder();
    }


    @Override
    public String toString() {
        return "VehiculoPasajero{" +
                "numeroMaximoPasajeros=" + numeroMaximoPasajeros +
                ", listaUsuariosAsociados=" + listaUsuariosAsociados+
                '}';
    }
}