package domain;
import helper.ScanHelper;

public class Campaign {
	
	private String title;
	private double estimatedCost;
	private String finishDate;
	private String startDate;

	public  Campaign() {}
	
	
	public static Campaign createCampaign() {
		
		String title ,finishDate ,startDate;
		Double estimatedCost;
		
		System.out.println("Campaign Title= ");
		title = ScanHelper.scanString();
		
		System.out.println("Campaign Start Date= " );
		startDate = ScanHelper.scanString();
		
		System.out.println("Campaign Finish Date= " );
		finishDate = ScanHelper.scanString();
		
		System.out.println("Campaign Estimated Cost= " );
		estimatedCost = ScanHelper.scanDouble();
		
		Campaign campaign = new Campaign(title, startDate ,finishDate ,estimatedCost);
		return campaign;
		
	}

	public Campaign(String title, String startDate ,String finishDate ,double estimatedCost) {
			super();
			this.title = title;
			this.estimatedCost = estimatedCost;
			this.finishDate = finishDate;
			this.startDate = startDate;
		}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getEstimatedCost() {
		return estimatedCost;
	}
	
	public void setEstimatedCost(double estimatedCost) {
		this.estimatedCost = estimatedCost;
	}
	
	public String getFinishDate() {
		return finishDate;
	}
	
	public void setFinishDate(String finishDate) {
		this.finishDate = finishDate;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
