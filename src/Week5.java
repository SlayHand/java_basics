import java.util.Calendar;

public class Week5 {

    public static void main(String[] args) {
        System.out.println("ÜL 84");
        ul84();

        System.out.println("Ül 93");
        ul93();
    }

    static class Counter {
        private int value;
        private boolean check;

        public Counter(int startingValue, boolean check) {
            this.value = startingValue;
            this.check = check;
        }

        public Counter(int startingValue) {
            this(startingValue, false);
        }

        public Counter(boolean check) {
            this(0, check);
        }

        public Counter() {
            this(0, false);
        }

        public int value() {
            return this.value;
        }

        public void increase() {
            this.value++;
        }

        public void decrease() {
            if (this.check) {
                if (this.value > 0) this.value--;
            } else {
                this.value--;
            }
        }

        public void increase(int increaseAmount) {
            if (increaseAmount > 0) this.value += increaseAmount;
        }

        public void decrease(int decreaseAmount) {
            if (decreaseAmount > 0) {
                if (this.check) {
                    this.value = Math.max(0, this.value - decreaseAmount);
                } else {
                    this.value -= decreaseAmount;
                }
            }
        }
    }

    static void ul84() {
        Counter c1 = new Counter(10, true);
        c1.decrease();
        System.out.println("c1 value: " + c1.value()); // 9

        Counter c2 = new Counter(5);
        c2.decrease(10); // check off → can go negative
        System.out.println("c2 value: " + c2.value()); // -5

        Counter c3 = new Counter(true);
        c3.decrease(5); // check on → not below 0
        System.out.println("c3 value: " + c3.value()); // 0

        Counter c4 = new Counter();
        c4.increase(7);
        System.out.println("c4 value: " + c4.value()); // 7
    }

    ///  ///

    static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }

        public boolean earlier(MyDate compared) {
            if (this.year != compared.year) return this.year < compared.year;
            if (this.month != compared.month) return this.month < compared.month;
            return this.day < compared.day;
        }

        public int differenceInYears(MyDate compared) {
            int diff = Math.abs(this.year - compared.year);

            // determine earlier/later
            MyDate earlier = this.earlier(compared) ? this : compared;
            MyDate later   = this.earlier(compared) ? compared : this;

            // if later date hasn't reached the earlier's month/day yet, subtract 1
            if (later.month < earlier.month ||
                    (later.month == earlier.month && later.day < earlier.day)) {
                diff--;
            }
            return diff;
        }
    }

    static class Person {
        private String name;
        private MyDate birthday;

        public Person(String name, int dd, int mm, int yy) {
            this.name = name;
            this.birthday = new MyDate(dd, mm, yy);
        }

        public Person(String name, MyDate birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        public Person(String name) {
            this.name = name;
            int day = Calendar.getInstance().get(Calendar.DATE);
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            this.birthday = new MyDate(day, month, year);
        }

        public int age() {
            int day = Calendar.getInstance().get(Calendar.DATE);
            int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int year = Calendar.getInstance().get(Calendar.YEAR);
            MyDate today = new MyDate(day, month, year);
            return this.birthday.differenceInYears(today);
        }

        public boolean olderThan(Person compared) {
            return this.birthday.earlier(compared.birthday);
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name + ", born " + this.birthday;
        }
    }

    static void ul93() {
        Person fredy = new Person("Fredy", 29, 10, 1995);
        Person artur = new Person("Artur", 1, 1, 1994);

        System.out.println(artur.getName() + " age " + artur.age() + " years");
        System.out.println(fredy.getName() + " age " + fredy.age() + " years");

        Person martin = new Person("Martin", 1, 3, 1983);
        Person another = new Person("Agnes", 15, 3, 2000);
        System.out.println(martin.getName() + " is older than " + another.getName() + ": " + martin.olderThan(another));
        System.out.println(another.getName() + " is older than " + martin.getName() + ": " + another.olderThan(martin));

        Person p1 = new Person("Joe", new MyDate(15, 2, 1943));
        Person p2 = new Person("Mama");
        System.out.println(p1);
        System.out.println(p2);
    }
    }



