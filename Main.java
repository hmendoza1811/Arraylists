import java.util.*; 

class Digits{
  public ArrayList<String> list = new ArrayList<String>(); 
  public Digits(int num){
    String numWord = Integer.toString(num); 
    
    for(int i = 0; i < numWord.length(); i++){
     list.add(numWord.substring(i, i+1)); 
    }
  }

  public ArrayList<String> getDigits(){
    return list; 
  }
}

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.println("Input a number."); 
    int val = input.nextInt(); 
    Digits obj = new Digits(val); 
    System.out.println(obj.getDigits()); 
  }
}