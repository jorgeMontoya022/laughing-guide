package co.edu.uniquindio.parcial1fx.empresatransportefx.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder<VehiculoCargaBuilder> {

    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCargaBuilder capacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
        return this;
    }

    public VehiculoCargaBuilder numeroEjes(int numeroEjes){
        this.numeroEjes = numeroEjes;
        return this;
    }


    public VehiculoCarga build(){
        return new VehiculoCarga(placa, modelo, color, propietario, marca,  capacidadCarga, numeroEjes);
    }

    @Override
    protected VehiculoCargaBuilder self(){
        return this;
    }


}
