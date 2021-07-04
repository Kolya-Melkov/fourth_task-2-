public class BmiService {
    String calculate(double weight, double height) {
        double imt = weight / (height * height);
        String result;
        if (imt <= 15.99) {
            result = "Выраженный дефицит массы тела";
        }
        else if (imt >= 16.00 && imt <= 18.49) {
            result = "Недостаточная (дефицит) масса тела";
        }
        else if (imt >= 18.50 && imt <= 24.99) {
            result = "Норма";
        }
        else if (imt >= 25.00 && imt <= 29.99) {
            result = "Избыточная масса тела (предожирение)";
        }
        else {
            result = "ожирение";
        }
        return result;
    }
}
