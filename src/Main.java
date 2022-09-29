public class Main {
    public static void main(String[] args) {

        //Задание1
        System.out.println("Задание1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание2
        System.out.println("Задание2");

        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        //Задание3
        System.out.println("Задание3");
        
        String fullName3 = "Иванов Семён Семёнович";
        fullName3 = fullName3.replace("ё", "e");
        fullName3 = fullName3.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName3);
    }
}