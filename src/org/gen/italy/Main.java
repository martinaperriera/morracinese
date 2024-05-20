package org.gen.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String[] mosse = { "carta", "forbice", "sasso" }; // mosse possibili 

		int punteggioUtente = 0; // Punteggio iniziale dell'utente
		int punteggioComputer = 0; // Punteggio iniziale del computer

		// Ciclo principale del gioco
		do {
			// Generazione della mossa casuale del computer
			String mossaComputer = mosse[r.nextInt(3)];

			// Richiesta della mossa all'utente
			System.out.println("Inserisci la tua mossa (carta, forbice, sasso): ");
			String mossaUtente = sc.nextLine().toLowerCase(); // Lettura e conversione della mossa dell'utente a
																// minuscolo

			// Visualizzazione delle mosse
			System.out.println("Mossa del computer: " + mossaComputer);
			System.out.println("Mossa dell'utente: " + mossaUtente);

			// Determinazione del vincitore
			if (mossaUtente.equals(mossaComputer)) {
				System.out.println("Parità!");
			} else if ((mossaUtente.equals("sasso") && mossaComputer.equals("forbice"))
					|| (mossaUtente.equals("forbice") && mossaComputer.equals("carta"))
					|| (mossaUtente.equals("carta") && mossaComputer.equals("sasso"))) {
				System.out.println("Hai vinto questa partita!");
				punteggioUtente++;
			} else {
				System.out.println("Il computer ha vinto questa partita!");
				punteggioComputer++;
			}

			// Visualizzazione del punteggio
			System.out.println("Punteggio - Utente: " + punteggioUtente + " Computer: " + punteggioComputer);
			System.out.println();
		} while (punteggioUtente < 5 && punteggioComputer < 5); // Condizione del ciclo

		// Visualizzazione del vincitore finale
		if (punteggioUtente == 5) {
			System.out.println("Complimenti! Hai vinto il gioco!");
		} else {
			System.out.println("Il computer ha vinto il gioco! Ritenta, sarai più fortunato.");
		}

		sc.close(); 
	}
}
