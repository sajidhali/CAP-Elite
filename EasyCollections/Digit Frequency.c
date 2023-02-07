#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char str[1000];

    scanf("%s",str);

    int c[10];

    int a=strlen(str),count=0;

    int b[10]={'0','1','2','3','4','5','6','7','8','9'};

    for(int i=0;i<10;i++){

        for(int j=0;j<a;j++){

            if(str[j]==b[i]){

                count++;

            }

        }

        printf("%d ",count);

        count=0;

    }

    return 0;

}

