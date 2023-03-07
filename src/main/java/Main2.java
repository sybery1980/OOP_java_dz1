public class Main2 {
    public static void main(String[] args) {
        person2 person = new person2("Хозяйн шкафа");
        Closet Closet  = new Closet("Шкаф");

        System.out.println(person);
        System.out.println(Closet);
        person.action(Closet.getAction());
        person.action(Closet.getAction());
        person.action(Closet.getAction());

        System.out.println(person.getInfo());
        System.out.println(Closet.getInfo());
        Closet.AcceptBooks(person.PutBooks(3));
        System.out.println(Closet.getInfo());

    }
}
