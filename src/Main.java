public class Main {

    public static void main(String[] args) {

        SuperZlodeyi kosch = SuperZlodeyi.getZlodeyi();
        System.out.println(kosch);
        System.out.println(kosch.name);

        kosch.setZlodey("Maks");
        System.out.println(kosch);
        System.out.println(kosch.name);

        SuperZlodeyi superZlodeyi = SuperZlodeyi.getZlodeyi("Bob");
        System.out.println(superZlodeyi);
        System.out.println(superZlodeyi.name);

        SuperZlodeyi superZlodeyi2 = SuperZlodeyi.getZlodeyi("Tom");
        System.out.println(superZlodeyi2);
        System.out.println(superZlodeyi2.name);




    }
}
