public class Main {
    public static void main(String[] args) {
        System.out.println("DZ_25. Первое домашнее задание java");

        // Текущий год
        int currentYear = 2023;
        // Год рождения друга
        int friendYear = 1983;
        // Вычисляем возраст друга
        int age = currentYear - friendYear;
        // Выводим сообщение
        System.out.println("1. Моему другу " + age + " лет");

        int number = 122256;
        int lastDigit = number % 10;
        System.out.println("2. Последняя цифра числа " + number + " равна " + lastDigit);

        String name3 = "Александр Степанович";
        int age3= 27;
        if (age3 >= 18 && age3 <= 30) {
            System.out.println("3. " + name3 + ", поздравляю, вы разобрались, как работает if");
        }

        int x = 5; // координата по оси x
        int y = -3; // координата по оси y
        if (x > 0 && y > 0) {
            System.out.println("4. Цель находится в первой четверти!");
        } else if (x < 0 && y > 0) {
            System.out.println("4. Цель находится во второй четверти!");
        } else if (x < 0 && y < 0) {
            System.out.println("4. Цель находится в третьей четверти!");
        } else if (x > 0 && y < 0) {
            System.out.println("4. Цель находится в четвертой четверти!");
        } else if (x == 0 && y == 0) {
            System.out.println("4. Цель находится в начале координат!");
        } else {
            System.out.println("4. Цель находится на оси координат!");
        }

        int a = 9; // длина первой стороны
        int b = 16; // длина второй стороны
        int c = 25; // длина третьей стороны
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("5. Такой треугольник можно построить");
        } else {
            System.out.println("5. Такой треугольник нельзя построить");
        }






    }
}