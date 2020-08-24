/* gcc -std=c89 riesi.c -o riesi_c -pedantic -Wall -Wextra -Werror */
#include <stdio.h> /* getchar */

int main(void)
{
    printf("Riesi: False\n");
    printf("Riesi? ");
    char riesi = getchar();
    if (riesi == 'y')
        printf("Riesi: True\n");
    else
        printf("Riesi: False\n");
    return 0;
}

