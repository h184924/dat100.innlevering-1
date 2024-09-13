package no.hvl.dat100;

import javax.swing.JOptionPane;
import java.math.BigInteger;

public class O3 {

    public static BigInteger beregnFakultet(int n) {
        BigInteger fakultet = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fakultet = fakultet.multiply(BigInteger.valueOf(i));
        }
        return fakultet;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Skriv inn et heltall n, (n > 0):");
        int n = Integer.parseInt(input);
        if (n > 0) {
            BigInteger resultat = beregnFakultet(n);
            JOptionPane.showMessageDialog(null, "Fakultet av " + n + " er: " + resultat);
        } else {
            JOptionPane.showMessageDialog(null, "n må være større enn 0.");
        }
    }
}
