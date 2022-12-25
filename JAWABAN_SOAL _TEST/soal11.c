#include <stdio.h>
#include <string.h>
#include <stdlib.h>

    void main(){
    char karakter[20];
    char kataPertama[20];
    int jml_huruf,i,polindrome;
    /*printf("masukkan karakter = "); gets(karakter);
    printf("gets() membaca "); puts(karakter); */

      printf("Masukkan jumlah huruf : "); scanf("%i",&jml_huruf);
    for(i=1 ; i<=jml_huruf ;i++){ printf("Masukkan karakter ke-%i = ",i); scanf("%s",&karakter[i]);
    }
    printf("\nHasil Polindrome: "); for(i=1 ; i<=jml_huruf ;i++){
    printf("%c",karakter[i]); }
    polindrome = jml_huruf; for(i=1 ; i<jml_huruf; i++){
    karakter[polindrome] = karakter[i]; polindrome = polindrome - 1; printf("%c",karakter[polindrome]);
} }
