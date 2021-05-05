package managers;

import Abstracts.GameService;
import objects.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" sisteme ba�ar�yla eklenmi�tir."+" �r�n fiyat� : "+game.getPrice()+"$");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" sistemden ba�ar�yla silinmi�tir.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" ba�ar�yla g�ncellenmi�tir.");
		
	}

	

}

