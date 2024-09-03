package ru.mirea.pryazhentseva;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Excercise1_2 {
    public static void main(String[] args){
        int[] a;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int length = rand.nextInt(10) + 10;
        a = new int[length];
        System.out.println("Размер массива: "+length);

        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(rand.nextInt(50)) + 50;
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println("Введите искомое значение");
        int x = scan.nextInt();

        int count = BinSearch(a, x);
        System.out.println("Всего итераций: "+count);
    }

    public static int BinSearch(int[] a, int x){
        int count = 0;
        int s = 0;
        int e = a.length;
        while (s <= e){
            count++;
            int mid = (s + e) / 2;
            if (a[mid] < x){
                s = mid + 1;
            }
            else if (a[mid] == x){
                System.out.println("Значение найдено под индексом "+mid);
                return count;
            }
            else{
                e = mid - 1;
            }
        }
        System.out.println("Значение не найдено");
        return count;
    }
}