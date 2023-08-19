public class Main {
    public static void main(String[] args) {
        double hMtr = 1.87;// рост в метрах
        double mKg = 98; // масса в кг
        BmiService bmiService = new BmiService();
        int bmi = (int) bmiService.calculate(mKg, hMtr);
        System.out.println(bmi);
    }
}