package managers;

import Abstracts.GamerService;
import objects.Gamer;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getUserName()+" kullanýcý adý ile sisteme baþarýyla eklenmiþtir.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" sistemden baþarýyla silinmiþtir.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" kullanýcýsýnýn bilgileri baþarýyla güncellenmiþtir.");
		
	}



}
