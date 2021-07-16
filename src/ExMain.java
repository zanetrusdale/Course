import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExMain {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("Wellcome to Kids Paradise");
        System.out.println("---------------------------");
        System.out.println("Infants - from 2 to 4 yo, teacher Maria");
        System.out.println("Toddlers - from 4 to 6 yo, teacher Stella");
        System.out.println("Kids - 6+ yo, teacher Sam");
        System.out.println("---------------------------");

        System.out.println("What do you want to do?");
        System.out.println("1. Search kid by name");
        System.out.println("2. Search kid by number");
        doOptionsForTheMenu();
    }

    public static void doOptionsForTheMenu() {
        Scanner input = new Scanner(System.in);
        byte choise = input.nextByte();

        switch (choise) {
            case 1:
                List<Kid> groupOfKids = new ArrayList<>();
                addKidsToArray(groupOfKids);


        }
    }

    public static void addKidsToArray(List<Kid> groupOfKids) {
        groupOfKids = new ArrayList<>();
        groupOfKids.add(new Kid("John", 4, 1, "Toddlers", "Stella"));
        groupOfKids.add(new Kid("Petr", 2, 2, "Infants", "Maria"));
        groupOfKids.add(new Kid("Niya", 3, 3, "Infants", "Maria"));
        groupOfKids.add(new Kid("Alice", 5, 4, "Toddlers", "Stella"));
        groupOfKids.add(new Kid("Mike", 7, 5, "Kids", "Sam"));
        groupOfKids.add(new Kid("Alex", 4, 6, "Toddlers", "Stella"));
        groupOfKids.add(new Kid("Toshi", 6, 7, "Kids", "Sam"));
        groupOfKids.add(new Kid("Zane", 3, 8, "Infants", "Maria"));
        groupOfKids.add(new Kid("Eliza", 2, 9, "Infants", "Maria"));
        groupOfKids.add(new Kid("Nikol", 5, 10, "Toddlers", "Stella"));
        groupOfKids.add(new Kid("Elizabeth", 2, 11, "Infants", "Maria"));
        groupOfKids.add(new Kid("George", 3, 12, "Infants", "Maria"));
        groupOfKids.add(new Kid("Vladi", 7, 13, "Kids", "Sam"));
        groupOfKids.add(new Kid("Vlems", 6, 14, "Kids", "Sam"));
        groupOfKids.add(new Kid("Luca", 2, 15, "Infants", "Maria"));
        groupOfKids.add(new Kid("Miro", 4, 16, "Toddlers", "Stella"));
        groupOfKids.add(new Kid("Maria", 5, 17, "Toddlers", "Stella"));

        sortKidsBySearch(groupOfKids);
    }


    public static void sortKidsBySearch(List<Kid> groupOfKids) {
        System.out.println("Type a name, you want to search:");

        String searchName = input.nextLine();
        List<Kid> sortKids = groupOfKids.stream()
                .sorted(Comparator.comparing(Kid -> Kid.age))
                .collect(Collectors.toList());

        sortKids.forEach(Kid -> {
                    if (Kid.name.equals(searchName) || Kid.name.contains(searchName)) {
                        System.out.println(Kid.name + " - " + Kid.age + "yo" + "\n Group - " + Kid.type + "\n Teacher - " + Kid.teacher);
                    }

                }
        );

    }
}
