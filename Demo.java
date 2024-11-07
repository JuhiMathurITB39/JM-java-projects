class Commission {
    private int Sales;
    private int commission_amount;



 
    public int getSales() {
        return Sales;
    }

    public void setSales(int Sales) {
        if (Sales > 0) {
            this.Sales = Sales;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

    public int getCommissionAmount() {
        return (Sales*10)/100;
    }

    public void setCommissionAmount(int commission_amount) {
        if (commission_amount > 0) {
            this.commission_amount = commission_amount;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }

 

}
public class Demo{
    public static void main(String[] args) {
        Commission obj1 = new Commission(); 
        int x=20;
       obj1.setSales(x);
        System.out.println("Commission amount: " + obj1.getCommissionAmount());
    }
} 
