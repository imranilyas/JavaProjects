# JavaProjects #
This repository holds two Java projects: `AlphaString` and `FindTarget`

## FindTarget ##
The class file `BinaryRecursion.java` located in `src/programs,` uses recursion to find the index of the target within an array.

### Algorithm ###
The algorithm accomplishes the following task:

* Fills 8 bit size array with random int generator
* Sorts the array from least to greatest
* Randomly generates target and searches within the array by checking the midpoint
    * Changes the bounds and finds new midpoint if target does not match midpoint
    * If target is not located in the array, returns -1
* Searches first appearance of target if found in array

The result is the return of the index of the array that matches the value of the target.
