# Array_and_ArrayList

#1. Even-Odd: A program that declares two arrays named ‘even’ and ‘odd’. Accepts  numbers from the user and move them to respective arrays depending on
whether they are even or odd.

 Contains three files:
i)Main class: Creates the objects of the classes userinput and allocate numbers. It calls the methods of these classes to input an array and perform the separation of the numbers.
 
ii) UserInput class: Asks the user for the number of elements they wish to enter and then declares an array and stores the numbers entered by the user in this array.
 
iii) AllocateNumbers class: Declare two arrays for even and odd numbers. A for loop checks for even and odd numbers and store them in the respective arrays at the same time determining their size. Print the even and odd arrays.

#2. Min_Dist: A java program that finds 2 neighboring numbers in an array with the smallest distance to each. The function should return the
index of the 1st number.
 Contains three files:
i)Main class: Creates the objects of the classes UserInput and Calculation. It calls the methods of these classes to input an array and store the first index of the pair of neighbouring elements having least distance.

ii) UserInput class: Asks the user for the number of elements they wish to enter and then declares an array and stores the numbers entered by the user in this array.

iii) Calculation class: contains a performMin method where we declare variables---
 n: to store the length of array. 
 first_index: to capture the first index of pair having min dist.
 minDist: initialized with maximum value possible of an integer this is because any distance compared with it at the beginning has to be smaller.
 
 A for loop to loop through all the neighbouring pairs and calculate the distance between them. We then check the distance between current neighbouring pair is less than
 the previous neighbouring pairs distance and return the index of first element of the pair.

#3. A Java program to convert an array into ArrayList and vice-versa.
 Contains four files:
 i)Main class: Creates the objects of the classes ArrayInput,ArrayList and Conversion. A menu driven code to ask user which conversion they wish to perform and then call the respective methods of the classes to input array,arraylist and convert one form to another.
 
ii) ArrayInput class: Asks the user for the number of elements they wish to enter and then declares an array and stores the numbers entered by the user in this array.

iii)ArrayListInput class: Asks the user for the size of arraylist they wish to enter and then declares the arraylist and add the numbers entered by the user in this arraylist.

iv)Coversion class: two methods 
1)ArraytoArrayList to convert array to arraylist using asList method and return the arraylist
2) ArrayListtoArray to convert arraylist to array using toArray method and return the array.
 
 
