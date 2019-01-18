/**
 * @author Grégoire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 * @brief Ensemble des fonctions traitant les entrées et sorties du programme.
 */

package algo_avance_3SI3;

import java.util.Scanner;

public class StdinStdout {

	/** Ecris l'en-tete du projet dans la sortie standard
	 * @out entete
	 */
	public static void entete() {
		System.out.println("Projet algorithmique avancée : 3SI3");
		System.out.println("-----------------------------------");
		System.out.println("Membres du groupe :");
		System.out.println("Grégoire JARRY");
		System.out.println("Garry JEAN-BAPTISTE");
		System.out.println("Florian BROSSARD");
		System.out.println("Amaury DE GRELING");
		System.out.println("-----------------------------------");
	}
	
	/** Déclaration d'un tableau par l'entrée standard
	 * 	@return tableau entré par l'utilisateur
	 */
	public static int[] declare(Scanner sc) {
		
		System.out.println("Déclarez la taille du tableau"); 
		int taille = sc.nextInt(); // Déclaration de la taille du tableau
		
		System.out.println("Déclarez les éléments du tableau");
		System.out.println("Exemple : 37 10 8 29 97 4 11 76 55 34");

		int[] tableau = new int[taille]; // déclaration d'un tableau de n éléments

		for (int i=0;i<taille;i++) {
				tableau[i] = sc.nextInt(); // remplissage du tableau
		}
		
		return tableau;
	}
	
	
	/** affichage lisible d'un tableau
	 * @param int[] tab : le tableau a affiché
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
	
	/** affichage lisible d'une recherche effectuée dans un tableau
	 * @param int[] tab : le tableau où effectuer la recherche
	 * @param int nb : le nombre de comparaison effectuées
	 * @out affichage du résultat d'une recherche
	 */
	public static void printRecherche(String type, int nb) {
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("La recherche " + type + " a trouvé le nombre demandé en " + nb + " comparaisons");
		System.out.println("-----------------------------------");
		System.out.println();
	}
	
	
}
