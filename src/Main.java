//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task t1 = new task("brush my hair");
        System.out.println(t1.toString());
        t1.markAsComplete();
        System.out.println(t1.toString());

    }
}