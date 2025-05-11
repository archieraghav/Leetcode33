# Search in Rotated Sorted Array

This Java program searches for a target value in a rotated sorted array using an efficient binary search algorithm.

#Problem Statement

Given a sorted array that has been rotated at some pivot unknown beforehand (e.g., `[6, 7, 8, 1, 2, 3, 4, 5]`), search for a given target element. The array contains no duplicates.

Your task is to return the **index** of the target if it exists, otherwise return **-1**.

#Example:

java
Input: arr = [6, 7, 8, 1, 2, 3, 4, 5], target = 3  
Output: 5

#How It Works

* The code uses a variation of binary search to handle the rotated sorted array.
* It checks whether the middle element lies in the sorted half (left or right), and then adjusts the search space accordingly.
* This approach ensures a time complexity of **O(log n)**.

#How to Run

1. Copy the code into a Java file, for example, `Solution.java`.
2. Compile and run it using any Java compiler or IDE.

#Using terminal:

javac Solution.java
java Solution

#Sample Output:
Target found at index: 5

#File Structure

* `Solution.java` — contains the main logic for searching in the rotated array.

#Time & Space Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

#Author

This implementation is written with clarity and minimalism in mind, suitable for learning binary search logic in rotated arrays.
