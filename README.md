# Brothers_in_the_Bar

There is a class called Functionality.java. In Functionality.java there are the following implemented methods:

1. check_three - Which check if there are three consecutive glasses with the same size.
2. remove_three - Which if check_three has returned true, removes those three glasses.
3. get_number_of_drinks - Which takes user input for the number of glasses, until the limitations are met.
4. get_arr_of_sizes - Which takes user input for the size of each glass, if the limitation for size are not met, 
the user should enter the size of the same glass again.
5. number_of_rounds - Which calculates how many rounds are possible. It first checks for three consecutive glasses 
with the same  size and if such glasses exist it icreases the number of rounds by one end removes the three glasses.

In the main method which is in class Main.java. We get the number of drinks as well the drink sizes via the mentioned 
methods. Then we calculate and return the number of rounds possible using the number_of_rounds method.
