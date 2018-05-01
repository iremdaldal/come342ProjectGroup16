package domain;
import java.util.Date;


public class Advert {
    private String advertTitle;
    private Date targetCompletionDate;
    private double estimatedAdvertCost;
    private double actualAdvertCost;

    public Advert(String advertTitle, Date targetCompletionDate, double estimatedAdvertCost, double actualAdvertCost) {
        this.advertTitle = advertTitle;
        this.targetCompletionDate = targetCompletionDate;
        this.estimatedAdvertCost = estimatedAdvertCost;
        this.actualAdvertCost = actualAdvertCost;
    }

    public double getCost() {
        return getActualAdvertCost();
    }

    public void createAdvert(String advertTitle, Date targetCompletionDate, double estimatedAdvertCost, double actualAdvertCost) {

    }

    public String getAdvertTitle() {
        return advertTitle;
    }

    public void setAdvertTitle(String advertTitle) {
        this.advertTitle = advertTitle;
    }

    public Date getTargetCompletionDate() {
        return targetCompletionDate;
    }

    public void setTargetCompletionDate(Date targetCompletionDate) {
        this.targetCompletionDate = targetCompletionDate;
    }

    public double getEstimatedAdvertCost() {
        return estimatedAdvertCost;
    }

    public void setEstimatedAdvertCost(double estimatedAdvertCost) {
        this.estimatedAdvertCost = estimatedAdvertCost;
    }

    public double getActualAdvertCost() {
        return actualAdvertCost;
    }

    public void setActualAdvertCost(double actualAdvertCost) {
        this.actualAdvertCost = actualAdvertCost;
    }

}
