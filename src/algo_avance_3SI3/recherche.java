/**
 * @author Gr�goire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 * @brief Ensemble des fonctions permettant de faire une recherche s�quentielle et une recherche dichotomique
 * 		  sur un tableau tri�, et de compter le nombre de comparaisons effectu�s.
 */

package algo_avance_3SI3;

public class recherche {
	
	private static int compteur;
	
	
	public static int getCompteur() {
		return compteur;
	}

	public static void setCompteur(int compteur) {
		recherche.compteur = compteur;
	}

	/** Recherche s�quentielle simple
	 * @param int[] tab : tableau tri� dans lequel la recherche sera effectu�e
	 * @param int nb : le nombre a rechercher
	 * @return int : le nombre de comparaisons n�cessaire avant de trouver l'indice de nb
	 */
	public static int rechercheSequentielle(int[] tab, int nb) {
		boolean trouve = false;
		int compteur = 0;
		while (!trouve) {
			if (tab[compteur] == nb) {
				trouve = true;
			}
			compteur++;
		}
		
		if (trouve)	
			return compteur;
		else
			return -1;
	}
	
	/** Impl�mentation r�cursive de la recherche dichotomique
	 * @param int[] tab : tableau tri� dans lequel la recherche sera effectu�e
	 * @param int min : l'indice minimum du tableau ou sous-tableau dans lequel rechercher
	 * @param int max : l'indice maximum du tableau ou sous-tableau dans lequel rechercher
	 * @param int nb : le nombre a rechercher
	 */
	public static int rechercheDichotomique(int[] tab, int min, int max, int nb) {
		if (max >= min) { 
            int pivot = min + (max - min) / 2; 
            compteur++;
           
            if (tab[pivot] == nb) // si l'�l�ment cherch� est le pivot
                return pivot; 
  
            
            if (tab[pivot] > nb) // si l'�l�ment cherch� est pr�sent a gauche du pivot
                return rechercheDichotomique(tab, min, pivot - 1, nb); 
            
            // alors l'�l�ment cherch� est forc�ment pr�sent a droite du pivot
            return rechercheDichotomique(tab, pivot + 1, max, nb); 
        } 
		// alors l'�l�ment cherch� n'est pas dans le tableau fourni
        return -1; 
	}

}
