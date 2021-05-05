package Abstracts;

import objects.Campaign;
import objects.Game;

public interface CampaignServices {
	
void newCampaign(Game game,Campaign campaign);
void finishCampaign(Game game,Campaign campaign);

}

