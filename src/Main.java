public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeight = 54;
        double height = 166;
        double bmi = Math.round(service.calculate(bodyWeight,height) * 100.0) / 100.0;
        System.out.println("Индекс массы тела " + bmi);
    }
}