public class check {
    public static void main(String[] args) {
        String word="avfSD67 ghsd9";
        String abc= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String newWord= "";
        for (int i=0;i<word.length();i++){
            for(int j=0;j<abc.length();j++){
                if(word.charAt(i)==abc.charAt(j)){
                    newWord+=word.charAt(i);
                }
            }

        }
        newWord=newWord.toLowerCase();
        System.out.println(newWord);
    }
}
