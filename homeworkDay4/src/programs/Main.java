package programs;

import java.rmi.RemoteException;


import objects.Campaign;
import objects.Game;
import objects.Gamer;
import objects.Sale;
import managers.CampaignManager;
import managers.GameManager;
import managers.GamerCheckManager;
import managers.GamerManager;
import managers.SaleManager;

public class Main {

	public static void main(String[] args) throws RemoteException {
	
	Gamer gamer1 = new Gamer(123456,"Hüseyin","DURAN","hüseyin@gmail.com","12345678912",1997,1235,"'zýnk'",3658);	
	Gamer gamer2 = new Gamer(654321,"Yusuf","HOR","yusuf@gmail.com","21987654321",2005,4935,"'yorgunSavascý'",2589);	
	Game game1 = new Game(1066630,"GTA V",63,"BAHAR");
	Game game2 = new Game(20256987,"Avangers",40,"");
	Campaign campaign1 = new Campaign(11, "Bir haftalýk bir kampanya.", 6, "BAHAR", "'bhr7gn'") ;
	Campaign campaign2 = new Campaign(25, "5 günlük bir kampanya.", 8, "YAZ TATÝLÝ", "'yz5gn'") ;
	Sale sale1 = new Sale(2,2569,7);
	Sale sale2 = new Sale(3,1598,3);
	
	
	System.out.println("------Confirm------");
	GamerCheckManager gamerCheckManager = new GamerCheckManager();
	gamerCheckManager.IfRealPerson(gamer1);
	gamerCheckManager.IfRealPerson(gamer2);
	
	
	System.out.println("-------Gamer--------");
	GamerManager gamerManager = new GamerManager();
	gamerManager.add(gamer2);
	gamerManager.delete(gamer1);
	gamerManager.update(gamer2);
	
	System.out.println("--------Game-------");
	GameManager gameManager = new GameManager();
	gameManager.add(game2);
	gameManager.update(game1);
	gameManager.delete(game2);
		
    System.out.println("--------Campaign--------");
	CampaignManager campaignManager = new CampaignManager();
	campaignManager.newCampaign(game1, campaign1);
	campaignManager.finishCampaign(game2, campaign2);
	
	System.out.println("--------Sale---------");
	SaleManager saleManager = new SaleManager();
	saleManager.campaignShopping(gamer2, game2, sale1, campaign1);
	saleManager.installmentShopping(gamer1, game1, sale1);
	saleManager.shoppingDefault(gamer1, game2, sale1);
	saleManager.campaignShopping(gamer2, game2, sale2, campaign2);

	}

}
