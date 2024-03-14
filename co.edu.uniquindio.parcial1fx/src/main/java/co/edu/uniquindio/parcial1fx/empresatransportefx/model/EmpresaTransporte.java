package co.edu.uniquindio.parcial1fx.empresatransportefx.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private String nombre;

    private List<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private List<VehiculoPasajero> listaVehiculosPasajeros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Propietario> listaPropietarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(List<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public List<VehiculoPasajero> getListaVehiculosPasajeros() {
        return listaVehiculosPasajeros;
    }

    public void setListaVehiculosPasajeros(List<VehiculoPasajero> listaVehiculosPasajeros) {
        this.listaVehiculosPasajeros = listaVehiculosPasajeros;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaAsociados(List<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }



    @Override
    public String toString() {
        return "EmpresaTransporte{" +
                "nombre='" + nombre + '\'' +
                ", listaVehiculosCarga=" + listaVehiculosCarga +
                ", listaVehiculosPasajeros=" + listaVehiculosPasajeros +
                ", listaUsuarios=" + listaUsuarios +
                ", listaPropietarios=" + listaPropietarios +
                '}';
    }


    public String obtenerUsuariosMovilizadosPorPLaca(String placaVehiculoPasajero) {
        String resultado = "";

        for (VehiculoPasajero vehiculoPasajero : getListaVehiculosPasajeros()) {
            if (vehiculoPasajero.getPlaca().equalsIgnoreCase(placaVehiculoPasajero)) {
                resultado += vehiculoPasajero.toString()+"\n";
            }
        }
        return resultado;
    }

    public String crearPropietario(String nombre, String numeroid, String email, String celular, String VehiculoPrincipal) {
        Propietario propietario1 = new Propietario();
        propietario1.setNombre(nombre);
        propietario1.setNumeroIdentificacion(numeroid);
        propietario1.setEmail(email);
        propietario1.setNumeroCelular(celular);
        propietario1.setVehiculoPrincipal();


        // Devuelve una representación de cadena del propietario creado
        return propietario1.toString();
    }

    public String crearUsuario(String nombre, String edad) {
        Usuario usuario = new Usuario();
        usuario.setNombreUsuario(nombre);
        usuario.setEdad(Integer.parseInt(edad));

        return usuario.toString();
    }
}
