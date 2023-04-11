package exception;

public class Tritangle {
    private int a,b,c;

    public Tritangle(int a, int b, int c) throws IllegalTriangleException {
        if (a<=0||b<=0||c<=0) throw new  IllegalTriangleException("a,b,c>0");
        if (a>b+c || b>a+c || c>a+b) throw new IllegalTriangleException("cannot");
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
