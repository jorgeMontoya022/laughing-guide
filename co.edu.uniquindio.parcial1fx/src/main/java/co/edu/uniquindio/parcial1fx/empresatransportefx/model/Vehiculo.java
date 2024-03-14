package co.edu.uniquindio.parcial1fx.empresatransportefx.model;

public class Vehiculo {
    private Propietario propietario;
    private String placa;
    private String modelo;
    private String color;
    private String marca;


    public Vehiculo(String placa, String modelo, String color,  Propietario propietario, String marca) {
        this.propietario = propietario;
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;

    }

    public  Propietario getPropietario(){
        return  propietario;
    }

    public String getPlaca() {
        return placa;
    }


    public String getModelo() {
        return modelo;
    }


    public String getColor() {
        return color;
    }

    public String getMarca(){
        return marca;
    }


    @Override
    public String toString() {
        return "Vehiculo{" +
                "propietario=" + propietario +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
