package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

		int studenter = 10;

		for (int i = 1; i <= studenter; i++) {
			int poeng = -1;

			while (poeng < 0 || poeng > 100) {

				String poenginput = showInputDialog(
						"Skriv in poengsummen for student nr : " + i + " (0 - 100)");
				poeng = parseInt(poenginput);

				if (poeng < 0 || poeng > 100) {
					showMessageDialog(null, "Ugyldig poengsum for student nr: " + i + ". Vennligst skriv inn på nytt.");
				}
			}

			char karakter;

			if (poeng >= 90) {
				karakter = 'A';
			} else if (poeng >= 80) {
				karakter = 'B';
			} else if (poeng >= 70) {
				karakter = 'C';
			} else if (poeng >= 60) {
				karakter = 'D';
			} else if (poeng >= 50) {
				karakter = 'E';
			} else {
				karakter = 'F';
			}

			showMessageDialog(null, "Student " + i + " fikk karakter : " + karakter);
		}
	}
}