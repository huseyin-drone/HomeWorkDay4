package managers;

import Abstracts.CampaignServices;
import objects.Campaign;
import objects.Game;

public class CampaignManager implements CampaignServices {

	@Override
	public void newCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName()+" oyununda �ok "+campaign.getName()+" kampanyas�. Bu f�rsat ka�maz."+" Kampanyal� olarak bu oyuna $"+game.getPrice()+" yerine "+"$"+(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100))+"'a sahip olabilirsiniz.");
		
	}

	@Override
	public void finishCampaign(Game game, Campaign campaign) {
		System.out.println("�zg�n�z! "+ game.getName()+" "+campaign.getName()+" kampanyas� sona ermi�tir.");
		
	}

}
