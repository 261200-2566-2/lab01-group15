// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void insertionSort(int[] data,int N){
        int i, j;
        int ref;
        for(i = 1; i < N; i++){
            ref = data[i];
            j = i - 1;
            for(; j >= 0 && data[j] > ref; j--) data[j+1] = data[j];
            data[j+1] = ref;
        }
    }

    public static void printArray(int[] data){
        System.out.println("Your sorted data are: ");
        System.out.println("-------------------------------------------------------");
        for(int i = 0; i < data.length; i++){
            System.out.println((i+1) + "." + data[i]);
        }
        System.out.println("-------------------------------------------------------");
    }
    public static int[] getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        int num;
        do{
            System.out.print("Please Enter your number of data you want to sort: ");
            num = s.nextInt();
            if(num < 0){
                System.out.println("Your number is incorrect!(must be a nonNegative number). Please reEnter your number");
            }
        }while(num < 0);
        System.out.println("-------------------------------------------------------");
        int[] data = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("Your data " + (i+1) + ".");
            data[i] = s.nextInt();
        }
        System.out.println("-------------------------------------------------------");
        return data;
    }
    public static void main(String[] args) {
        int[] data = getData();
        insertionSort(data, data.length);
        printArray(data);
    }
}