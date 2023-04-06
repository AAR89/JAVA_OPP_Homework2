package JAVA_OPP_Homework2;

import java.util.*;

public class Program {

    public static PrinterImple printer = new PrinterImple();
    public static boolean b;
    public static LinkedList<Person> family;

    public static void main(String[] args) {
        family = new LinkedList<>();
        b = true;
        Map<String, Command> dict_command = new HashMap<>();
        extracted(dict_command);
        Scanner sc = new Scanner(System.in);


        System.out.println("""
                Команды для работы со справочником :\s
                ** Добавление новой записи  - 1 **\s
                ** Поиск по справочнику - 2 **\s
                ** Задать отношения - 3 **\s
                ** Сохранить записи в файл - 4 **
                ** Выход - 5 **\s""");

        while (b) {
            printer.print("Команда > ");
            String command = sc.next();
            if (dict_command.containsKey(command)) {
                dict_command.get(command).runCommand();
            } else {
                printer.print("Command error!!!");
            }
        }
    }

    private static void extracted(Map<String, Command> dict_command) {
        dict_command.put("1", () -> {
            Scanner sc = new Scanner(System.in);
            printer.print("Введите имя: ");
            String name = sc.nextLine();
            System.out.println("Введите возраст: ");
            Integer age = Integer.valueOf(sc.nextLine());
            printer.print("Введите статус члена семьи: ");
            String status = sc.next();
            JAVA_OPP_Homework2.status thisStatus1 = Person.setStatus(status);
            Person person = new Person(name, age, thisStatus1);
            family.add(person);
        });
        dict_command.put("2", () -> {
            Scanner scanner = new Scanner(System.in);
            printer.print("Введите имя: ");
            String name = scanner.next();
            for (Person person : family
            ) {
                if (Objects.equals(person.getName(), name)) {
                    printer.print(person.toString());
                }
            }
        });
        dict_command.put("3", () -> FamilyTree.releishonship(family));
        dict_command.put("4", () -> {
            SaveFiles saveFiles = new PrinterImple();
            saveFiles.savefile(String.valueOf(family));
            System.out.println("Save complete!");
        });
        dict_command.put("5", () -> b = false);
    }
}
