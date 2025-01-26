/*************************Exercice 2*********************/
class Tab {
  // Méthode trier() pour trier un tableau d'entiers dans l'ordre croissant
  public static void trier(int[] tab) {
      for (int i = 0; i < tab.length - 1; i++) {
          int min = i;
          for (int j = i + 1; j < tab.length; j++) {
              if (tab[j] < tab[min]) {
                  min = j;
              }
          }
          int tmp = tab[min];
          tab[min] = tab[i];
          tab[i] = tmp;
      }
  }


public static int moyenne(int[] tab) {
  int sum = 0;
  for (int value : tab) {
      sum += value;
  }
  return sum / tab.length;
}


public static void main (String args [ ] )
{

int tab1 [ ] = { 3,55,7, 1, 88, 9 , 4, -10 };
int i,moyenne;
int[] tab2;
tab2 = new int[]{10,34,62,56,82,7,95};
trier(tab1 ) ;
trier(tab2 ) ;


System.out.println ("Les éléments de tab1 triés sont : " ) ;
for ( i =0; i<tab1.length ; i++) {
/*Impression du contenu de tab1 tri�*/
  if ( i >0) {
  System.out.print ( " , " ) ;
  }
  System.out.print (tab1 [ i ] ) ;
}
System.out.println ( ) ;
System.out.println ("Les éléments de tab2 triés sont : " ) ;
for ( i =0; i<tab2.length ; i++) {
/*Impression du contenu de tab2 tri�*/
  if ( i >0) {
    System.out.print ( " , " ) ;
  }
  System.out.print (tab2 [ i ] ) ;
}
System.out.println ( ) ;
System.out.print ("La valeur moyenne de tab1 est " + moyenne(tab1)) ;
System.out.println ( ) ;
moyenne=moyenne(tab2);
System.out.print ("La valeur moyenne de tab2 est " + moyenne) ;
System.out.println ( ) ;
}

}

