package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        String phone = "+960-415 75-37";
//        phone = phone.replace("-","");// заменить символ  строке на какой - то другой
//        phone = phone.replace(" ",""); // удаление символа из строки
//        phone = phone.replace("+","");
//        if (phone.length() == 10) {
////            phone = '7' + phone;
//        } else if (phone.length() > 11) {
//        throw new RuntimeException("Телефон слишком длинный"); // выводим инф об ошибках
//    } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 10 &&  phone.charAt(0) != '7') { // прочитать один символ из строки по индексу
//            throw new RuntimeException("Среди нас посторонний");
//        }
//            System.out.println("phone = "+phone);
//        String expectedPhone = "79604157537";
//        if (phone.equals(expectedPhone)) { // сравнение строк
//            System.out.println("Успех");
//        } else {
//            System.out.println("Неудача");
        // Задание 1
        String firstName = "Ivan";
        String middleName = "Jovanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName +" " + middleName ;
        System.out.println("ФИО сотрудника- " + fullName);
        // Задание 2
        String fullName1 = lastName + " " + firstName +" " + middleName ;
        String fullName1Upper =  fullName1.toUpperCase( );
        System.out.println("Данные ФИО сотрудника для заполнения отчета- " + fullName1Upper );
        // Задание 3
        String fullName2 = lastName + " " + firstName +" " + middleName ;
        fullName2 = fullName2.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела " + fullName2 );
        //Задание 4
        String fullNameAnother = lastName + " " + firstName +" " + middleName ;
        fullNameAnother = fullNameAnother.replace("Ivanov", "Иванов");
        fullNameAnother = fullNameAnother.replace("Ivan", "Семён");
        fullNameAnother = fullNameAnother.replace("Jovanovich", "Семёнович");
        fullNameAnother = fullNameAnother.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника- " + fullNameAnother);

    }
}






