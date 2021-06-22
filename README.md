## Arrays
### Reverse an Array:
Method 1: Swapping values starting from edges.
1. Swap values of first and last elements of the array.
2. Swap values second and last one but elements and keep moving in same manner until you reach the middle of the array. 

Complete solution: https://github.com/kshewani/dsa_java/blob/main/src/main/java/arrays/reverse/ArrayReverseUsingSwapFromEdges.java

Method 2: Swapping values starting from middle.
1. Swap values middle two values of the array and keep moving towards the edge and keep swapping.
   mid_point = array_length / 2;
   start = mid_point - 1;
   end = array_length % 2 == 0 ? mid_point : mid_point + 1;
   swap(arr[start], arr[end])

Complete solution: https://github.com/kshewani/dsa_java/blob/main/src/main/java/arrays/reverse/ArrayReverseUsingSwapFromMiddle.java

Method 3: Recursion
1. Start from first and last elements of the array and swap the values.
2. Recursively continue towards the middle of the array from both ends and keep swapping the values and exit once you reach the middle.

Complete solution: https://github.com/kshewani/dsa_java/blob/main/src/main/java/arrays/reverse/ArrayReverseUsingRecursion.java
   
## Maths
### Count the number of carry operations when adding two numbers
1. Initialize carry_count and previous_carry variables to 0.
2. Get the last digit of both numbers (number % 10) and get the sum of both.
3. Add previous_carry to the sum calculated in step 2.
4. If the sum is greater than or equal to 10 then increment carry_count by 1 and set previous_carry to 1.
5. If sum < 10 set previous_carry to 0.
6. Divide both numbers by 10 to eliminate the last digit (discard the decimal part after division).
7. Continue steps 2 to 6 until any of the numbers is greater than 0.  

Complete solution: https://github.com/kshewani/dsa_java/blob/main/src/main/java/maths/CountCarryOperations.java

### Find minimum and maximum values from a given array
1. Initialize min and max variables to the value of first element in the array.
2. Run through the entire array. If any of the values is smaller than the min value then that becomes min and if any of the values is larger than max value then that becomes max.
3. Return min and max values.

Complete solution: 

### Sort an array with only 0, 1 or 2 as values
1. First get the count of zeros, ones and twos in separate variables.
2. Replace first "zeros" count of elements in the array with 0
3. Replace next "ones" count of elements with 1
4. Replace last "twos" count of elements with 2.
5. Return the array.

Complete solution: https://github.com/kshewani/dsa_java/blob/main/src/main/java/arrays/sorting/Sort012.java
