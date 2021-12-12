import java.util.Scanner;

public class SecondWay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] A = new int[1];
        int i = 0;
        int[] B = null;
        int Count = 0;
        int j = 0;

        System.out.print("Введите элемент массива ");
        String z = in.next();
        while (!z.equals("quit")) {
            int [] arrayTemp = new int[A.length];  //Создаем временный массив
            for (i = 0; i < A.length; i++) {
                arrayTemp[i] = A[i];
            }
            A = new int[arrayTemp.length + 1]; //Увеличиваем размерность основного массива на 1
            for (i = 0; i < arrayTemp.length; i++) {
                A[i] = arrayTemp[i];
            }
            A[A.length - 1] = Integer.parseInt(z);  //Инициализируем новый элемент
            i = i + 1;
            System.out.print("Введите элемент массива ");
            z = in.next();
        }

        int [] Temp = new int[A.length - 1];  //так как А[0] = 0, а этот элемент нам не нужен,
        for (i = 1; i < A.length; i++) {      // то произведем сдвиг всех элементов массива А на 1 влево
            Temp[i - 1] = A[i];
        }
        A = new int[Temp.length];
        for (i = 0; i < Temp.length; i++) {
            A [i] = Temp[i];
        }

        System.out.println("Введите целое число X");
        int X = in.nextInt();

        for (i = 0; i < A.length; i++) { // считаем число совпадений элементов массива А с Х
            if (A[i] == X) {
                Count = Count + 1;
            }
        }

        B = new int[A.length - Count]; // длина В = длина А - количество элементов, равных Х

        for (i = 0; i < A.length; i++) {
            if (A[i] != X) {  //переписываем массив А в массив В без элементов, равных Х
                B[j] = A[i];
                j = j + 1;
            }
        }
        for (i = 0; i < A.length; i++) { // печатаем массив А
            System.out.print(A[i] + " ");
        }
        System.out.println();

        for (int k = 0; k < B.length; k++) { // печатаем массив B
            System.out.print(B[k] + " ");
        }
        System.out.println();
    }
}
