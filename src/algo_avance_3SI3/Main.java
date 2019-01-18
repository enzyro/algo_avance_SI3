/**
 * @author Grégoire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 */

package algo_avance_3SI3;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		StdinStdout.entete();
		Scanner sc = new Scanner(System.in); //Déclaration du scanner nécessaire a la lecture de l'entrée standard
		
		//Insertion sort
		System.out.println("Insertion Sort");
		int[] tabInsertion = InsertionSort.useInsertionSort(StdinStdout.declare(sc));
		StdinStdout.prettyPrint(tabInsertion);
		
		// Recherches
		int nbAChercher = 55; // changer cette valeur pour changer le nombre recherché
		//Recherche Sequentielle
		StdinStdout.printRecherche("sequentielle", recherche.rechercheSequentielle(tabInsertion, nbAChercher)); 
		
		//Recherche Dichotomique
		recherche.setCompteur(0); 															// la recherche dichotomique ayant été 
		recherche.rechercheDichotomique(tabInsertion, 0, tabInsertion.length, nbAChercher);	// implémenté de manière récursive, il est
		StdinStdout.printRecherche("dichotomique", recherche.getCompteur());				// nécessaire d'avoir recours a une variable compteur
		
		//Quick sort
		System.out.println("Quick Sort");
		QuickSort.useQuickSort(StdinStdout.declare(sc));
		StdinStdout.prettyPrint(QuickSort.getTab());
		
		
		sc.close();
	}
}
