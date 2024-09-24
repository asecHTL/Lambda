import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Demo demo = new Demo();
        ArrayList<String>list = new ArrayList<>();
        list.add("Java");
        list.add("C#");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(System.out::println);


        TextFormater ask = text -> text + "?";
        TextFormater shout = text -> text + "!";

        demo.setFormater(ask);
        String formated = demo.format("Was ist das");
        System.out.println(formated);

        demo.setFormater(shout);
        String formatted = demo.format("Was soll das");
        System.out.println(formatted);
    }
}