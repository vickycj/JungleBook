public class Constants {

    public static class CATEGORY {
        public static final String HIGH = "high";
        public static final String MEDIUM = "medium";
        public static final String LOW = "low";
        public static final String VERY_HIGH = "very-high";
    }

    public static class LEVELS {
        public static final int LEVEL_1 = 1;
        public static final int LEVEL_2 = 2;
        public static final int LEVEL_3 = 3;
    }

    public static class ANIMALS {
        public static final Animal GOAT = new Animal(1, ANIMALS_NAMES.GOAT,CATEGORY.LOW);
        public static final Animal MONKEY = new Animal(1, ANIMALS_NAMES.MONKEY,CATEGORY.MEDIUM);
        public static final Animal TIGER = new Animal(1, ANIMALS_NAMES.TIGER,CATEGORY.MEDIUM);
        public static final Animal LION = new Animal(1, ANIMALS_NAMES.LION,CATEGORY.HIGH);
        public static final Animal DINO = new Animal(1, ANIMALS_NAMES.DINO,CATEGORY.VERY_HIGH);
    }

    public static class ANIMALS_NAMES {
        public static final String LION = "lion";
        public static final String TIGER = "tiger";
        public static final String MONKEY = "monkey";
        public static final String GOAT = "goat";
        public static final String DINO = "dino";

    }


}
