public class seasonn {
    public static void main(String[] args) {
        Season season1 = Season.SPRING;
        System.out.println(season1);
        print(Season.SUMMER);
        printAllValues();

        Season season2 = Season.valueOf("WINTER");
        System.out.println(season2);
    }

    public static void print(Season season) {
        switch (season) {
            case AUTUMN -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case WINTER -> System.out.println("Я люблю зиму");
            case SUMMER -> System.out.println("Я люблю лето");
        }
    }

    public static void printAllValues() {
        for (Season s : Season.values()) {
            System.out.println(s+"  "+s.getTem() + " " +
                    " "+s.getDescription());
        }
    }
}