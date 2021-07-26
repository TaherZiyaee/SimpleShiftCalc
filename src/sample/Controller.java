package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public ComboBox<String> comboMonth;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String[] persianMonths = {
                "فروردین",
                "اردیبهشت",
                "خرداد",
                "تیر",
                "مرداد",
                "شهریور",
                "مهر",
                "آبان",
                "آذر",
                "دی",
                "بهمن",
                "اسفند"
        };
        ObservableList<String> months = FXCollections.observableArrayList(persianMonths);

        comboMonth.setItems(months);
        comboMonth.setValue(persianMonths[0]);

    }
}
