#include <iostream>
using namespace std;

int main()            
{
    int queue[100], n, head, i, j, k, seek = 0, diff;
    float avg;
    // clrscr();
    cout << "*** FCFS Disk Scheduling Algorithm ***\n"; cout << "Enter the size of Queue\t";
    cin >> n;
    cout << "Enter the Queue\t";
    for(i = 1; i <= n; i++)
    {
        cin >> queue[i];
    }
    cout << "Enter the initial head position\t"; 
    cin >> head;
    queue[0] = head;
    cout << "\n";
    for(j = 0; j <= n - 1; j++)
    {
        diff = abs(queue[j + 1] - queue[j]);
        seek+=diff;
        cout << "Move from " << queue[j] <<" to " << queue[j+1] << " with Seek "<< diff << "\n";
    }
    cout << "\nTotal Seek Time is "<< seek << "\t";
    avg = seek/(float)n;
    cout << "\nAverage Seek Time is "<< avg << "\t";
    return 0;
}