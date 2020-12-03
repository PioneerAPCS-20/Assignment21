# While Loops Examples

## Babylonian Square Root Algorithm

There are several techniques for implementing the sqrt method in the `Math` class. One such technique is known as the Babylonian method. It approximates the square root of a number, n, by repeatedly performing a calculation using the following formula:

`nextGuess = (lastGuess + n / lastGuess) / 2`

When `nextGuess` and `lastGuess` are almost identical, `nextGuess` is the approximated square root. The initial guess can be any positive value (e.g., 1). This value will be the starting value for `lastGuess`. If the difference between `nextGuess` and `lastGuess` is less than a very small number, such as 0.0001, you can claim that `nextGuess` is the approximated square root of n. If not, `nextGuess` becomes `lastGuess` and the approximation process continues. 

## Count Ocurrences of a String inside of a String

Given a string, count how many times another string is found within it. 

You can use `indexOf(String s)` to see if it is found within the String (returns -1 if not found). You can also use `indexOf(String s, int i)` to start looking from a specific index instead of the beginning.

## Count Ocurrences Variation

Look for the number of ocurrences of "code", except the third character can be anything. So "cope", "cooe", etc. would count.
