public class MarsWeightCalculator {
    float marsWeightZhusubaliev;

    public static void main(String[] args) {
        MarsWeightCalculator calculator = new MarsWeightCalculator();
        calculator.calculateWeightOnMars();
    }

    public void calculateWeightOnMars() {
        float earthWeightZhusubaliev = 100.0f;
        float marsGravity = 0.38f;

        marsWeightZhusubaliev = earthWeightZhusubaliev * marsGravity;

        double marsWeightDouble = marsWeightZhusubaliev;

        System.out.printf("Your weight on Mars: %.4f\n", marsWeightDouble);

        int marsWeightInt = (int) marsWeightDouble;
        System.out.println("Weight on Mars casted to int: " + marsWeightInt);

        char marsWeightChar = (char) marsWeightInt;
        System.out.println("Weight on Mars casted to char: " + marsWeightChar);

        int newIntValue = marsWeightChar + 10;
        System.out.println("Adding 10 to char value: " + newIntValue);
    }
}
