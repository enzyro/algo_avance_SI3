/**
 * @author Gr�goire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 */

package algo_avance_3SI3;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		StdinStdout.entete();
		Scanner sc = new Scanner(System.in); //D�claration du scanner n�cessaire a la lecture de l'entr�e standard
		
		//Insertion sort
		System.out.println("Insertion Sort");
		int[] tabInsertion = InsertionSort.useInsertionSort(StdinStdout.declare(sc));
		StdinStdout.prettyPrint(tabInsertion);
		
		// Recherches
		int nbAChercher = 55; // changer cette valeur pour changer le nombre recherch�
		//Recherche Sequentielle
		StdinStdout.printRecherche("sequentielle", recherche.rechercheSequentielle(tabInsertion, nbAChercher)); 
		
		//Recherche Dichotomique
		recherche.setCompteur(0); 															// la recherche dichotomique ayant �t� 
		recherche.rechercheDichotomique(tabInsertion, 0, tabInsertion.length, nbAChercher);	// impl�ment� de mani�re r�cursive, il est
		StdinStdout.printRecherche("dichotomique", recherche.getCompteur());				// n�cessaire d'avoir recours a une variable compteur
		
		//Quick sort
		System.out.println("Quick Sort");
		QuickSort.useQuickSort(StdinStdout.declare(sc));
		StdinStdout.prettyPrint(QuickSort.getTab());
		
		
		sc.close();
	}
}
