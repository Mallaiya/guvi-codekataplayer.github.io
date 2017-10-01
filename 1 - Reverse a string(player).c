#include<stdio.h>
#include<string.h>

void main()
{
    char string[200],temp;
    int i=0,j;
    gets(string);
    j=strlen(string)-1;
    while(i<j)
    {
        temp=string[i];
        string[i]=string[j];
        string[j]=temp;
        printf("%s",string);
        i++;
        j--;

    }
printf("%s",string);
}
