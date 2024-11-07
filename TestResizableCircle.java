public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle testy = new ResizableCircle(30);
        System.out.println();
        System.out.println(testy.toString());
        testy.Resize(33);
        System.out.println(testy.toString());
        testy.Resize(46);
        System.out.println(testy.toString());
    
    }

}
