public class Main {
    public static void main(String[] args) {
        var WorkingHours = 640;
        var Work = 8;
        var worker = WorkingHours / Work;
        System.out.println("Всего работников в компании - " + worker + " человек.");
        worker = worker + 94;
        WorkingHours = worker * Work;
        System.out.println("Если в компании работает " + worker + " человек,то всего " + WorkingHours + " часа работы может быть поделено между сотрудниками.");
    }
}