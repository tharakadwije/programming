package TestDome;

public class UserInput {

    public static class TextInput {

        private String value="";
        public void add(char c){
            value = value+c;
        }
        public String getValue(){
           return value;
        }
    }

    public static class NumericInput extends TextInput{
        //@Override
        public void add(char c){
               if(Character.isDigit(c)){
                   super.value =  super.value+c;
               }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}