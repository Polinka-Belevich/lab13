package ZADANIE1;

public class App {
    public static void main(String[] args) {
        Tester tester = new Tester("Полина", "Белевич", 5, "Advanced", 5000);
        tester.work();
        tester.work(8);
        tester.work("Mobile App");
        Tester.printTesterInfo(tester);
    }
}
