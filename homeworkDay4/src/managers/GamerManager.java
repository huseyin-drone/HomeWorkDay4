package managers;

import Abstracts.GamerService;
import objects.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getUserName()+" kullan�c� ad� ile sisteme ba�ar�yla eklenmi�tir.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" sistemden ba�ar�yla silinmi�tir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" kullan�c�s�n�n bilgileri ba�ar�yla g�ncellenmi�tir.");
		
	}



}
