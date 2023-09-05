import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        lesson1() ;
        //  Концентрация строк. Метод lenght, charAr(), replace (), equals().
        task1() ;



    }

    public static void lesson1() {
        String phone = "79295274731";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        if (phone.length() == 10) {
            phone = '7' + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException(" Телефон слишком длинный ");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException(" Среди нас посторонний!");
        }
        System.out.println("phone = " + phone);
        System.out.println();
        String expectedPhone = "79295274731";
        if (phone.equals(expectedPhone)) {
            System.out.println("Успех");
        } else {
            System.out.println("Неудача");
        }
        System.out.println();
    }

    public static void task1() {
        String firstName = " Cемён ";
        String middleName = " Иванов ";
        String lastName = " Семёновович ";
        String fullName = lastName + firstName + middleName;
        fullName = fullName.replace("ё", "е");
        System.out.println( "ФИО сотрудника - " + fullName);
        System.out.println();
        //task 2
        System.out.println("Данные ФИО сотрудникка для заполенения отчета - " + fullName.toUpperCase());
        //task 3
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }


    }


