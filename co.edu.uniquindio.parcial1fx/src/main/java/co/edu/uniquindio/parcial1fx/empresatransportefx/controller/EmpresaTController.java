package co.edu.uniquindio.parcial1fx.empresatransportefx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.empresatransportefx.model.factory.ModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class EmpresaTController {

    private ModelFactory modelFactory;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnAgregarUsuario;

    @FXML
    private Button btnAgregarVehiculoCarga;

    @FXML
    private Button btnAgregarVehiculoPasajero;

    @FXML
    private Button btnObtenerMayoresEdad;

    @FXML
    private Button btnUsuariosMovilizadosVehiculoPasajero;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtColor;

    @FXML
    private TextField txtColorVehiculoPasajero;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtListaVehiculos;

    @FXML
    private TextField txtMarcaVehiculoPasajero;

    @FXML
    private TextField txtMaximoPasajeros;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtModeloVehiculoPasajero;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextField txtNumeroIdPropietario;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPlacaVehiculoPasajero;

    @FXML
    private TextField txtPropietario;

    @FXML
    private TextField txtPropietarioVehiculoPasajero;

    @FXML
    private TextArea txtResultadoAgregarPropietario;

    @FXML
    private TextArea txtResultadoAgregarUsuario;

    @FXML
    private TextArea txtResultadoAgregarVehiculoPasajero;

    @FXML
    private TextArea txtResultadoOperacionUsuario;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextArea txtResultadousuariosMovilizadosVehiculoPasajero;

    @FXML
    private TextField txtUsuariosAsociadosVehiculoPasajero;

    @FXML
    private TextField txtVehiculoAsociado;

    @FXML
    private TextField txtVehiculoPrincipal;

    @FXML
    void onAgregarPropietario(ActionEvent event) {
        agregarPropietario();

    }

    private void agregarPropietario() {
        String Resultado = modelFactory.crearPropietario(txtNombrePropietario.getText(), txtNumeroIdPropietario.getText(), txtEmailPropietario.getText(), txtCelularPropietario.getText(), txtVehiculoPrincipal.getText());
        txtResultadoAgregarPropietario.setText(Resultado);

    }

    @FXML
    void onAgregarUsuario(ActionEvent event) {
        String Resultado = modelFactory.crearUsuario(txtNombre.getText(), txtEdad.getText());
        txtResultadoAgregarUsuario.setText(Resultado);

    }

    @FXML
    void onAgregarVehiculoCarga(ActionEvent event) {

    }

    @FXML
    void onMostrarUsuariosMovilizados(ActionEvent event) {
        obtenerMovilizadosPorPlaca();

    }

    private void obtenerMovilizadosPorPlaca() {
        if(!txtPlacaVehiculoPasajero.getText().isEmpty()){
            String resultado = modelFactory.obtenerUsuariosMovilizadosPorPlaca(txtPlacaVehiculoPasajero.getText());
            txtResultadousuariosMovilizadosVehiculoPasajero.setText(resultado);
        }else{
            txtResultadousuariosMovilizadosVehiculoPasajero.setText("El campo está vacío, es requerido");
        }
    }

    @FXML
    void onObtenerMayoresEdad(ActionEvent event) {

    }

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();


    }
}

