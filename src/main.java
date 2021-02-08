import java.util.Random;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        //We are creating a random number generator

        boolean loop = true;

        Random ranNumber = new Random();
        Scanner input1 = new Scanner(System.in);
        int[] array1 = new int[5];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = ranNumber.nextInt(10+1);
        }

//        for (int x = 0; x < array1.length; x++) {
//
//            System.out.println((x + 1) + ": " + array1[x]);
//        }

        while (loop) {


            for (int u = 0; u < array1.length - 1; u++) {


                for (int j = 0; j < array1.length - 1; j++) {

                    if (array1[j] > array1[j + 1]) {
                        int holder = 0;

                        holder = array1[j + 1];
                        array1[j + 1] = array1[j];
                        array1[j] = holder;


                    }


                }


            }

            loop = false;


        }

        for (int w = 0; w < array1.length; w++) {

            System.out.println((w + 1) + ": " + array1[w]);
        }


    }


}
