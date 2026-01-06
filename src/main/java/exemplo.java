public class exemplo
{
    public static void main(String[] args) {
        String str = null;
        //str = "Hello World";
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Houve um erro:" + e.toString());
        }
    }
}
