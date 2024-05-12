import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("今東光", "原一男", "勅使河原蒼風", "五来金造");
        names.stream().filter(name -> name.length() <= 4).map(name -> name + "さん").forEach(System.out::println);
    }
}
