#include <bits/stdc++.h>
using namespace std;
void printarray(int arr[]);
int main()
{
    int arr1[100] = {10, 12, 3, 4, 5};
    int arr2[100] = {100, 2, 3, 4, 5};
    printarray(arr1);
    printarray(arr2);
    return 0;
}

void printarray(int arr[])
{
    int max = arr[0];
    for (int i = 0; i < 5; i++)
    {
        if (max < arr[i])
        {
            max = arr[i];
        }
    }
    cout << max << endl;
}