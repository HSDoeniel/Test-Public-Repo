#include <iostream>
#include <vector>
using namespace std;

void quicksort(vector<int>& a, int left, int right) {
    if (left >= right) return;
    int pivot = a[(left + right) / 2];
    int i = left, j = right;

    while (i <= j) {
        while (a[i] < pivot) i++;
        while (a[j] > pivot) j--;
        if (i <= j) {
            swap(a[i], a[j]);
            i++; j--;
        }
    }

    quicksort(a, left, j);
    quicksort(a, i, right);
}

int main() {
    int n;
    cin >> n;
    vector<int> a(n);

    for (int i = 0; i < n; i++)
        cin >> a[i];

    quicksort(a, 0, n - 1);

    for (int x : a)
        cout << x << " ";
}
