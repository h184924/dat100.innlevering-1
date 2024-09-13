package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class O1 {

    public static void main(String[] args) {
        
        String bruttoInput = showInputDialog("Skriv inn din bruttoinntekt: ");
        double brutto = parseDouble(bruttoInput);
        
        double trinnskatt = beregnTrinnskatt(brutto);
        
        showMessageDialog(null, "Trinnskatten for en inntekt på " + brutto + " kr vil gi deg en skatt på " + String.format("%.2f", trinnskatt) + " kr.");
    }

    public static double beregnTrinnskatt(double brutto) {
        double trinnskatt = 0.0;

        if (brutto > 1350000) {
            trinnskatt += (brutto - 1350000) * 0.176;
            brutto = 1350000;
        }
        if (brutto > 937901) {
            trinnskatt += (brutto - 937901) * 0.166;
            brutto = 937901;
        }
        if (brutto > 670001) {
            trinnskatt += (brutto - 670001) * 0.136;
            brutto = 670001;
        }
        if (brutto > 292851) {
            trinnskatt += (brutto - 292851) * 0.040;
            brutto = 292851;
        }
        if (brutto > 208051) {
            trinnskatt += (brutto - 208051) * 0.017;
        }

        return trinnskatt;
    }
}
