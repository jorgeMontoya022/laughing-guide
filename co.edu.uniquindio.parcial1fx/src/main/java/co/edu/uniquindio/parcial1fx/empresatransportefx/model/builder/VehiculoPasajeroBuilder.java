package co.edu.uniquindio.parcial1fx.empresatransportefx.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.Usuario;
import co.edu.uniquindio.parcial1fx.empresatransportefx.model.VehiculoPasajero;

import java.util.List;

public class VehiculoPasajeroBuilder extends  VehiculoBuilder<VehiculoPasajeroBuilder> {
    private int numeroMaximoPasajeros;
    private List<Usuario> listaUsuariosAsociados;

    public VehiculoPasajeroBuilder numeroMaximoPasajeros(int numeroMaximoPasajeros){
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
        return this;
    }

    public VehiculoPasajeroBuilder listaUsuariosAsociados(List<Usuario>listaUsuariosAsociados){
        this.listaUsuariosAsociados = listaUsuariosAsociados;
        return   this;
    }

    public VehiculoPasajero build(){
        return  new VehiculoPasajero(placa, modelo, color, propietario, marca, numeroMaximoPasajeros, listaUsuariosAsociados);
    }

    @Override
    protected VehiculoPasajeroBuilder self(){
        return this;
    }

}