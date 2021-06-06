package base;

import java.text.DecimalFormat;

public class Investment {
    public float principal;
    public float rate;
    public int years;
    public int perYear;
    public float endWorth;

    public float getPrincipal() {
        return principal;
    }

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getPerYear() {
        return perYear;
    }

    public void setPerYear(int perYear) {
        this.perYear = perYear;
    }

    public float getEndWorth() {
        return calculateWorth(principal,years,rate,perYear);
    }

    public float calculateWorth(float principal, int years, float rate, int perYear)
    {
        DecimalFormat df = new DecimalFormat("$0.00");
        double future = (principal * (Math.pow((1 + (rate/ perYear)),(perYear * years))));
        df.format(future); //format decimal places
        return Float.valueOf((float)future);
    }
}
