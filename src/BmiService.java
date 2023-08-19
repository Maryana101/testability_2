public class BmiService {
    public int calculate(double weightKg, double heightMtr) {
        return (int) (weightKg / heightMtr / heightMtr);
    }
}
