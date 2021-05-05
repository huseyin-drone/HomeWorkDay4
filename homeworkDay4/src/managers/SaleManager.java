package managers;

import Abstracts.SaleService;
import objects.Campaign;
import objects.Game;
import objects.Gamer;
import objects.Sale;

public class SaleManager implements SaleService {

	@Override
	public void shoppingDefault(Gamer gamer, Game game, Sale sale) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� kullan�c� "+game.getId()+" kodlu "+game.getName()+" �r�n�n� sat�n alm��t�r."+" �r�n fiyat� : $"+game.getPrice());
		
	}

	@Override
	public void installmentShopping(Gamer gamer, Game game, Sale sale) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� kullan�c� "+game.getId()+" kodlu "+game.getName()+" �r�n�n� "+sale.getInstallment()+" taksitle sat�n alm��t�r.");
		
	}

	@Override
	public void campaignShopping(Gamer gamer, Game game, Sale sale, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adl� kullan�c� "+game.getId()+" kodlu "+game.getName()+" �r�n�n� "+campaign.getCampaignCode()+" kodu ile sat�n alm��t�r."+" Kampanyal� fiyat : $"+(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100)));
		
	}

}
