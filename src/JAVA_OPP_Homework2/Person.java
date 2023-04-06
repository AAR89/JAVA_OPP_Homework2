package JAVA_OPP_Homework2;

import java.util.LinkedList;
import java.util.Objects;

public class Person {
    private LinkedList family;
    private String name;
    private Integer age;
    private status status;


    public Person(String name, Integer age, status status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public Integer getAge() {
        return age;
    }

    public LinkedList getFamily(Person persona) {
        return persona.getFamily(persona);
    }

    public JAVA_OPP_Homework2.status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " , Возраст: " + age + ", Статус в семье: " + status;
    }

    public static status setStatus(String status) {
        status thisStatus = null;
        LinkedList<String> motherList = new LinkedList<>();
        LinkedList<String> fatherList = new LinkedList<>();
        LinkedList<String> daughterList = new LinkedList<>();
        LinkedList<String> sonList = new LinkedList<>();
        motherList.add("мама");
        motherList.add("мать");
        motherList.add("мамуля");
        motherList.add("mother");
        motherList.add("mom");
        motherList.add("mommy");
        fatherList.add("папа");
        fatherList.add("отец");
        fatherList.add("батя");
        fatherList.add("father");
        fatherList.add("dad");
        fatherList.add("daddy");
        daughterList.add("дочь");
        daughterList.add("daughter");
        daughterList.add("доча");
        daughterList.add("доченька");
        daughterList.add("дочурка");
        sonList.add("сын");
        sonList.add("сынуля");
        sonList.add("сынок");
        sonList.add("сыночек");
        sonList.add("son");
        for (String s : motherList) {
            s = s.toLowerCase();
            if (Objects.equals(s, status)) {
                thisStatus = JAVA_OPP_Homework2.status.mother;
            }
        }
        for (String s : fatherList) {
            s = s.toLowerCase();
            if (Objects.equals(s, status)) {
                thisStatus = JAVA_OPP_Homework2.status.father;
            }
        }
        for (String s : daughterList) {
            s = s.toLowerCase();
            if (Objects.equals(s, status)) {
                thisStatus = JAVA_OPP_Homework2.status.daughter;
            }
        }
        for (String s : sonList) {
            s = s.toLowerCase();
            if (Objects.equals(s, status)) {
                thisStatus = JAVA_OPP_Homework2.status.son;
            }
        }
        return thisStatus;
    }
}

