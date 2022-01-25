import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		System.out.println("Menu\n" + 1 + ") Матрица\n" + 2 + ") Масив\n" + 3 + ") Выход\n");
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int mas = 0;
		int mat = 0;
		int quit = 0;
		int q = 0;

		boolean isQuit = false;
		while (!isQuit) {

			int functuion = scan.nextInt();

			switch (functuion) {

			case 1:
				mat = 1;
				System.out.print("Enter value array");
				break;
			case 2:
				mas = 2;
				System.out.print("Enter value matrici");
				break;

			case 3:
				quit = 3;

				return;
			}

			if (mas == 2) {
				Scanner scanner = new Scanner(System.in);
				System.out.print("\nArray size1: ");
				int c = scanner.nextInt();
				int[] array = new int[c];
				for (q = 0; q < array.length; q++) {
					System.out.print("array [" + q + "] = ");
					array[q] = scanner.nextInt();
				}
				for (int i = 0; i < array.length; i++) {

					System.out.print(array[i] + " , ");
				}
				System.out.print("\nVvedite chislo = ");
				int y = scanner.nextInt();
				int p = 0;
				for (int i = 0; i < array.length; i++) {
					if (y == array[i])
						p = i;
				}
				System.out.println("Nomer zadanogo chisla = " + p);

				for (int i = 0; i < array.length - 1; i++) {
					for (int j = i + 1; j < array.length; j++) {
						if (array[i] > array[j]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				System.out.print("Сортировка по возрастанию = ");
				System.out.println(Arrays.toString(array));

				for (int i = 0; i < array.length - 1; i++) {
					for (int j = i + 1; j < array.length; j++) {
						if (array[i] < array[j]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				System.out.print("Сортировка по убыванию = ");
				System.out.print(Arrays.toString(array));

				int max = 0;

				for (int i = 0; i < array.length; i++) {
					if (array[i] > max) {
						max = array[i];
						System.out.println("\nНаибольшее значение = " + array[i]);
					}
				}

				int min = array[0];

				for (int i = 1; i < array.length; i++) {
					if (array[i] < min) {
						min = array[i];
					}
				}
				System.out.println("Наименьшее значение = " + min);

			}

			if (mat == 1) {
				Scanner scanner1 = new Scanner(System.in);
				System.out.print("\nArray size1: ");
				int n = scanner1.nextInt();
				System.out.print("Array size2: ");
				int b = scanner1.nextInt();
				int[][] array1 = new int[n][b];
				int i = 0;
				int j = 0;
				for (i = 0; i < array1.length; i++) {
					for (j = 0; j < array1.length; j++) {
						array1[i][j] = scanner1.nextInt();
						System.out.print("array[" + i + "][" + j + "] = " + array1[i][j] + "\n");
					}
				}

				int max = 0;

				for (int i1 = 0; i1 < array1.length; i1++) {
					for (int j1 = 0; j1 < array1.length; j1++) {
						if (array1[i1][j1] > max) {
							max = array1[i1][j1];
						}
					}
				}
				System.out.println("Наибольшее значение = " + max);
				int min = array1[0][0];

				for (int i1 = 0; i1 < array1.length; i1++) {
					for (int j1 = 0; j1 < array1.length; j1++) {
						if (array1[i1][j1] < min) {
							min = array1[i1][j1];
						}
					}
				}
				System.out.println("Наименьшее значение = " + min);

				int c = 1;
				int d = 0;
				for (i = 0; i < array1.length; i++) {
					for (j = 0; j < array1.length; j++) {

						System.out.print(array1[i][j] + " , ");
					}
				}
				Scanner scanner = new Scanner(System.in);
				System.out.print("\nVvedite chislo = ");
				int a = scanner.nextInt();
				for (i = 0; i < array1.length; i++) {
					for (j = 0; j < array1.length; j++) {
						if (array1[i][j] >= a) {
							array1[i][j] = c;

						} else if (array1[i][j] < a)
							array1[i][j] = d;

						System.out.print(array1[i][j] + " , ");
					}
				}
			}
		}

	}

}
