package ZADANIE1;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    private static String zachet = "zachet";
    public Tester(String name) {
        this.name = name;
    }
    public Tester(String name, String surname) {
        this(name);
        this.surname = surname;

    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this(name, surname);
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;

    }
    public void work() {
        System.out.println(name + " is working.");
    }

    public void work(int hours) {
        System.out.println(name + " is working for " + hours + " hours.");
        System.out.println("zachet: " + zachet);
    }


    public void work(String project) {
        System.out.println(name + " is working on the " + project + " project.");
    }
    public static void printTesterInfo(Tester tester) {
        System.out.println("Tester Info: " + tester.name + " " + tester.surname);

    }

}
