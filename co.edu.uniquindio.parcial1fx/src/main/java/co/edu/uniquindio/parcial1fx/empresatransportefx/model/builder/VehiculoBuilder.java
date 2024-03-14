package co.edu.uniquindio.parcial1fx.empresatransportefx.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.Propietario;
import co.edu.uniquindio.parcial1fx.empresatransportefx.model.Usuario;
import co.edu.uniquindio.parcial1fx.empresatransportefx.model.Vehiculo;

import java.util.List;

public class VehiculoBuilder<T extends VehiculoBuilder<T>> {

    protected Propietario propietario;
    protected String placa;
    protected String modelo;
    protected String color;
    protected String marca;


    public T propietario(Propietario propietario) {
        this.propietario = propietario;
        return self();
    }

    public T placa(String placa) {
        this.placa = placa;
        return self();
    }

    public T modelo(String modelo) {
        this.modelo = modelo;
        return self();
    }

    public T color(String color) {
        this.color = color;
        return self();
    }

    public T marca(String marca) {
        this.marca = marca;
        return self();
    }


    @SuppressWarnings("unchecked")
    protected T self() {
        return (T) this;
    }

    public Vehiculo build(List<Usuario> listaUsuariosAsociados) {
        return new Vehiculo(placa, modelo, color, propietario, marca);
    }

}
