public class Test {
    public static void main(String[] args) throws InvalidSquareException {
        try {
            Square hmm = new Square("a1");
        } catch (InvalidSquareException e) {
            System.out.println("InvalidSquareexception for valid square: " + e.getMessage());
        }
        try {
            String invalidSquare = "ihh";
            Square hm = new Square(invalidSquare);
        } catch (InvalidSquareException e) {
            System.out.println("InvalidSquareException for invalid square: " + e.getMessage());
        }
        Square s = new Square("f7");
        System.out.println(s.getFile() == s.toString().charAt(0));
        System.out.println(s.getRank() == s.toString().charAt(1));
        Square s2 = new Square('e', '4');
        System.out.println(s2.toString().equals("e4"));
    }
}