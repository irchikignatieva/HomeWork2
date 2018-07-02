package HomeWork2;
import static java.lang.Math.*;
import java.util.Arrays;
import java.util.regex.*;
import static java.lang.Math.pow;

public class HomeWork2 {
    public static void main(String[] args) {
//        1. 1) Если а – четное посчитать а*б/с,если "а+с" или "b+c" четное - посчитать "a" возведенную в степень "c"
//        иначе посчитать  а+б-с
         {
            int a = 10;
            int b = 4;
            int c = 2;
            if ((a % 2) == 0) {
                System.out.println(a * b / c);
            }
//            else if ((a + c | b + c) % 2) == 0) {
//                System.out.println(pow(a,c));
//            }
//            else {
//                System.out.println(a + b - c);
//         }
        }
//        2) Определить какой области принадлежит точка с координатами (х,у,z)


//        2.
//        1) Вычислить факториал числа n. n! = 1*2*…*n-1*n;
//             public static int factorial (int number)
//        {
//            int f = 1;
//            int fact = 1;
//            while (f <= number) {
//                fact *= f;
//                f++;
//            }
////            return fact;
//        }

//        2) Вывести число, которое является зеркальным отображением последовательности цифр
// заданного числа, например, задано число 123, вывести 321

            class REF {
                int getReflex(int ch) {
                    {
                        int ref = 0;
                        while (ch != 0) {
                            ref = ref * 10 + ch % 10;
                            ch /= 10;
                        }
                        ref = Math.abs(ref);
                        return ref;
                    }
                }
            }
            //  3. 1) Поменять местами первую и вторую половину массива, например,
        // для массива 1 2 3 4, результат 3 4 1 2
            class SimpleArray {
                public int[] replaceHalfArray(int[] arr) {
                    int half = arr.length / 2;
                    int div = half + arr.length % 2;
                    for (int i = 0; i < div; i++) {
                        int currentElement = arr[i];
                        arr[i] = arr[div + i];
                        arr[div + i] = currentElement;
                    }
                    return arr;
                }
//
//               2) Отсортировать массив (пузырьком (Bubble)
                public int[] BubbleSort(int[] array) {
                    for (int lengthIn = array.length; lengthIn > 0; lengthIn--) {
                        for (int currSwap = 0; currSwap < lengthIn - 1; currSwap++) {
                            if (array[currSwap] > array[currSwap + 1]) {
                                int curElement = array[currSwap];
                                array[currSwap] = array[currSwap + 1];
                                array[currSwap + 1] = curElement;
                            }
                        }
                    }
                    return array;
                }
            }
 //       4. Написать функции преобразования:
//        1)целого числа в строку
            class FirstString1 {
                public void main(String args[]) {
                    int i = 35;
                    String str = Integer.toString(i);
                    System.out.println(str);
                }
            }
//        2)вещественного числа в строку
        class SecondString1 {
            public void main(String args[]) {
                float i = 5.55f;
                String str = Float.toString(i);
                System.out.println(str);
            }
//        3)строки в целое число
         class ThirdString1 {
    public void main(String args[]) {
        String stringtoint = "987654321";
        Integer intValue = Integer.valueOf(stringtoint);
        System.out.println(stringtoint);
    }

    //        4)строки в вещественное число
    class FourthString1 {
        public void main(String args[]) {
            String stringtofloat = "123456789";
            Float floatValue = Float.valueOf(stringtofloat);
            System.out.println(stringtofloat);
        }
//        5)Дана строка, состоящая из слов, разделенных пробелами и знаками препинания.
// Определить длину самого короткого слова

//        6)Подсчитать количество слов во введенной пользователем строке
          {
    String offer = "123, 234, 354, 1321";
    System.out.println("Offer: " + offer + "\n");
    offer = offer.replaceAll("\\p{Punct}", " ");
    String[] words = offer.split("\\s+");
    System.out.println("\n = " + words.length + ";");
    for (String word : words) {
        System.out.println(word);
    }
}
    }
}
        //        7)В заданной строке удалить последнее слово
        class FirstString1 {
            public void main(String args[]) {
                String value = "No gain without pain";
                System.out.println(value.substring(0, value.lastIndexOf(" ")));
            }
        }
    }

}}