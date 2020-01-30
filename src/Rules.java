public class Rules {


    public static class NON_VALUED_CUSTOMER {
        public static final String[] LEVEL_1 = {
                Constants.CATEGORY.HIGH,Constants.CATEGORY.LOW,Constants.CATEGORY.LOW};

        public static final String[] LEVEL_2 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM};

        public static final String[] LEVEL_3 = {
                Constants.CATEGORY.HIGH,Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM};
    }

    public static class VALUED_CUSTOMER {
        public static final String[] LEVEL_1 = {
                Constants.CATEGORY.MEDIUM,Constants.CATEGORY.LOW,Constants.CATEGORY.LOW};

        public static final String[] LEVEL_2 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.MEDIUM,Constants.CATEGORY.MEDIUM};

        public static final String[] LEVEL_3 = {
                Constants.CATEGORY.LOW,Constants.CATEGORY.LOW,Constants.CATEGORY.HIGH};
    }
}
