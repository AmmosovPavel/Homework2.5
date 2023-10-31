public class Universe {
    public static void main(String[] args) {
        final long universeAge = 13L * 1000 * 1000 * 1000;
        final int humanAge = 100000; // - возраст как вида
        final long universeOlder = universeAge / humanAge;

        System.out.println("Возраст вселенной " + universeAge + " лет");
        System.out.println("Возраст человека, как вида " + humanAge + " лет");
        System.out.println("Вселенная старше людей в " + universeOlder + " раз");
    }
}
