package com.company;

public class Main {

    public static void main(String[] args) {
        //правильный массив [4][4]
//        Object[][] array = new Object[][] {{12, 77, 55, 55},{98, 11, 67, 98},{89, 98, 44, 22},
//                {88, 78, 22, 33}};

        //массив с неправильным размером [4][5]
//        Object[][] array = new Object[][] {{12, 77, 55, 22, 66},{98, 11, 67, 98, 88},{89, 98, 44, 55, 1},
//                {88, 55, 22, 33, 22}};

        //массив с неприводимыми к int элементами [4][4]
        Object[][] array = new Object[][] {{12, 67, 55, 78},{98, 11, "String", 98},{89, 98, 44, 90},
                {88, 34, 22, 33}};

        int sum = 0;
        try {
            sum = arraySum(array);
        }catch (MyArraySizeException sizeException){
            sizeException.printStackTrace();
        }catch (MyArrayDataException dataException){
            dataException.printStackTrace();
        }
        System.out.print(String.format("Сумма элементов массива равна %s.", sum));
    }

    public static int arraySum(Object[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (array.length != 4 | array[0].length != 4){
            throw new MyArraySizeException("One or two dimensions of array are not equal to 4.");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                try {
                    sum += (Integer)array[i][j];
                }catch (ClassCastException classCastException){
                    throw new MyArrayDataException("Array["+i+"]["+j+"]", classCastException);
                }
            }
        }
        return sum;
    }
}
