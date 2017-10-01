#include<stdio.h>
#include<conio.h>

void main()
{
   int num,fact=1,i;
   scanf("%d",&num);
   for(i=1;i<=num;i++)
   {
       fact=fact*i;
   }
printf("%d\n",fact);
}
