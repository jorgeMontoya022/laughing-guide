package co.edu.uniquindio.parcial1fx.empresatransportefx.model;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.builder.VehiculoCargaBuilder;

public class VehiculoCarga extends Vehiculo {

    private double capacidadCarga;
    private int numeroEjes;

    public VehiculoCarga(String placa, String modelo, String color, Propietario propietario, String marca, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, color, propietario, marca);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;


    }


    public double getCapacidadCarga() {
        return capacidadCarga;
    }


    public int getNumeroEjes() {
        return numeroEjes;
    }

    public static VehiculoCargaBuilder builder() {
        return new VehiculoCargaBuilder();
    }


    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadCarga=" + capacidadCarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}