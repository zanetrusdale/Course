public class ExampleForInterface {
    public static void main(String[] args) {
        String name = "Toshi";

      //  Example a = () -> System.out.println(name + " says hello!");
     //   a.data();

        Example example = (a,b) -> {return "The addition of a and b is " + (a+b);};
        System.out.println(example.data(6,5));
    }
}
