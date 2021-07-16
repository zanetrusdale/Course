import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first search");
        double startingPrice = scanner.nextDouble();

        System.out.println("Enter second search");
        double endingPrice = scanner.nextDouble();

        List<IceCream> types = new ArrayList<>();
        types.add(new IceCream("Melba", "Choko","Funnia" ,5));
        types.add(new IceCream("Melba", "Vannilia","Plastic" ,1));
        types.add(new IceCream("Melba", "Choko", "Plastic",3));

        List<IceCream> sortedIceCreams = types.stream()
                .sorted(Comparator.comparing(iceCream -> iceCream.price))
                .collect(Collectors.toList());

        sortedIceCreams.forEach(IceCream ->{
        if (IceCream.price >= startingPrice && IceCream.price <= endingPrice) {
            System.out.println(IceCream.name + " " + IceCream.type + " " + IceCream.cup);
        } else {
            System.out.println("-------------------");
        }
                }
        );





                //iceCream -> System.out.println(iceCream.name));

        //   for (IceCream item: sortedIceCreams){
        //       System.out.println(item.name);
        //  }
    }
}
