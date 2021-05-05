package objects;

public class Sale {
	
    private int id;
	private int campaignCode;
	private int installment;
	
	public Sale(int id, int campaignCode, int installment) {
		super();
		this.id = id;
		this.campaignCode = campaignCode;
		this.installment = installment;
	}

	public int getId() {
		return id;
	}

	public int getCampaignCode() {
		return campaignCode;
	}

	public int getInstallment() {
		return installment;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCampaignCode(int campaignCode) {
		this.campaignCode = campaignCode;
	}

	public void setInstallment(int installment) {
		this.installment = installment;
	}
}
