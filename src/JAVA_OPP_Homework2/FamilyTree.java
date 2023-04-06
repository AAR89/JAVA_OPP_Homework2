package JAVA_OPP_Homework2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class FamilyTree extends Program {
    public LinkedList<Person> familyList = Program.family;

    public static LinkedList releishonship(LinkedList<Person> familyList) {
        SaveFiles saveFiles = new PrinterImple();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < familyList.size(); i++) {
            Person tempPerson = familyList.get(i);
            if (tempPerson.getStatus() == status.mother) {
                System.out.println("У " + tempPerson.getName() + " есть дети?");
                String answer = scanner.next();
                answer = answer.toLowerCase();
                String yes = "да";
                if (Objects.equals(answer, yes)) {
                    System.out.println("Введите имя ребенка: ");
                    String answer2 = scanner.next();
                    for (int j = 0; j < familyList.size(); j++) {
                        Person tempPerson2 = familyList.get(j);
                        if ((Objects.equals(answer2, tempPerson2.getName())) && ((tempPerson2.getStatus() == status.son) || tempPerson2.getStatus() == status.daughter)) {
                            String name = tempPerson.getName();
                            LinkedList<Object> list = new LinkedList<>();
                            list.add(tempPerson2);
                            System.out.println("Дети " + name + list);
                            saveFiles.savefile(list.toString());
                        }
                    }
                }
            }
            if (tempPerson.getStatus() == status.father) {
                System.out.println("У " + tempPerson.getName() + " есть дети?");
                String answer = scanner.next();
                answer = answer.toLowerCase();
                String yes = "да";
                if (Objects.equals(answer, yes)) {
                    System.out.println("Введите имя ребенка: ");
                    String answer2 = scanner.next();
                    for (int j = 0; j < familyList.size(); j++) {
                        Person tempPerson2 = familyList.get(j);
                        if ((Objects.equals(answer2, tempPerson2.getName())) && ((tempPerson2.getStatus() == status.son) || tempPerson2.getStatus() == status.daughter)) {
                            String name = tempPerson.getName();
                            LinkedList list = new LinkedList<>();
                            list.add(tempPerson2);
                            System.out.println("Дети " + name + list);
                            saveFiles.savefile(list.toString());
                        }
                    }
                }
            }
            if (tempPerson.getStatus() == status.brother) {
                System.out.println("У " + tempPerson.getName() + " есть брат или сестра?");
                String answer = scanner.next();
                answer = answer.toLowerCase();
                String yes = "да";
                if (Objects.equals(answer, yes)) {
                    System.out.println("Введите имя брата(сестры): ");
                    String answer2 = scanner.next();
                    for (int j = 0; j < familyList.size(); j++) {
                        Person tempPerson2 = familyList.get(j);
                        if ((Objects.equals(answer2, tempPerson2.getName())) && ((tempPerson2.getStatus() == status.brother) || tempPerson2.getStatus() == status.sister)) {
                            String name = tempPerson.getName();
                            LinkedList list = new LinkedList<>();
                            list.add(tempPerson2);
                            System.out.println("Дети " + name + list);
                            saveFiles.savefile(list.toString());
                        }
                    }
                }
            }
            if (tempPerson.getStatus() == status.sister) {
                System.out.println("У " + tempPerson.getName() + " есть брат или сестра?");
                String answer = scanner.next();
                answer = answer.toLowerCase();
                String yes = "да";
                if (Objects.equals(answer, yes)) {
                    System.out.println("Введите имя брата(сестры): ");
                    String answer2 = scanner.next();
                    for (int j = 0; j < familyList.size(); j++) {
                        Person tempPerson2 = familyList.get(j);
                        if ((Objects.equals(answer2, tempPerson2.getName())) && ((tempPerson2.getStatus() == status.brother) || tempPerson2.getStatus() == status.sister)) {
                            String name = tempPerson.getName();
                            LinkedList list = new LinkedList<>();
                            list.add(tempPerson2);
                            System.out.println("Братья/сестры " + name + list);
                            saveFiles.savefile(list.toString());
                        }
                    }
                }
            }
            if ((tempPerson.getStatus() == status.wife) || (tempPerson.getStatus() == status.husband)) {
                System.out.println("Введите имя супргуга " + tempPerson.getName() + ": ");
                String answer = scanner.next();
                for (int j = 0; j < familyList.size(); j++) {
                    Person tempPerson2 = familyList.get(j);
                    if ((Objects.equals(answer, tempPerson2.getName())) && ((tempPerson2.getStatus() == status.husband) || tempPerson2.getStatus() == status.wife)) {
                        String name = tempPerson.getName();
                        LinkedList list = new LinkedList<>();
                        list.add(tempPerson2);
                        System.out.println("Супруг " + name + list);
                        saveFiles.savefile(list.toString());
                    }
                }
            }
        }
        return familyList;
    }
}
