public class Client implements Comparable<Object>{
    private int enterHour;
    private int minutesStay;
    private double amountPurchase;

    public Client() {}

    public Client(int enterHour, int minutesStay, double amountPurchase)
    {
        this.enterHour = enterHour;
        this.minutesStay = minutesStay;
        this.amountPurchase = amountPurchase;
    }

    public void SetEnterHour(int enterHour) {
        this.enterHour = enterHour;
    }

    public int GetEnterHour(){
        return this.enterHour;
    }

    public void SetMinutesStay(int minutesStay){
        this.minutesStay = minutesStay;
    }

    public int GetMinutesStay(){
        return this.minutesStay;
    }

    public void SetAmountPurchase(double amountPurchase){
        this.amountPurchase = amountPurchase;
    }

    public double GetAmountPurchase(){
        return this.amountPurchase;
    }

    public String toString(){
        return "Hour: " + this.enterHour + " Stay: " + this.minutesStay + " Purchase: " + this.amountPurchase + "\n";
    }

    public boolean equals(Object obj) {
        return this.minutesStay == ((Client)obj).minutesStay;
    }

    public int compareTo(Object obj) {
        if(this.minutesStay < ((Client)obj).minutesStay)
            return -1;
        if(this.minutesStay > ((Client)obj).minutesStay)
            return 1;

        return 0;
    }
}
