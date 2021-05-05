package objects;

public class Campaign {

	private int id;
	private String aboutCampaign;
	private float discountRate;
	private String Name;
	private String campaignCode;
	
	
	public Campaign(int id, String aboutCampaign, float discountRate, String name, String campaignCode) {
		super();
		this.id = id;
		this.aboutCampaign = aboutCampaign;
		this.discountRate = discountRate;
		this.Name = name;
		this.campaignCode = campaignCode;
	}


	public int getId() {
		return id;
	}


	public String getAboutCampaign() {
		return aboutCampaign;
	}


	public float getDiscountRate() {
		return discountRate;
	}
	
	public String getName() {
		return Name;
	}
	


	public String getCampaignCode() {
		return campaignCode;
	}


	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setAboutCampaign(String aboutCampaign) {
		this.aboutCampaign = aboutCampaign;
	}


	public void setDiscountRate(float discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
}
