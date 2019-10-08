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
		String[] cards ={"card1","card2","card3","card4","card5","card6","card7","card8","card9","card10","card11","card12","card13"};
		List<String>Linkedcards = new ArrayList<>();
		for(int i =0;i<cards.length;i++){
		Linkedcards.add(cards[i]);
		}


		String[] money ={"R100","200","R300","R1","R5000","R10000","R40000","R60000","R75000","R100000",
		"R250000","R1000000","R2"};
		List<String>listMoney = new ArrayList<>();
		for(int i =0;i<money.length;i++){
		listMoney.add(money[i]);
		Collections.shuffle(listMoney);
		}





		practice p1 = new practice(Linkedcards);
		System.out.println(p1);

		for(int i =0;i<7;i++){
		System.out.println("pick a card");
		String num = in.nextLine().toLowerCase();
		if((p1.getcards()).contains(num)){
		String cash = listMoney.get((p1.getcards()).indexOf(num));
		System.out.println(cash);


		//for(int i =0;i<listMoney.size();i++){


		if((p1.getcards()).contains(num)){
			listMoney.remove((p1.getcards()).indexOf(num));
			String card = Linkedcards.remove((p1.getcards()).indexOf(num));
			System.out.println("available cards: " + p1);
		}


		else{
			System.out.println("not found");
		}
		}
		}
		System.out.println("end of round 1");
		//round 1
		System.out.println("deal or no deal?");
		String response1 = in.nextLine().toLowerCase();
		
		if(response1.equals("no deal")){
			
		
			for(int i =0;i<6;i++){
			System.out.println("available cards: " + p1);
			System.out.println("pick a card");
			String num = in.nextLine().toLowerCase();
			if((p1.getcards()).contains(num)){
			String cash = listMoney.get((p1.getcards()).indexOf(num));
			System.out.println(cash);


			//for(int i =0;i<listMoney.size();i++){


			if((p1.getcards()).contains(num)){
				listMoney.remove((p1.getcards()).indexOf(num));
				String card = Linkedcards.remove((p1.getcards()).indexOf(num));
				//System.out.println("available cards: " + p1);
			}
			
			else{
				System.out.println("not found");
			}
			}
			}
			System.out.println("end of round 2");
			//round 2
			System.out.println("deal or no deal?");
			String response2 = in.nextLine().toLowerCase();
			
			/*if(response2.equals("no deal")){
				for(int i =0;i<5;i++){
				System.out.println("pick a card");
				String num = in.nextLine().toLowerCase();
				if((p1.getcards()).contains(num)){
				String cash = listMoney.get((p1.getcards()).indexOf(num));
				System.out.println(cash);


				//for(int i =0;i<listMoney.size();i++){


				if((p1.getcards()).contains(num)){
					listMoney.remove((p1.getcards()).indexOf(num));
					String card = Linkedcards.remove((p1.getcards()).indexOf(num));
					//System.out.println("available cards: " + p1);
				}

				else{
					System.out.println("not found");
				}
				}
				}
				System.out.println("end of round 3");
				//round 3
				
				System.out.println("deal or no deal?");
				String response3 = in.nextLine().toLowerCase();
				
				if(response3.equals("no deal")){
					for(int i =0;i<4;i++){
					System.out.println("pick a card");
					String num = in.nextLine().toLowerCase();
					if((p1.getcards()).contains(num)){
					String cash = listMoney.get((p1.getcards()).indexOf(num));
					System.out.println(cash);


					//for(int i =0;i<listMoney.size();i++){


					if((p1.getcards()).contains(num)){
						listMoney.remove((p1.getcards()).indexOf(num));
						String card = Linkedcards.remove((p1.getcards()).indexOf(num));
						//System.out.println("available cards: " + p1);
					}

					else{
						System.out.println("not found");
					}
					}
					}
					System.out.println("end of round 4");
					//round 4
					
					System.out.println("deal or no deal?");
					String response4 = in.nextLine().toLowerCase();
					
					if(response4.equals("no deal")){
						for(int i =0;i<3;i++){
							System.out.println("pick a card");
							String num = in.nextLine().toLowerCase();
							if((p1.getcards()).contains(num)){
							String cash = listMoney.get((p1.getcards()).indexOf(num));
							System.out.println(cash);


							//for(int i =0;i<listMoney.size();i++){


							if((p1.getcards()).contains(num)){
								listMoney.remove((p1.getcards()).indexOf(num));
								String card = Linkedcards.remove((p1.getcards()).indexOf(num));
								//System.out.println("available cards: " + p1);
							}

							else{
								System.out.println("not found");
							}
							}
							}
							System.out.println("end of round 5");
							//round 5
							
							System.out.println("deal or no deal?");
							String response5 = in.nextLine().toLowerCase();
							
							if(response5.equals("no deal")){
								for(int i =0;i<2;i++){
									System.out.println("pick a card");
									String num = in.nextLine().toLowerCase();
									if((p1.getcards()).contains(num)){
									String cash = listMoney.get((p1.getcards()).indexOf(num));
									System.out.println(cash);


									//for(int i =0;i<listMoney.size();i++){


									if((p1.getcards()).contains(num)){
										listMoney.remove((p1.getcards()).indexOf(num));
										String card = Linkedcards.remove((p1.getcards()).indexOf(num));
										//System.out.println("available cards: " + p1);
									}

									else{
										System.out.println("not found");
									}
									}
									}
									System.out.println("end of round 6");
									//round 6
									
									System.out.println("deal or no deal?");
									String response6 = in.nextLine().toLowerCase();
									
									if(response6.equals("no deal")){
										for(int i =0;i<1;i++){
										System.out.println("pick a card");
										String num = in.nextLine().toLowerCase();
										if((p1.getcards()).contains(num)){
										String cash = listMoney.get((p1.getcards()).indexOf(num));
										System.out.println(cash);


										//for(int i =0;i<listMoney.size();i++){


										if((p1.getcards()).contains(num)){
											listMoney.remove((p1.getcards()).indexOf(num));
											String card = Linkedcards.remove((p1.getcards()).indexOf(num));
											//System.out.println("available cards: " + p1);
										}

										else{
											System.out.println("not found");
										}
										}
										}
										System.out.println("end of round 7");
										//round 7
										}
									}
								}
							}
						}
					}
					
				}*/
				
			}
			
		
		}

		

		

		
		
		
		
		
	}
