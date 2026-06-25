import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        int[] inputArray1 = {10, 20, 30, 40, 50};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int maxSum = inputArray1[0];
        int minSum = inputArray1[0];
        for (int sumOne : inputArray1) {
            sum += sumOne;
            if (sumOne > maxSum) {
                maxSum = sumOne;
            }
            if (sumOne < minSum) {
                minSum = sumOne;
            }
        }

        double avarageSum = (float) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = maxSum;
        outputArray1[2] = minSum;
        outputArray1[3] = (float) avarageSum;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));


//Task2
        System.out.println("Task2");
        int[] inputArray2 = {200, 300, 400, 500, 600};
        double[] outputArray2 = new double[5];
        double tax = 0.13;
        int index = 0;
        for (int pay : inputArray2) {
            outputArray2[index] = pay * tax;
            index++;
        }

        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

        System.out.println("Task3");
        int[] inputArray3 = {400, 5000, 600, 7000, 800};
        boolean[]outputArray3 = new boolean[inputArray3.length];


        for (int bonUs : inputArray3) {
            if (bonUs > 5000) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }






        System.out.println(" Task4");
        int[] inputArray4 = {60, 400, 300, 5000, 800};
        boolean outputArray4 = true;
        for (int balanSe : inputArray4) {
            if (balanSe < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);


        System.out.println("Task5");
       int[]inputArray5 = { 200 , 400 , 700 , 600 , 900};
       int profMonth = 0;
       for ( int prof : inputArray5) {
           if (prof > 0) {
               profMonth++;
           }
       }
       int[]outputArray5 = {profMonth};
       System.out.println( "inputArray5:" + Arrays.toString(inputArray5));
       System.out.println( "месяцев были рентабельными " + Arrays.toString (outputArray5));
           }
       }
