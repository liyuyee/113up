public class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number,int balance,int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public String getNumber() {
        return number;
    }
    public int getBalance() {
        return balance;
    }
    public int getBonus() {
        return bonus;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    public void  store(int money){
        if (money > 0){
            this.balance += money;
            if (money >= 1000){
                this.balance += money/1000;
            }
            else{
                System.out.println("不足");
            }
        }
        else{
            System.out.println("負");
        }

    }
}

