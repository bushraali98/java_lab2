import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        1.Write a program to find all of the longest word in a given dictionary.
//        Example:
//        { "cat", "dog", "red", "is", "am" } Expected
//        Output:
//        "cat", "dog", "red"
        String[] list = {"cat", "dog", "red", "is", "am"};

        ArrayList<String> dic = longestWords(list);
        System.out.println("Longest words: " + dic);


//        2. Write a program that displays the number of occurrences of an element in the array.
//        Original Array:
//        [1,1,1,3,3,5]
//        Sample Output:
//        3 occurs 2 times
//        1 occurs 3 times
//        9 occurs 0 time

        int[] arr = {1, 1, 1, 3, 3, 5};
        String in;


        do {
            System.out.println("Enter a number to display occurance: ");
            int num = input.nextInt();

            int count = 0;
            for (int n : arr) {
                if (n == num) {
                    count++;
                }
            }

            System.out.println(num + " occurs " + count);

            System.out.println("Enter another number (type \\\"no\\\" to exit): \"");
            in = input.next();

        } while (!in.equalsIgnoreCase("no"));


//        3.Write a program to find the k largest elements in a given array. Elements in the array can be in
//        any order.
//        Original Array:
//        [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        3 largest elements of the said array are:
//        100 25 17

        Integer[] numbers = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(k + " largest elements of the said array are:");
        for (int i = 0; i < k; i++) {
            System.out.println(numbers[i] + " ");
        }


//        4. Create a method to reverse an array of integers. Implement the method without creating a new array.
//        Original Array:
//        [5,4,3,2,1] Expected Output:
//        Reversed Array:
//        1 2 3 4 5

        int[] myArr1 = {5, 4, 3, 2, 1};

        System.out.println("Original Array: ");
        for (int n : myArr1) {
            System.out.print(n + " ");
        }

        reverseArr(myArr1);

        System.out.println("\nReversed Array:");
        for (int n : myArr1) {
            System.out.print(n + " ");
        }


//        5. Write a menu driven Java program with following option:
//        1. Accept elements of an array
//        2. Display elements of an array
//        3. Search the element within array
//        4. Sort the array
//        5. To Stop the size of the array should be
//        entered by the user.
        int number;
        System.out.println("\nPlease enter the size of the array: ");
        number = input.nextInt();
        int[] myArr = new int[number];
        do {
            System.out.println("1. Accept elements of an array\n" +
                    "2. Display elements of an array\n" +
                    "3. Search the element within array\n" +
                    "4. Sort the array \n" +
                    "5. To Stop the size of the array should be\n");
            number = input.nextInt();
            if (number == 1) {
                for (int i = 0; i < myArr.length; i++) {
                    System.out.println("Please enter element: ");
                    int ele = input.nextInt();
                    myArr[i] = ele;
                }
            } else if (number == 2) {

                System.out.println(Arrays.toString(myArr));

            } else if (number == 3) {

                System.out.println("Enter a search keyword: ");
                int num = input.nextInt();
                for (int i = 0; i < myArr.length; i++) {
                    if (myArr[i] == num) {
                        System.out.println("the element is found at index :" + i);
                    } else System.out.println("Not found!");
                }

            } else if (number == 4) {
                Arrays.sort(myArr);
                System.out.println("The sorted array: " + (Arrays.toString(myArr)));
            }
        } while (number != 5);


//        6. Create a method that generates a random number within a given range. Allow the user to
//        specify the range and call the method to display random numbers.
//        Hint: use Random class
//        Sample Output:
//        Enter the minimum value of the range: 10
//        Enter the maximum value of the range: 100
//        Enter the number of random numbers to generate: 5 Random
//        numbers within the specified range:
//        71 - 98 - 96 - 71 - 71

        Random random = new Random();

        System.out.print("Enter the minimum value of the range: ");
        int min = input.nextInt();

        System.out.print("Enter the maximum value of the range: ");
        int max = input.nextInt();

        System.out.print("Enter the number of random numbers to generate: ");
        int count = input.nextInt();

        // Generate random numbers
        System.out.println("Random numbers within the specified range:");
        for (int i = 0; i < count; i++) {
            int randomNum = generateRandomNumber(random, min, max);
            System.out.print(randomNum + (i < count - 1 ? " - " : ""));
        }


//        7. Write a program that checks the strength of a password. Create a method that evaluates a
//        password based on criteria like length, inclusion of special characters, and
//        uppercase/lowercase letters.
//         - We have three methods: checkLength, checkSpecialCharacters, and
//          checkUpperCaseLowerCase, each of which assigns a score based on specific criteria.
//         - The totalScore is calculated by adding the scores from these methods.
//         - Classify the password as strong (8 or more), moderately strong (5 or more), or weak
//          based on the totalScore. - The criteria for scoring:
//              • Length: 0-5 characters (0 points), 6-7 characters (2 points), 8 or more characters
//                (3 points).
//              • Special characters: Absence (0 points), Presence (2 points).
//              • Uppercase and lowercase letters: Absence of both (0 points), presence of both (3 points).
//        Example:
//        Enter a password: 3456 Expected Output:
//        Password is weak.

        System.out.print("\nEnter a password: ");
        String password = input.next();

        int totalScore = checkLength(password) + checkSpecialCharacters(password) + checkCase(password);


        if (totalScore >= 8) {
            System.out.println("Password is strong.");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong.");
        } else {
            System.out.println("Password is weak.");
        }

//        8. Create a method that generates the Fibonacci sequence up to a specified number of terms.
//                Hint: The Fibonacci sequence is a mathematical sequence of numbers that starts with 0 and 1,
//                and each subsequent number in the sequence is the sum of the two preceding ones.
//        Example:
//        Enter the number of Fibonacci terms to generate: 10
//        Expected Output:
//        Fibonacci sequence with 10 terms:
//        0 1 1 2 3 5 8 13 21 34

        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int terms = input.nextInt();

        generateFibonacci(terms);

    }





    public static ArrayList<String> longestWords(String [] arr) {
        ArrayList<String> longest = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength){
                maxLength = arr[i].length();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == maxLength) {
                longest.add(arr[i]);
            }
        }
        return longest;
    }

    public static void reverseArr(int [] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int t = arr[left];
            arr[left] = arr[right];
            arr[right] = t;

            left++;
            right--;
        }
    }


    public static int generateRandomNumber(Random random, int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }


    public static int checkLength(String password) {
        if (password.length() >= 8) {
            return 3;
        } else if (password.length() >= 6) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkSpecialCharacters(String password) {
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkCase(String password) {
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }
        }

        if (hasUpperCase && hasLowerCase) {
            return 3;
        } else if (hasUpperCase || hasLowerCase) {
            return 1;
        } else {
            return 0;
        }
    }


    public static void generateFibonacci(int terms) {
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci sequence with " + terms + " terms:");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }



}


