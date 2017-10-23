public class Test {
    public static void main(String[] args) throws InvalidSquareException {
        try {
            Square hmm = new Square("a9");
        } catch (InvalidSquareException e) {
            System.out.println("InvalidSquareexception for valid square: " + e.getMessage());
        }
        try {
            String invalidSquare = "i0";
            Square hm = new Square(invalidSquare);
        } catch (InvalidSquareException e) {
            System.out.println("InvalidSquareException for invalid square: " + e.getMessage());
        }
        Square s4 = new Square("f7");
        System.out.println(s4.getFile() == s4.toString().charAt(0));
        System.out.println(s4.getRank() == s4.toString().charAt(1));
        Square s5 = new Square('e', '4');
        System.out.println(s5.toString().equals("e4"));


        try {
            new Square("a1");
            System.out.println("good 1");
        } catch (InvalidSquareException e) {
            System.out.println("bad 1: " + e.getMessage());
        }
        try {
            String invalidSquare = "a2";
            new Square(invalidSquare);
            System.out.println("bad 2");
        } catch (InvalidSquareException e) {
            System.out.println("good 2: " + e.getMessage());
        }
        Square s = new Square("f7");
        System.out.println('f' == s.getFile());
        System.out.println('7' == s.getRank());
        Square s2 = new Square('e', '4');
        System.out.println("e4".equals(s2.toString()));
    }
}