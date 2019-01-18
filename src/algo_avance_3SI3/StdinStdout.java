/**
 * @author Gr�goire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 * @brief Ensemble des fonctions traitant les entr�es et sorties du programme.
 */

package algo_avance_3SI3;

import java.util.Scanner;

public class StdinStdout {

	/** Ecris l'en-tete du projet dans la sortie standard
	 * @out entete
	 */
	public static void entete() {
		System.out.println("Projet algorithmique avanc�e : 3SI3");
		System.out.println("-----------------------------------");
		System.out.println("Membres du groupe :");
		System.out.println("Gr�goire JARRY");
		System.out.println("Garry JEAN-BAPTISTE");
		System.out.println("Florian BROSSARD");
		System.out.println("Amaury DE GRELING");
		System.out.println("-----------------------------------");
	}
	
	/** D�claration d'un tableau par l'entr�e standard
	 * 	@return tableau entr� par l'utilisateur
	 */
	public static int[] declare(Scanner sc) {
		
		System.out.println("D�clarez la taille du tableau"); 
		int taille = sc.nextInt(); // D�claration de la taille du tableau
		
		System.out.println("D�clarez les �l�ments du tableau");
		System.out.println("Exemple : 37 10 8 29 97 4 11 76 55 34");

		int[] tableau = new int[taille]; // d�claration d'un tableau de n �l�ments

		for (int i=0;i<taille;i++) {
				tableau[i] = sc.nextInt(); // remplissage du tableau
		}
		
		return tableau;
	}
	
	
	/** affichage lisible d'un tableau
	 * @param int[] tab : le tableau a affich�
	 * @out le tableau mis en forme
	 */
	public static void prettyPrint(int[] tab) {
		String tabStr = "|";
		for(int i=0;i<tab.length;i++) {
			tabStr+= tab[i] + "|";
		}
		System.out.println();
		System.out.println(tabStr);
		System.out.println();
	}
	
	/** affichage lisible d'une recherche effectu�e dans un tableau
	 * @param int[] tab : le tableau o� effectuer la recherche
	 * @param int nb : le nombre de comparaison effectu�es
	 * @out affichage du r�sultat d'une recherche
	 */
	public static void printRecherche(String type, int nb) {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("La recherche " + type + " a trouv� le nombre demand� en " + nb + " comparaisons");
		System.out.println("-----------------------------------");
		System.out.println();
	}
	
	
}
