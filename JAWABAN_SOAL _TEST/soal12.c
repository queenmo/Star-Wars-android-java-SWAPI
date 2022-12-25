#include <stdio.h>
#include <string.h>

int main(){
    int i,a1,a2,geser;
    char A[50],huruf, enkripsi;

    printf("Masukkan text(bentuk kapital): ");
    gets(A);

    printf("Masukkan jumlah penggeseran (bentuk angka): ");
    scanf("%d",&geser);

    printf("Hasil chiper: \n");
    for(i=0; i<(int)strlen(A); i++){
        huruf = A[i];
        a1 = (int)(huruf-'A');
        a2 = (a1 + geser)%26;
        enkripsi = (char)(a2+'A');
        printf("%c",enkripsi);

    }
    getchar();
    return 0;
}