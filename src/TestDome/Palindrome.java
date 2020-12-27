package TestDome;

//Palindrome
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("REQ"));
    }

    private static boolean isPalindrome(String deleveled) {
        char[] temp = deleveled.toLowerCase().toCharArray();

        int end = temp.length - 1;
        int mid = temp.length / 2;
        System.out.println(temp);

        for(int i=0; i<mid; i++){
            if(temp[i]!= temp[end--]){
                return false;
            }
        }
        return true;
    }
}
