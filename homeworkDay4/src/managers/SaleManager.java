package managers;

import Abstracts.SaleService;
import objects.Campaign;
import objects.Game;
import objects.Gamer;
import objects.Sale;

public class SaleManager implements SaleService {

	@Override
	public void shoppingDefault(Gamer gamer, Game game, Sale sale) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý kullanýcý "+game.getId()+" kodlu "+game.getName()+" ürününü satýn almýþtýr."+" Ürün fiyatý : $"+game.getPrice());
		
	}

	@Override
	public void installmentShopping(Gamer gamer, Game game, Sale sale) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý kullanýcý "+game.getId()+" kodlu "+game.getName()+" ürününü "+sale.getInstallment()+" taksitle satýn almýþtýr.");
		
	}

	@Override
	public void campaignShopping(Gamer gamer, Game game, Sale sale, Campaign campaign) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" adlý kullanýcý "+game.getId()+" kodlu "+game.getName()+" ürününü "+campaign.getCampaignCode()+" kodu ile satýn almýþtýr."+" Kampanyalý fiyat : $"+(game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100)));
		
	}

}
