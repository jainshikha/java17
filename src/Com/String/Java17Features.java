package Com.String;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Calendar.*;

public class Java17Features {

    private static void indentText(String indentString) {
        System.out.println(indentString = indentString.indent(10));
        /*          this & that !*/
        System.out.println(indentString.indent(-2));
        /*        this & that ! */
    }

    private static void transformText(String transformString) {

        transformString = transformString.transform(value -> new StringBuilder(value).delete(4, 7).toString());
        System.out.println(transformString);
        /*thisthat !*/
    }

    private static void teeingTest() {
        int x = Stream.of(1, 2, 3, 4, 5).collect(Collectors.teeing(Collectors.minBy(Integer::compareTo), Collectors.maxBy(Integer::compareTo), (min, max) -> min.get() - max.get()));
        System.out.println(x);
        /*-4*/
    }

    private static void toListMethod() {
        System.out.println(Stream.of("A", "b", "c").collect(Collectors.toList()));
        /*[A, b, c]*/
        System.out.println(Stream.of("A", "b", "c").toList());
        /*[A, b, c]*/
    }

    private static void textBlock() {
        String oldText = "{\"key\":\"CP_DoIPRoutingActivationType\",\"value\":\"0\"}";
        System.out.println(oldText);
        /*{"key":"CP_DoIPRoutingActivationType","value":"0"}*/
        String newText = """
                {"key":"CP_DoIPRoutingActivationType","value":"0"}
                        """;
        System.out.println(newText);
        /*{"key":"CP_DoIPRoutingActivationType","value":"0"}*/
    }

   /* private static void switchTest(Object obj) {
        *//*java: patterns in switch statements are a preview feature and are disabled by default.
  (use --enable-preview to enable patterns in switch statements)*//*
        switch (obj) {
            case Integer i -> "Its an integer";
            case String s -> "Its a String";
            case null -> "its a null object";
            default -> "its not a known data type";
        };
    }*/
private static void NullCheck(){
    String str = null;
    str.toLowerCase();
    System.out.println(str);
}
    public static void main(String[] args) {
        indentText("this & that !");
        transformText("this & that !");
        teeingTest();
        toListMethod();
        textBlock();
        NullCheck();
        //switchTest(2);
        int result = switch (FRIDAY){
            case MONDAY, TUESDAY, WEDNESDAY ->1;
            case THURSDAY, FRIDAY-> 2;
            case SATURDAY ->3;
            default -> 0;
        };
        System.out.println(result);
    }

}
