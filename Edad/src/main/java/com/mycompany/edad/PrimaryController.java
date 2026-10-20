package com.mycompany.edad;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class PrimaryController {

    @FXML private TextField txtFecha;
    @FXML private TextArea txtResultado;

    @FXML
    private void btnCalcular() {
        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/uuuu");

        LocalDate nacimiento =
                LocalDate.parse(txtFecha.getText(), formato);

        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);

        txtResultado.setText(
                "Tiene " + edad.getYears() + " años, CON " +
                edad.getMonths() + " meses"
        );
    }

    @FXML
    private void btnLimpiar() {
        txtFecha.clear();
        txtResultado.clear();
    }
}
