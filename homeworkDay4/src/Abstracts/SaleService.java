package Abstracts;

import objects.Campaign;
import objects.Game;
import objects.Gamer;
import objects.Sale;

public interface SaleService {
	
	void shoppingDefault(Gamer gamer,Game game,Sale sale);
	void installmentShopping(Gamer gamer,Game game,Sale sale);
	void campaignShopping(Gamer gamer,Game game,Sale sale,Campaign campaign);

}
