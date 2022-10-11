public class TipCalculator
{
    private double tBill;
    private double tTip;
    private int people;


    public TipCalculator(double tTip, int people)
    {
        this.tTip = tTip;
        tBill = 0.0;
        this.people = people;


    }

    // sets the values

    public void addMeal(double cost)
    {
        this.tBill += cost;
    }





    //gets the values
    public double getTotalBillBeforeTip()
    {
        return tBill;
    }

    public double getTipPercentage()
    {
        return tTip;
    }

    public double getTipAmount()
    {
        double tipAmount;
        tipAmount = tBill * (getTipPercentage()/100);
        return tipAmount;
    }

    public double getTotalBill()
    {
        double totalBill;
        totalBill = tBill + getTipAmount();
        return totalBill;
    }

    public double getPersonCostBeforeTip()
    {
        double perPersonCost;
        perPersonCost = tBill/people;
        return perPersonCost;
    }

    public double getPerPersonTipAmount()
    {
        double perPersonTip;
        perPersonTip = getTipAmount()/people;
        return perPersonTip;
    }

    public double getPerPersonTotalCost()
    {
        double perPersonTotal;
        perPersonTotal = getPersonCostBeforeTip() + getPerPersonTipAmount();
        return perPersonTotal;
    }

}
