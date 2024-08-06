public class HomeWork0407 {
    public static void main(String[] args) {

// Создайте строку через new - I study Basic Java!
        String String = new String("I study Basic Java!");

// Распечатать пред-последний символ строки. Используем метод String.charAt().
        System.out.println(String.charAt(String.length() - 2));

// Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(String.contains("Java"));

// Вырезать строку Java c помощью метода String.substring().
        System.out.println(String.substring(13,18));

// Заменить все символы “а” на “о”.
        System.out.println(String.replace('a', 'o'));

// Преобразуйте строку к верхнему регистру.
        System.out.println(String.toUpperCase());

// Преобразуйте строку к нижнему регистру.
        System.out.println(String.toLowerCase());

    }
}
