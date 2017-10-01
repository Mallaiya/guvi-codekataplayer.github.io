#include<stdio.h>
#include<conio.h>

void main()
{
    long long int num,sum=0,temp;
    scanf("%lld",&num);
    temp=num;
    while(temp>0)
    {
        num=temp;
        num=num%10;
        sum=(sum*10)+num;
        temp=temp/10;
    }
     printf("%lld",sum);
}
