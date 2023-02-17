public class Start {
    public static void main(String[] args) {
        for (Month months : Month.values()) {
            if (months.name().endsWith("Y")) {
                System.out.printf("The month %s ends with Y.\n", months.name());
            } else {
                System.out.printf("The month %s doesn't end with Y.\n", months.name());
            }
        }

    }
}
