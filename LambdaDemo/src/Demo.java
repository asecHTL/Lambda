public class Demo {

    Calculator add = (number1 , number2) ->  number1 + number2;
    Calculator subtract = (number1 , number2) ->  number1 - number2;

    GenericMapper<Float>mapFloat = param -> "This is a float" + param;
    GenericMapper<Integer>mapInt = param -> "This is an integer" + param;

    TextFormater formater;

    public void setFormater(TextFormater formater) {
        this.formater = formater;
    }

    public String format(String text){
        return formater.format(text);
    }

    public int add(int number1, int number2) {
        return add.calculate(number1 , number2);
    }



}
