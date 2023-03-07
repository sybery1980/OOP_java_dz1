public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Алекс");
        Person person = new Person("Хозяин");


        // System.out.println(cat);
        // System.out.println(person);
        // System.out.println(person.voice());
        // System.out.println(cat.voice());
        person.call(cat);
        System.out.println(person.getInfo());
        System.out.println(cat.getInfo());
        cat.getCaress(person.caress(3));

        System.out.println(person.getInfo());
        System.out.println(cat.getInfo());



    }
}