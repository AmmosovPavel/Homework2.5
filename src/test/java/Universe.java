public class Universe {
    public static void main(String[] args) {
        final long UNIVERSE_AGE = 13L * 1000 * 1000 * 1000;
        final int HUMAN_AGE = 100000; // - возраст как вида
        final long UNIVERSE_OLDER = UNIVERSE_AGE / HUMAN_AGE;

        System.out.println("Возраст вселенной " + UNIVERSE_AGE + " лет");
        System.out.println("Возраст человека, как вида " + HUMAN_AGE + " лет");
        System.out.println("Вселенная старше людей в " + UNIVERSE_OLDER + " раз");
    }
}
