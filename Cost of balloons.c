#include <stdio.h>
int main()
{
    int t;
    scanf("%d", &t); 
    while (t)
    {
        int cg, cp;
        scanf("%d%d", &cg, &cp); 
        int nop;
        scanf("%d", &nop);
        int col1 = 0, col2 = 0;

        for (int i = 0; i < nop; i++)
        {
            int sone, stwo;
            scanf("%d%d", &sone, &stwo);

            if (sone)
            {
                col1++;
            }

            if (stwo)
            {
                col2++;
            }
        }

        int countifgreenselected = cg * col1 + cp * col2;
        int countifpurpleselected = cp * col1 + cg * col2;

        if (countifgreenselected < countifpurpleselected)
        {
            printf("%d", countifgreenselected);
        }
        else
        {
            printf("%d", countifpurpleselected);
        }

        printf("\n");

        t--;
    }
}