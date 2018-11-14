package ba.unsa.etf.rpr.tutorijal05;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label display;
    private SimpleStringProperty rezultat;
    private String operacija = "";
    private String prviBroj = "";
    private String broj = "";

    public Controller() {
        rezultat = new SimpleStringProperty();
        rezultat.set("0");
    }

    public String getRezultat() {
        return rezultat.get();
    }

    public SimpleStringProperty rezultatProperty() {
        return rezultat;
    }

    public void jedan(ActionEvent actionEvent) {
        broj += "1";
        rezultat.set(broj);
    }

    public void dva(ActionEvent actionEvent) {
        broj += "2";
        rezultat.set(broj);
    }

    public void tri(ActionEvent actionEvent) {
        broj += "3";
        rezultat.set(broj);
    }

    public void cetiri(ActionEvent actionEvent) {
        broj += "4";
        rezultat.set(broj);
    }

    public void pet(ActionEvent actionEvent) {
        broj += "5";
        rezultat.set(broj);
    }

    public void sest(ActionEvent actionEvent) {
        broj += "6";
        rezultat.set(broj);
    }

    public void sedam(ActionEvent actionEvent) {
        broj += "7";
        rezultat.set(broj);
    }

    public void osam(ActionEvent actionEvent) {
        broj += "8";
        rezultat.set(broj);
    }

    public void devet(ActionEvent actionEvent) {
        broj += "9";
        rezultat.set(broj);
    }

    public void nula(ActionEvent actionEvent) {
        if (!broj.equals("")) {
            broj += "0";
            rezultat.set(broj);
        }
    }

    public void tacka(ActionEvent actionEvent) {
        broj += ".";
        rezultat.set(broj);
    }

    public void plus(ActionEvent actionEvent) {
        operacija = "+";
        prviBroj = getRezultat();
        broj = "";
    }

    public void minus(ActionEvent actionEvent) {
        operacija = "-";
        prviBroj = getRezultat();
        broj = "";
    }

    public void mnozenje(ActionEvent actionEvent) {
        operacija = "*";
        prviBroj = getRezultat();
        broj = "";
    }

    public void dijeljenje(ActionEvent actionEvent) {
        operacija = "/";
        prviBroj = getRezultat();
        broj = "";
    }

    public void remainder(ActionEvent actionEvent) {
        operacija = "%";
        prviBroj = getRezultat();
        broj = "";
    }

    public void jednako(ActionEvent actionEvent) {
        if (operacija.equals("+")) {
            rezultat.set(Double.toString(Double.parseDouble(prviBroj) + Double.parseDouble(broj)));
        } else if (operacija.equals("-")) {
            rezultat.set(Double.toString(Double.parseDouble(prviBroj) - Double.parseDouble(broj)));
        } else if (operacija.equals("*")) {
            rezultat.set(Double.toString(Double.parseDouble(prviBroj) * Double.parseDouble(broj)));
        } else if (operacija.equals("/")) {
            rezultat.set(Double.toString(Double.parseDouble(prviBroj) / Double.parseDouble(broj)));
        } else if (operacija.equals("%")) {
            rezultat.set(Double.toString(Double.parseDouble(prviBroj) % Double.parseDouble(broj)));
        }
        operacija = "=";
        prviBroj = "";
        broj = "";
    }

}