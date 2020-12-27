package TestDome;

import java.util.HashMap;

public class KeyPhrase {




    public static void main(String[] args) {

        String text = "Stream API is one of the main features of Java 8. We can use this feature to loop through a Map and Java as well but as in previous examples, we need to obtain a set of entries first";

        String array [] = text.split(" ");

        HashMap<String,Integer> wordFeq = new HashMap<>();

        String key="";
        int val = 0;

        for (String txt : array){
            if(wordFeq.containsKey(txt)){
                int feq = wordFeq.get(txt);
                wordFeq.put(txt, ++feq);
            }
            else{
                wordFeq.put(txt, 1);
            }

            if(val<wordFeq.get(txt)){
                val= wordFeq.get(txt);
                key=txt;
            }
        }

        System.out.println(wordFeq);
        System.out.println(key+" = "+val);
    }

}
