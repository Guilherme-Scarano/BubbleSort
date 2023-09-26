package bubblesort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Informe os números do vetor:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);
        
        System.out.println("Array ordenado:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        
        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean troca;
        
        for (int i = 0; i < n - 1; i++) {
            troca = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Trocar os elementos arr[j] e arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    troca = true;
                    System.out.println("Troca: " + arr[j] + " <-> " + arr[j + 1]);
                }
            }
            
            // Se nenhuma troca ocorreu nesta fase, o array já está ordenado
            if (!troca) {
                System.out.println("Nenhuma troca nesta fase. O array está ordenado.");
                break;
            }
        }
    }
}

