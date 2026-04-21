public class ArithmeticMain {

    public static void main(String[] args) {

        ArithmeticOperation obj1 = new ArithmeticOperation();

        obj1.setValue1(200);
        obj1.setValue2(100);

        obj1.additionOperation();

        double result = obj1.getResult();

        System.out.println(" Addition is : " + result);
    }
}
