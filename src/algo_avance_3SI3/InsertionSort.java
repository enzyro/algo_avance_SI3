/**
 * @author Gr�goire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 * @brief Ensemble des fonctions permettant de r�aliser un insertion sort sur un
 *        tableau fourni par la classe appelante. L'ensemble des fonctions utilis�es sont statiques.
 */

package algo_avance_3SI3;


public class InsertionSort {

	
	/** Impl�mentation du tri par insertion
	 * @param int[] tab : le tableau a tri�
	 * @return int[] tab : le tableau tri�
	 */
	public static int[] useInsertionSort(int[] tab) {

		int temp;
        for (int i = 1; i < tab.length; i++) { //acc�s statique a la propri�t� length
            for(int j = i ; j > 0 ; j--){
                if(tab[j] < tab[j-1]){
                    temp = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = temp;
                }
            }
        }
        return tab;
	}
	
	
	
}



