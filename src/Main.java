public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.60; //Рост человека
        int weight = 59; //Вес человека

        double index = (int) (service.calculate(height, weight));

        System.out.println("Индекс массы тела = " + Math.round(index));
    }
}