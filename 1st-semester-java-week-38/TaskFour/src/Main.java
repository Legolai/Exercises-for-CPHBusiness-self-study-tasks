/*
For all exercises in Task 4, you are allowed to complete them with arrays of a fixed size. But do consider how the functions you write in 4.b, 4.c, 4.d,  4.e would work, if the array received as a parameter would not have a fixed length.
4.a create arrays of the following type and assign it at least 3 different values:
    - Integer array
    - String array
    - boolean array
4.b Write a function that takes in an array of strings as parameter and prints each string.
4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.
4.d Write a function that receives an integer array as a parameter and returns the average value.
4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
*/

public class Main {
    public static void main(String[] args) throws Exception {
        String[] strings = { "hello", "world", "goodbay", "see", "you" };
        int[] numbers = { 12, 21, 48, 12, 49, 10, 219, 40, 10 };
        boolean[] condtions = { true, true, false, true, false };
        printStrings(strings);
        System.out.println(sum(numbers));
        System.out.println(average(numbers));
        for (int num : sort(numbers)) {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void printStrings(String[] strings) {
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int average(int[] numbers) {
        int sum = sum(numbers);
        return sum / numbers.length;
    }

    public static int[] sort(int[] arr) {
        // bubble sort :)
        for (int pos = 0; pos < arr.length; pos++) {
            for (int i = 0; i < arr.length - pos - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        return arr;
    }
}
