
package com.mycompany.tablamultiplicar;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultado;

    @FXML
    private void btnCalcular() {
        int numero = Integer.parseInt(txtNumero.getText());
        txtResultado.clear();
        Resultados operacion = new Resultados();
        operacion.setNumero(numero);

        for (int i = 1; i <= 10; i++) {
            operacion.setResultado(i);
            int resultado = numero * i;
            txtResultado.appendText(
                operacion.toString() + resultado + "\n"
            );
        }
    }

    @FXML
    private void btnLimpiar() {
        txtNumero.clear();
        txtResultado.clear();
    }
}


