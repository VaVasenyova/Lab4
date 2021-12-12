import java.util.Scanner;

public class FirstWay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int N = in.nextInt();
        int[] B = null; // вводим новый массив, в котором не будет элемента X
        int Count = 0;
        int j = 0;
        int[] A = new int [N];

        for (int i = 0; i < N; i++) { // заполняем массив А с клавиатуры
            System.out.print("Введите элемент " + i + " ");
            A[i] = in.nextInt();
        }

        System.out.println("Введите целое число X");
        int X = in.nextInt();

        for (int i = 0; i < A.length; i++) { // печатаем массив А
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < A.length; i++) { // считаем число совпадений элементов массива А с Х
            if (A[i] == X) {
            Count = Count + 1;
            }
        }

        B = new int[A.length - Count]; // длина В = длина А - количество элементов, равных Х

        for (int i = 0; i < A.length; i++) { //переписываем массив А в массив В без элементов, равных Х
            if (A[i] != X) {
                B[j] = A[i];
                j = j + 1;
            }
        }

        for (int k = 0; k < B.length; k++) { // печатаем массив B
            System.out.print(B[k] + " ");
        }
        System.out.println();
    }
    }
