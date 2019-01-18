/**
 * @author Gr�goire JARRY, Garry JEAN-BAPTISTE, Florian BROSSARD, Amaury DE GRELING
 * @version 1.0
 * @brief Ensemble des fonctions permettant de r�aliser un quick sort sur un
 *        tableau fourni par la classe appelante. L'ensemble des fonctions utilis�es sont statiques.
 */

package algo_avance_3SI3;

public class QuickSort {
    
	private static int[] tableau; //tableau est utilis� comme une variable globale ici, afin de permettre d'utiliser la fonction quickSort r�cursivement
	
	/** lancement du quicksort sur le tableau pass� en param�tre
	 * @param int[] tab : la tableau a tri�
	 */
	public static void useQuickSort(int[] tab) {
		tableau = tab;
		quickSort(0, tableau.length-1);
	}
  

	public static int[] getTab() {
		return tableau;
	}
	
	
   /** impl�mentation du quicksort
 * @param int indexMin du tableau a trier
 * @param int indexMax du tableau a trier
 */
private static void quickSort(int indexMin, int indexMax) {
       
       int i = indexMin;
       int j = indexMax;

       int pivot = tableau[indexMin+(indexMax-indexMin)/2]; // le pivot est le nombre situ� au milieu du tableau

       while (i <= j) {
           /**
            * a chaque it�ration :
            * -identification d'un nombre a gauche du pivot qui est plus grand que lui
            * -identification d'un nombre a droite du pivot qui est plus petit que lui
            * -une fois la recherche termin�e, les deux index sont �chang�s
            */
           while (tableau[i] < pivot) {
               i++;
           }
           while (tableau[j] > pivot) {
               j--;
           }
           if (i <= j) {
               permutation(i, j);
               i++; // les index sont avanc�s d'un indice de chaque cot�
               j--;
           }
       }
       // appel r�cursif a cette fonction
       if (indexMin < j)
           quickSort(indexMin, j);
       if (i < indexMax)
           quickSort(i, indexMax);
   }

   /** simple permutation
 * @param int i
 * @param int j
 */
private static void permutation(int i, int j) {
       int temp = tableau[i];
       tableau[i] = tableau[j];
       tableau[j] = temp;
   }
 
}
