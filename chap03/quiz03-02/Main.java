public class Main {
    public static void main(String[] args) {
        Func1 f1 = x -> x % 2 == 1;
        Func2 f2 = (point, name) -> name + "さんは" + (point > 65 ? "合格" : "不合格");
        System.out.println(f1.call(5));
        System.out.println(f2.call(70, "田中"));
    }
}
