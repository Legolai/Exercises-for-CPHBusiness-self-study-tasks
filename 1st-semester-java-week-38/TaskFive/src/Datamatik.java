/*
For this task you should reuse the Student class from Task 3.
    Methods of reusing the class could be:
    - copy the Students.java file and add it to a new folder called task5
    - copy the content of the Students class from Task 3 and create the class once more in this folder
    - Open the task 3 folder and continue working in this.
    Either method is fine - it is up to you.

5.a Create a new class Datamatik or reuse the one you created earlier. Add an array of Students with 10 elements in it. This should be a class variable (static). From the main method, add 10 student instances to the array. Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer. The function should return the field "name" (the name of the student) and print it (the integer should be used as the index nuber of the student to be printed). Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string. Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student. Call this method with different names from the main method of Datamatik
*/

public class Datamatik {
	static Student[] students = new Student[10];

	public static void main(String[] args) {
		String[] names = { "Nicolai", "Oliver", "Oscar", "Long", "Jesper", "Thomas", "Ida", "Henrik", "Morten",
				"Sofia" };
		int[] ages = { 19, 22, 21, 29, 34, 44, 25, 30, 25, 23 };
		Boolean[] genders = { false, false, false, false, false, false, true, false, false, true };
		char[] teams = { 'A', 'A', 'A', 'B', 'A', 'A', 'C', 'C', 'C', 'C' };

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(names[i], ages[i], genders[i], teams[i]);
		}

		System.out.println(getStudentNameByIndex(students, 1));
		System.out.println(getStudentNameByIndex(students, 3));
		System.out.println(getStudentNameByIndex(students, 9));
		System.out.println(getStudentNameByIndex(students, 8));
		System.out.println(getStudentNameByIndex(students, 2));

		System.out.println(getStudentIndexByName(students, "Oscar"));
		System.out.println(getStudentIndexByName(students, "Jesper"));
		System.out.println(getStudentIndexByName(students, "Ida"));
	}

	public static String getStudentNameByIndex(Student[] arr, int index) {
		if (index >= arr.length) {
			return "The index is out of bounds";
		}
		return arr[index].name;
	}

	public static int getStudentIndexByName(Student[] arr, String name) {
		for (int i = 0; i < arr.length; i++) {
			if (name.equalsIgnoreCase(arr[i].name)) {
				return i;
			}
		}
		return -1;
	}
}
