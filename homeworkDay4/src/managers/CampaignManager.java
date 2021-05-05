package managers;

import Abstracts.CampaignServices;
import objects.Campaign;
import objects.Game;

public class CampaignManager implements CampaignServices {

	@Override
	public void newCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName()+" oyununda þok "+campaign.getName()+" kampanyasý. Bu fýrsat kaçmaz."+" Kampanyalý olarak bu oyuna $"+game.getPrice()+" yerine "+"$"+(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100))+"'a sahip olabilirsiniz.");
		
	}

	@Override
	public void finishCampaign(Game game, Campaign campaign) {
		System.out.println("Üzgünüz! "+ game.getName()+" "+campaign.getName()+" kampanyasý sona ermiþtir.");
		
	}

}
