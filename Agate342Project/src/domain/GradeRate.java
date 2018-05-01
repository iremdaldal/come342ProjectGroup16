package domain;
import java.util.Date;

public class GradeRate extends Grade{
    private double rate;
    private Date rateStartDate;
    private Date rateFinishDate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getRateStartDate() {
        return rateStartDate;
    }

    public void setRateStartDate(Date rateStartDate) {
        this.rateStartDate = rateStartDate;
    }

    public Date getRateFinishDate() {
        return rateFinishDate;
    }

    public void setRateFinishDate(Date rateFinishDate) {
        this.rateFinishDate = rateFinishDate;
    }




}
