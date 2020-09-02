public class ReversedStrings{
  public static String solution(String str) {
    if(str.equals("")){
      return "";
    }
    String [] splitted = str.split("");
    String reverse = "";
    for(int i = splitted.length-1; i >= 0; i--){
      reverse = reverse + splitted[i];
    }
    return reverse;
  }
}