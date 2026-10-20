
package com.mycompany.desglosedinero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable {

    @FXML private TextField txtDinero;
    @FXML private TextArea txtBilletes;
    @FXML private TextArea txtCantidades;
    private Billete[] billm;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        billm = new Billete[]{
            new Billete("Billetes de", 500),
            new Billete("Billetes de", 200),
            new Billete("Billetes de", 100),
            new Billete("Billetes de", 50),
            new Billete("Billetes de", 20),
            new Billete("Monedas de", 10),
            new Billete("Monedas de", 5),
            new Billete("Monedas de", 2),
            new Billete("Monedas de", 1)
        };
        for (Billete b : billm) {
            txtBilletes.appendText(b.toString() + "\n");
        }
    }

    @FXML
    private void Desglose_btn() {

        int dinero = Integer.parseInt(txtDinero.getText());
        txtCantidades.clear();
        for (Billete b : billm) {
            int cantidad = dinero / b.getCantidad();
            dinero = dinero % b.getCantidad();
            txtCantidades.appendText(cantidad + "\n");
        }
    }

    @FXML
    private void Borrar_btn() {
        txtDinero.clear();
        txtCantidades.clear();
    }
}
