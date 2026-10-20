
package com.mycompany.gastossemanales;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextArea txtTotal;
    @FXML private TextField txtAlimentacion;
    @FXML private TextField txtRefrigerios;
    @FXML private TextField txtTransporte;
    @FXML private TextField txtTelefonia;
    @FXML private TextField txtOtros;
    @FXML private TextArea txtMasAlto;

    @FXML
    private void Calcularbtn() {

        int alimentacion = Integer.parseInt(txtAlimentacion.getText());
        int refrigerios = Integer.parseInt(txtRefrigerios.getText());
        int transporte = Integer.parseInt(txtTransporte.getText());
        int telefonia = Integer.parseInt(txtTelefonia.getText());
        int otros = Integer.parseInt(txtOtros.getText());
        
        int total = alimentacion + refrigerios + transporte + telefonia + otros;
        txtTotal.setText(String.valueOf(total));
        int mayor = alimentacion;
        String categoria = "Alimentación";
        if (refrigerios > mayor) {
            mayor = refrigerios;
            categoria = "Refrigerios";
        }
        if (transporte > mayor) {
            mayor = transporte;
            categoria = "Transporte";
        }
        if (telefonia > mayor) {
            mayor = telefonia;
            categoria = "Telefonía";
        }
        if (otros > mayor) {
            mayor = otros;
            categoria = "Otros";
        }
        txtMasAlto.setText(categoria);
    }

    @FXML
    private void Limpiarbtn() {
        txtAlimentacion.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefonia.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMasAlto.clear();
    }
}
