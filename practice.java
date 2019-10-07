import java.lang.*;
import java.util.*;

public class practice{
private List<String> cards; 

public practice(List<String> cards){
this.cards = cards;
}
public List<String> getcards(){
return cards;
}
public void bankerCall(){
	
}



public String toString(){

return String.format("%s", cards);
}



public static void main(String[] args){
Scanner in = new Scanner(System.in);
int count = 0;
String[] cards ={"card1","card2","card3","card4","card5","card6","card7","card8","card9","card10","card11","card12","card13"};
List<String>Linkedcards = new ArrayList<>();
for(int i =0;i<cards.length;i++){
Linkedcards.add(cards[i]);
}
String[] money ={"R100","200","R300","R1","R5000","R10000","R40000","R60000","75000","100000",
"250000","1000000","R2"};
List<String>listMoney = new ArrayList<>();
while(count<13){
for(int i =0;i<money.length;i++){
listMoney.add(money[i]);
Collections.shuffle(listMoney);
}


practice p1 = new practice(Linkedcards);
System.out.println(p1);

for(int i =0;i<listMoney.size();i++){
System.out.println("pick a card");
String num = in.nextLine();
if((p1.getcards()).contains(num)){
String cash = listMoney.get((p1.getcards()).indexOf(num));
System.out.println(cash);
}

if((p1.getcards()).contains(num)){
    listMoney.remove((p1.getcards()).indexOf(num));
	String card = Linkedcards.remove((p1.getcards()).indexOf(num));
	
	System.out.println("available cards: " + p1);
}

else{
System.out.println("not found");
}
}
count++;
}






}
}