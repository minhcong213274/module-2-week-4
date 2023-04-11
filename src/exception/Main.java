package exception;


public class Main {

    public static void main(String[] args) {
        try {
            Tritangle tritangle = new Tritangle(0,4,5);
            System.out.println(tritangle);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("a");

    }

}
