// link : https://cutt.ly/Vn6I4eW
// Largest Element in Array

class Compute {
    
    public int largest(int arr[], int n)
    {
        int i;
    int max = arr[0];
    for (i = 1; i < n; i++)
        if (arr[i] > max) max = arr[i];
    return max;
    }
}
