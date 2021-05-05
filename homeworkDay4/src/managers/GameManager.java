package managers;

import Abstracts.GameService;
import objects.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" sisteme baþarýyla eklenmiþtir."+" Ürün fiyatý : "+game.getPrice()+"$");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" sistemden baþarýyla silinmiþtir.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" baþarýyla güncellenmiþtir.");
		
	}

	

}

