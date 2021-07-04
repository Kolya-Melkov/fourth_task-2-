public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        String result = service.calculate(120,1.9);
        System.out.println(result);
    }
}
