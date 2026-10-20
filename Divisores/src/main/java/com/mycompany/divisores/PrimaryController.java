package com.mycompany.divisores;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private TextField txtCantidad;
    @FXML private TextArea txtCifras;
    @FXML private TextArea txtImpares;
    @FXML private TextArea txtPares;
    @FXML private TextArea txtTotal;
    @FXML private TextArea txtMayor;
    @FXML private TextArea txtMenor;
    @FXML private TextArea txtDivisores;

    @FXML
    private void btnAnalizar() {

        int numero = Integer.parseInt(txtCantidad.getText());
        int numeroAbsoluto = Math.abs(numero);

        String texto = String.valueOf(numeroAbsoluto);

        int cifras = texto.length();
        int sumaImpares = 0;
        int sumaPares = 0;
        int sumaTotal = 0;
        int mayor = 0;
        int menor = 9;

        // Analizar cada cifra del numero
        for (int i = 0; i < texto.length(); i++) {

            int cifra = Character.getNumericValue(texto.charAt(i));

            sumaTotal += cifra;

            if (cifra % 2 == 0) {
                sumaPares += cifra;
            } else {
                sumaImpares += cifra;
            }

            if (cifra > mayor) {
                mayor = cifra;
            }

            if (cifra < menor) {
                menor = cifra;
            }
        }

        // Mostrar los resultados
        txtCifras.setText(String.valueOf(cifras));
        txtImpares.setText(String.valueOf(sumaImpares));
        txtPares.setText(String.valueOf(sumaPares));
        txtTotal.setText(String.valueOf(sumaTotal));
        txtMayor.setText(String.valueOf(mayor));
        txtMenor.setText(String.valueOf(menor));

        // Obtener los divisores
        txtDivisores.clear();

        for (int i = 1; i <= numeroAbsoluto; i++) {

            if (numeroAbsoluto != 0 && numeroAbsoluto % i == 0) {
                txtDivisores.appendText(i + "\n");
            }
        }
    }

    @FXML
    private void btnLimpiar() {

        txtCantidad.clear();
        txtCifras.clear();
        txtImpares.clear();
        txtPares.clear();
        txtTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }
}
