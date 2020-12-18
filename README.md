# JavaProjects #
This repository holds two Java projects: `AlphaString` and `FindTarget`

## AlphaString ##
The class file `LetterBits.java` located in `src/programs` takes in a string and returns the position after 26 additions in string format, an example being how Microsoft Excel names its columns. It starts off at A and ends with Z. The next position after Z is AA, then AB...ZZ, AAA, and so on. 

### Parameters ###
The user may change the following variables:

* int num_additions
* int max_loops
* String start

**WARNING** \
The starting position is not case sensitive. However, keep the starting position limited to only the alphabet and no whitespace. Otherwise, the program will not be able to convert the string into a series of characters.

### Algorithm ###
The algorithm accomplishes the following tasks:

* Converts the starting position (Ex. `String start = "abc"`) into an array of characters
* While the number of loops is less than the max amount of loops the user wants:
    * Last position of the array is fed through increment function to be iterated by num_additions
    * If the last position is 'z', it is reset to 'a'
        * If the first position is 'z', the length is increased
        * All positions reset to 'a'
    * Array is returned in string format
    * Prints starting and final position
    * Starting position of string is set to final position and number of loops is incremented by 1

## FindTarget ##
The class file `BinaryRecursion.java` located in `src/programs` uses recursion to find the index of the target within an array.

### Algorithm ###
The algorithm accomplishes the following tasks:

* Fills 8 bit size array with random int generator
* Sorts the array from least to greatest
* Randomly generates target and searches within the array by checking the midpoint
    * Changes the bounds and finds new midpoint if target does not match midpoint
    * If target is not located in the array, returns -1
* Searches first appearance of target if found in array

The result is the return of the index of the array that matches the value of the target.
