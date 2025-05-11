// Q7 : Search in Rotated Sorted Array

public class Solution {
    static class Answer {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
        int mid = lo + (hi-lo)/2;
        if(arr[mid] == target) return mid;
        else if (arr[mid]<=arr[hi]){
            if(target> arr[mid] && target<=arr[hi]) lo = mid+1;
            else hi = mid-1;
        }
        else {
            if(target>=arr[lo] && target<=arr[mid]) hi = mid-1;
            else lo = mid+1;
            }
        }
        return -1;
    }
}
    public static void main(String[] args) {
        Answer sol = new Answer();

        int[] arr = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 3;

        int index = sol.search(arr, target);
        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
