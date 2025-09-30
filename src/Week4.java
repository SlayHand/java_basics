import java.util.Random;

public class Week4 {

    public static void main(String[] args) {
        System.out.println("ÜL 75");
        ul75();

        System.out.println("Ül 81");
        ul81();
    }

    static class DecreasingCounter {
        private int value;
        private final int initial;

        public DecreasingCounter(int valueAtStart) {
            this.value = valueAtStart;
            this.initial = valueAtStart;
        }

        public void printValue() {
            System.out.println("value: " + this.value);
        }

        public void decrease() {
            if (this.value > 0) {
                this.value--;
            }
        }

        public void reset() {
            this.value = 0;
        }

        public void setInitial() {
            this.value = this.initial;
        }
    }

    static void ul75() {
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
    ///  ///
    static class PasswordRandomizer {
        private final int length;
        private final Random random = new Random();
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public PasswordRandomizer(int length) {
            this.length = length;
        }

        public String createPassword() {
            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                int idx = random.nextInt(ALPHABET.length());
                sb.append(ALPHABET.charAt(idx));
            }
            return sb.toString();
        }
    }

    static void ul81() {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
}
