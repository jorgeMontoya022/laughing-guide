package co.edu.uniquindio.parcial1fx.empresatransportefx.model.factory;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.*;

import java.util.ArrayList;
import java.util.List;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private EmpresaTransporte empresaTransporte;

    private ModelFactory() {
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();

    }

    public static ModelFactory getInstance() {
        if (modelFactory == null) {
            modelFactory = new ModelFactory();


        }
        return modelFactory;
    }

    private void inicializarDatos() {
        // Usuarios de
        List<Usuario> listaUsuariosAsociados1 = new ArrayList<>();
        List<Usuario> listaUsuariosAsociados2 = new ArrayList<>();
        // Vehículos
        List<VehiculoPasajero> listaVehiculosPasajeros = new ArrayList<>();

        // Propietarios
        List<Vehiculo> listaVehiculosAsociados = new ArrayList<>();

        // Crear vehículos de pasajeros
        VehiculoPasajero vehiculoPasajero1 = VehiculoPasajero.builder()
                .color("azul")
                .marca("Chevrolet")
                .modelo("2010")
                .placa("123QRP")
                .numeroMaximoPasajeros(10)
                .listaUsuariosAsociados(listaUsuariosAsociados1)
                .build();

        VehiculoPasajero vehiculoPasajero2 = VehiculoPasajero.builder()
                .color("blanco")
                .marca("hiunday")
                .modelo("2010")
                .placa("321PQA")
                .numeroMaximoPasajeros(12)
                .listaUsuariosAsociados(listaUsuariosAsociados2)
                .build();

        // Crear usuarios
        Usuario usuario1 = new Usuario();
        usuario1.setNombreUsuario("Jorge");
        usuario1.setEdad(21);
        usuario1.setVehiculoAsociado(vehiculoPasajero1);
        listaUsuariosAsociados1.add(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setNombreUsuario("Juana");
        usuario2.setEdad(32);
        usuario2.setVehiculoAsociado(vehiculoPasajero2);
        listaUsuariosAsociados2.add(usuario2);

        Usuario usuario3 = new Usuario();
        usuario3.setNombreUsuario("Blanca");
        usuario3.setEdad(19);
        usuario3.setVehiculoAsociado(vehiculoPasajero1);
        listaUsuariosAsociados1.add(usuario3);

        // Agregar usuarios y vehículos de pasajeros a la empresa de transporte
        empresaTransporte.getListaUsuarios().addAll(List.of(usuario1, usuario2));
        empresaTransporte.getListaVehiculosPasajeros().addAll(List.of(vehiculoPasajero1, vehiculoPasajero2));

        // Crear vehículo de carga
        VehiculoCarga vehiculoCarga1 = VehiculoCarga.builder()
                .capacidadCarga(234.4)
                .numeroEjes(4)
                .color("negro")
                .marca("sandero")
                .placa("432ERF")
                .modelo("2019")
                .build();

        // Agregar vehículo de carga a la empresa de transporte
        empresaTransporte.getListaVehiculosCarga().add(vehiculoCarga1);

        // Crear propietario
        Propietario propietario1 = new Propietario();
        propietario1.setNombre("William");
        propietario1.setEmail("william@gmail.com");
        propietario1.setNumeroCelular("3214565667");
        propietario1.setNumeroIdentificacion("1234567");
        propietario1.setVehiculoPrincipal(vehiculoCarga1);
        propietario1.setListaVehiculosAsociados(listaVehiculosAsociados);


        //Agregar el propietario a la empresa de transporte
        empresaTransporte.getListaPropietarios().add(propietario1);
    }


    public String obtenerUsuariosMovilizadosPorPlaca(String placaVehiculoPasajero) {
        return empresaTransporte.obtenerUsuariosMovilizadosPorPLaca(placaVehiculoPasajero);
    }

    public String crearPropietario(String nombre, String numeroid, String email, String celular, String vehiculoPrincipal) {
        return empresaTransporte.crearPropietario(nombre, numeroid, email, celular, vehiculoPrincipal);
    }

    public String crearUsuario(String nombre, String edad) {
        return empresaTransporte.crearUsuario(nombre, edad);
    }
}


