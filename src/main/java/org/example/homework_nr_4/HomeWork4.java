package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args){

        //Инициализируем массив и введем данные от 1 до 5
        int[] array = new int[] {1, 2, 3, 4, 5};

        //Выведем данные массива array
        for(int i = 0; i != array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("===============================================");

        //Инициализируем массив и введем данные от 1 до 25 с помощью цикла
        int[] array_2 = new int[25];
        for(int i = 0; i != array_2.length; i++) {
            array_2[i] = 1 + i;
        }
        //Инициализируем массив и введем данные в первую строку от 1 до 8, в каждую последущию строку будем добавлять номер строки
        int[][] biDimensionalArray = new int[5][8];
        for(int j = 0; j != biDimensionalArray.length; j++){
            for(int i = 0; i != biDimensionalArray[j].length; i++) {
                biDimensionalArray[j][i] = 1+i+j;
            }
        }
        //Выведем на экран двухмерный массив
        for(int j = 0; j != biDimensionalArray.length; j++){
            for(int i = 0; i!= biDimensionalArray[j].length; i++){
                System.out.print(biDimensionalArray[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================================");
        int sumArray = 0;
        for(int i = 0; i != array.length; i++){
            sumArray += i;
        }
        double avgArray = sumArray / array.length;

        System.out.println("Сумма массива равна: " + sumArray);
        System.out.println("Среднее значение массива равна: " + avgArray);

        int countEven = 0;
        int countOdd  = 0;

        for(int j = 0; j != biDimensionalArray.length; j++) {
            for (int i = 0; i != biDimensionalArray[j].length; i++){
                if(biDimensionalArray[j][i]%2==0) {
                    countEven = countEven + 1;
                }
                else{
                    countOdd = countOdd + 1;
                }
            }
        }

        System.out.println("Количество четных чисел двухмернного массива рвана " + countEven);
        System.out.println("Количество нечетных чисел двухмернного массива равна " + countOdd);

        System.out.println("===============================================");
        //Бонус
        String[] nameArray = new String[] {"Alex", "Pavel", "Vitalii", "Vladimir"};
        String[] copy_nameArray = nameArray.clone();

        for(int i = 0; i != copy_nameArray.length; i++){
                System.out.print(nameArray[i] + " ");
        }
        System.out.println();
        for(int i = 0; i != nameArray.length; i++){
            System.out.print(copy_nameArray[i] + " ");
        }

    }
}
