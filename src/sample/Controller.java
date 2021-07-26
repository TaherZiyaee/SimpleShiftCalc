package sample;

import com.ghasemkiani.util.icu.PersianDateFormat;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.DateFormatSymbols;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static void definePersianMonths() {
        String[] months = {
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
                "اسفند"};

        for (String month :
                months) {
            System.out.println(month);
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
