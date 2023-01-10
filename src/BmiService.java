public class BmiService {
    double bodyWeigt;
    double height;
    public double calculate (double bodyWeight, double height){
        height = height / 100;
        double bmi = bodyWeight / (Math.pow(height , 2));
        return bmi;
    }

}
