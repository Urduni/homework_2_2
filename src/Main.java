import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int temperature = 12;
        int age = 40;
        System.out.println(canGo(age, temperature));
        System.out.println(canGo(1, 2));
        System.out.println(canGo(11, 9));
        System.out.println(canGo(43, 55));
        System.out.println(canGo(34, 23));
        System.out.println(canGo(56, 32));
        System.out.println(generateRandomAge()  +" Можно идти гулять");
    }

    public static String canGo(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return " Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
    } else
            return ("Оставайтесь дома");
    }

    public static int generateRandomAge() {
        Random age = new Random();
        int low = 1;
        int high = 100;
        int result = age.nextInt(high-low) + low;
        return result;
    }

}
















