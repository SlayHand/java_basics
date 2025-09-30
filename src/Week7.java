import java.util.ArrayList;
public class Week7 {

    public static void main(String[] args) {
        System.out.println("ÜL 4");
        ul4();
    }

    public static void ul4() {
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 1; i <= 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
        }
    }

    public static class Thing {
        private String name;
        private int weight;

        public Thing(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public int getWeight() {
            return this.weight;
        }

        public String toString() {
            return this.name + " (" + this.weight + " kg)";
        }
    }

    public static class Suitcase {
        private int maxWeight;
        private ArrayList<Thing> things;

        public Suitcase(int maxWeight) {
            this.maxWeight = maxWeight;
            this.things = new ArrayList<Thing>();
        }

        public void addThing(Thing thing) {
            if (this.totalWeight() + thing.getWeight() <= this.maxWeight) {
                this.things.add(thing);
            }
        }

        public int totalWeight() {
            int sum = 0;
            for (Thing t : this.things) {
                sum += t.getWeight();
            }
            return sum;
        }

        public void printThings() {
            for (Thing t : this.things) {
                System.out.println(t);
            }
        }

        public Thing heaviestThing() {
            if (things.isEmpty()) {
                return null;
            }

            Thing heaviest = this.things.get(0);

            for (Thing t : this.things) {
                if (t.getWeight() > heaviest.getWeight()) {
                    heaviest = t;
                }
            }
            return heaviest;
        }

        @Override
        public String toString() {
            int size = this.things.size();
            int totalWeight = this.totalWeight();

            if (size == 0) {
                return "empty (" + totalWeight + " kg)";
            } else if (size == 1) {
                return "1 thing (" + totalWeight + " kg)";
            } else {
                return this.things.size() + " things (" + this.totalWeight() + " kg)";
            }

        }

    }

    public static class Container {
        private int maxWeight;
        private ArrayList<Suitcase> suitcases;

        public Container(int maxWeight) {
            this.maxWeight = maxWeight;
            this.suitcases = new ArrayList<Suitcase>();
        }

        public void addSuitcase(Suitcase suitcase) {
            int currentTotalWeight = this.totalWeight();
            if (currentTotalWeight + suitcase.totalWeight() <= this.maxWeight) {
                this.suitcases.add(suitcase);
            }
        }

        public int totalWeight() {
            int sum = 0;
            for (Suitcase suitcase : this.suitcases) {
                sum += suitcase.totalWeight();
            }
            return sum;
        }

        public void printThings() {
            for (Suitcase s : this.suitcases) {
                s.printThings();
            }
        }

            @Override
            public String toString () {
                return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
            }
        }

}
