public class FakeBinary {
    public static String fakeBin(String numberString) {
      String fakeBinary = "";
      char [] charArray = numberString.toCharArray();
      for(int i = 0; i < charArray.length; i++){
        int a = Integer.parseInt(String.valueOf(charArray[i]));
        System.out.print(a + " ");
        if(a < 5) fakeBinary = fakeBinary + "0";
        else fakeBinary = fakeBinary + "1";
      }
      return fakeBinary;
    }


    public static String fakeBin2(String numberString){
      char [] charArray = numberString.toCharArray();
      for(int i = 0; i < charArray; i++){
        if(String.valueOf(charArray[i]) < 5) charArray[i] = '0';
        else charArray[i] = '1';
      }
      String resp = String(charArray);
      return resp;
    }
    
    public static void main(String [] args){
      if(fakeBin("0123456789").equals("0000011111"))
        System.out.println("top");
      else System.out.println("Pooutz");
      if(fakeBin2("0123456789").equals("0000011111"))
        System.out.println("top");
      else System.out.println("Pooutz");
      
    }
}

