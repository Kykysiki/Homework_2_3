public class Main {
    public static void main(String[] args) {
        var WorkingHours = 640;
        var Work = 8;
        var worker = WorkingHours / Work;
        System.out.println("Всего работников в компании - " + worker + " человек.");
        var worker2 = worker + 94;
        System.out.println("Если в компании работает " + worker2 + " человек,то всего " + WorkingHours/worker2 + " часа работы может быть поделено между сотрудниками");
    }
}