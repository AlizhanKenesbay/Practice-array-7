import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] array1 = new int[5];
        int [] array2 = new int[5];
        double arithmeticalMean1 = 0;
        double arithmeticalMean2 = 0;

        for (int i = 0; i < 5; i++) {
            array1[i] = (int)(Math.random()*6);
            arithmeticalMean1 += array1[i];
            array2[i] = (int)(Math.random()*6);
            arithmeticalMean2 += array2[i];
        }
        arithmeticalMean1 = arithmeticalMean1 / array1.length;
        arithmeticalMean2 = arithmeticalMean2 / array2.length;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(arithmeticalMean1);
        System.out.println(arithmeticalMean2);

        if(arithmeticalMean1 > arithmeticalMean2){
            System.out.println("Среднее арифметическое первого массива ("+arithmeticalMean1+") больше среднего арифметического "+
                    "второго массива ("+arithmeticalMean2+")");
        } else if(arithmeticalMean1 < arithmeticalMean2){
            System.out.println("Среднее арифметическое первого массива ("+arithmeticalMean1+") меньше среднего арифметического "+
                    "второго массива ("+arithmeticalMean2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ");
        }
    }
}
