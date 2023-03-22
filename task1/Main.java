package task1;

public class Main {
        /**
         * @param args
         */
        public static void main(String[] args) {
            Person galya = new Person("Галина", "не работает");
            Person tanya = new Person("Таня", "работает");
            Person kate = new Person("Катя", "работает");
            Person pavel = new Person("Павел", "работает");
            Person ivan = new Person("Ваня", "учится");
            GeoTree gt = new GeoTree();
            gt.append(galya, tanya);
            gt.append(galya, kate);
            gt.append(pavel, tanya);
            gt.append(pavel, kate);
            gt.append(tanya, ivan);
            gt.add(kate, tanya);

            System.out.println(new Research(gt).spend(galya,
                    Relationship.parent));
            System.out.println(new Research(gt).spend(ivan,
                    Relationship.children));
            System.out.println(new Research(gt).spend(kate,
                    Relationship.sister));        

        }
    
}
