public class TipCalculator
{
    private double tBill;
    private double tTip;
    private int people;
    private double tipAmount;
    private double tTipBill;
    private double tipPerPerson;
    private double tPerPerson;


    public TipCalculator(double tBill, double tTip, int people)
    {
        this.tTip = tTip;
        this.tBill = tBill;
        this.people = people;


    }

    // sets the values
    public void setTipAmount()
    {
        this.tipAmount = tBill*(tTip/100);
    }

    public void setTotalBillTip()
    {
        this.tTipBill = tBill + tipAmount;
    }

    public void setTipPerPerson()
    {
        this.tipPerPerson = (tBill/people) * (tTip/100);
    }

    public void setTotalPerPerson()
    {
        this.tPerPerson = (tBill/people) + tipPerPerson;
    }

    //gets the values
    public double getTipAmount() {
        return tipAmount;
    }

    public double getTTipBill() {
        return tTipBill;
    }

    public double getTipPerPerson() {
        return tipPerPerson;
    }

    public double getTPerPerson() {
        return tPerPerson;
    }

    public void calcPrinter()
    {
        System.out.print("Total tip amount: ");
        System.out.printf("%.2f", getTipAmount());
        System.out.println();
        System.out.print("Total bill including tip: ");
        System.out.printf("%.2f", getTTipBill());
        System.out.println();
        System.out.print("Tip per person: ");
        System.out.printf("%.2f", getTipPerPerson());
        System.out.println();
        System.out.print("Total per person: ");
        System.out.printf("%.2f", getTPerPerson());
        System.out.println();
        System.out.println("-------------------------------");
    }
}
