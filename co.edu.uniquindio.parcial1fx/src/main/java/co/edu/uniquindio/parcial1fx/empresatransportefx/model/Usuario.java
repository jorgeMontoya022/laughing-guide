package co.edu.uniquindio.parcial1fx.empresatransportefx.model;

public class Usuario {

    private VehiculoPasajero vehiculoAsociado;
    private String nombreUsuario;
    private int edad;

    public Usuario(VehiculoPasajero vehiculoAsociado, String nombreUsuario, int edad){
        this.vehiculoAsociado = vehiculoAsociado;
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
    }

    public Usuario(){

    }

    public VehiculoPasajero getVehiculoAsociado(){
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoPasajero vehiculoAsociado){
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdad(){
        return  edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "vehiculoAsociado=" + vehiculoAsociado +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", edad=" + edad +
                '}';
    }
}
