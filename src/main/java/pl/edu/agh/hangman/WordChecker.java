package pl.edu.agh.hangman;

public class WordChecker{

    public static String Check(String word, String playersLetter, String wordState){

           if(word.contains(playersLetter)){
               for (int i=0; i<word.length(); i++){
                   if(word.charAt(i)==(playersLetter.charAt(0))) {
                       wordState = wordState.substring(0, i) + playersLetter + wordState.substring(i + 1);
                   }
               }
               return wordState;
           }else{
               return null;
           }
        }
}
