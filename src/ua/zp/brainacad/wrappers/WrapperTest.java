package ua.zp.brainacad.wrappers;

public class WrapperTest {
    public static void main(String[] args) {
//        12 Wrapper классы (Практика)
//                1 Создать пакет wrappers в своем проекте, дальнейшая работа будет вестись в нем.
//        2 Создать класс WrapperTest, с main методом
//        2.1 Для каждого типа данных создать по 4 переменные и проинициализировать разными
//        вариантами:
//       • Из примитива, используя автоупаковку
//        • С помощью метода valueOf
//        • С помощью new
//        • Распарсить значение из строки
//        Пример:
//        Integer i1 = 10;
//        Integer i2 = Integer.valueOf(10);
//        Integer i3 = new Integer(10);
//        Integer i4 = Integer.parseInt("10");
//        3 Создать переменную типа Double присвоить ей значение с дробнойчастью.
//        3.1 Создать переменный примитивных типов (byte, short, int, float, long )
//        3.2 Преобразовать и присвоить значение Double каждому из примитивных типов
//        используя специальные методы или автораспаковку.
//        4 Проверить значения NaN и Infinity.
//        4.1 Создать 2 переменные типа Double, одной из них присвоить значение 0.0.
//        4.2 Создать переменную типа Double nanValue и присвоить ей значение, деления
//        ненулевой переменной на нулевую.
//        4.3 Создать переменную infinityValue и присвоить ей значение, деления нулевой
//        переменной саму на себя.
//        4.4 Вывести nanValue и infinityValue на экран.
//        4.5 Добавить по 2 блока if для каждого числа в которых проверяется результат
//        выполнения методов isNaN и isInfinity.
//                Если число NaN вывести текст «Переменная {{имя переменной}} = NaN»
//        Если число Infinityвывести текст «Переменная {{имя переменной}} = Infinity»
//        5 Создать 2 переменной типа Long присвоить обеим значения 120
//        5.1 Вывести на экран результат сравнения этих переменных по оператору ==.
//        5.2 Заменить значения переменных на 1200, перепроверить сравнение.
        Character c1 = 'c';
        Character c2 = Character.valueOf('c');
        Character c3 = new Character('c');

        Byte b1 = 0b101;
        Byte b2 = Byte.valueOf((byte) 0b101);
        Byte b3 = new Byte((byte) 0b101);
        Byte b4 = Byte.parseByte("101", 2);

        Short s1 = 15;
        Short s2 = Short.valueOf((short) 15);
        Short s3 = new Short((short) 15);
        Short s4 = Short.parseShort("15");

        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Long l1 = 1000l;
        Long l2 = Long.valueOf(1000l);
        Long l3 = new Long(1000l);
        Long l4 = Long.parseLong("1000");

        Float f1 = 101.11F;
        Float f2 = Float.valueOf(101.11f);
        Float f3 = new Float(101.11f);
        Float f4 = Float.parseFloat("101.11f");

        Double d1 = 2222.22;
        Double d2 = Double.valueOf(2222.22);
        Double d3 = new Double(2222.22);
        Double d4 = Double.parseDouble("2222.22");

        Boolean iB1 = true;
        Boolean iB2 = Boolean.valueOf(true);
        Boolean iB3 = new Boolean(true);
        Boolean iB4 = Boolean.parseBoolean("true");

        Double doubleWrapper = 333.33;
        byte doubleWrapperToByte = doubleWrapper.byteValue();
        short doubleWrapperToShort = doubleWrapper.shortValue();
        int doubleWrapperToInt = doubleWrapper.intValue();
        float doubleWrapperToFloat = doubleWrapper.floatValue();
        long doubleWrapperToLong = doubleWrapper.longValue();

        Double nullValue = 0.0;
        Double nanValue = nullValue / nullValue;
        Double infinityValue = 1 / nullValue;


        /**
         * Put all Wrapper instance to Object array
         */
        Object[] objects = {"Character Wrapper:", c1, c2, c3,
                "\nByte Wrapper:", b1, b2, b3, b4,
                "\nShort Wrapper:", s1, s2, s3, s4,
                "\nInteger Wrapper:", i1, i2, i3, i4,
                "\nLong Wrapper:", l1, l2, l3, l4,
                "\nFloat Wrapper:", f1, f2, f3, f4,
                "\nDouble Wrapper:", d1, d2, d3, d4,
                "\nBoolean Wrapper:", iB1, iB2, iB3, iB4,
                "\nUnboxing Double Wrapper with methods *Value():", doubleWrapperToByte, doubleWrapperToShort,
                doubleWrapperToInt, doubleWrapperToFloat, doubleWrapperToLong,
                "\nDouble Wrapper with value NaN and Infinity:", nanValue, infinityValue
        };

        /**
         * Print to consol values of all Wrapper instances
         */
        for (Object object : objects) {
            System.out.println(object.toString());
        }

        if (nanValue.isNaN()) {
            System.out.printf("%nПеременная {{%s}} = NaN", "nanValue");
        }
        if (infinityValue.isInfinite()) {
            System.out.printf("%nПеременная {{%s}} = Infinity", "infinityValue");
        }

        Long firstLong = 120l;
        Long SecondLong = 120l;
        Long thirdLong = 1200l;
        Long fourthLong = 1200l;

        System.out.println("\n\nComparison Long Wrapper instances with value 120 by \"==\". Result - " +
                (firstLong == SecondLong));
        System.out.println("Comparison Long Wrapper instances with value 1200 by \"==\". Result - " +
                (thirdLong == fourthLong));
        System.out.println("Comparison Long Wrapper instances with value 1200 by \"equals method\". Result - " +
                thirdLong.equals(fourthLong));


    }
}
