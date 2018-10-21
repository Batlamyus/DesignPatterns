package cloneable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Clon clon1 = new Clon();
        clon1.setName("Name");
        clon1.setNumber(123);
        Clon clon2 = (Clon) clon1.clone();
        clon2.setName("CLON2");
        System.out.println("clon1" + clon1.toString());
        System.out.println("clon2" + clon2.toString());

        Notclon notclon1= new Notclon();
        Notclon notclon2 = notclon1;

        System.out.println("Notclon 1" + notclon1.toString());
        System.out.println("Notclon 2" + notclon2.toString());
        System.out.println("--------------");
        notclon1.setName("Notclon1");
        System.out.println(notclon2.getName());
        notclon2.setName("Notclon2");
        System.out.println(notclon1.getName());

        System.out.println(clon2.getName());
        System.out.println(clon1.getName());

    }
}
