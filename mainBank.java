class Bank {
    //attribut
    private String namaAccount;
    private double saldo;
    private double withdraw;

    // constructor
    public Bank(String namaAccount, double saldo, double withdraw) {
        this.namaAccount = namaAccount;
        this.saldo = saldo;
        this.withdraw = withdraw;
    }

    public String getNamaAccount() {
        return namaAccount;
    }

    public void setNamaAccount(String namaAccount){
        this.namaAccount = namaAccount;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getWithdraw(){
        return withdraw;
    }

    public void setWithdraw(double withdraw){
        this.withdraw = withdraw;
    }

    public void CheckSaldo(){
        System.out.println("Nama Nasabah : " + getNamaAccount());
        System.out.println("Saldo : " + "Rp." +  getSaldo());
    }

    public void WdSaldo(double withdraw){
        if (withdraw > 0 && withdraw <= saldo){
            saldo -= withdraw;
            System.out.println("Penarikan : " + "Rp." + withdraw + " Telah berhasil" );
            System.out.println("Sisa saldo anda : "+ "RP." +getSaldo() );
        } else {
            System.out.println("Penarikan gagal : Jumlah penarikan tidak valid atau melebihi saldo anda");
        }

    }
}
public class mainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("Udin Rojali",100000,0);
        bank.CheckSaldo();
        bank.WdSaldo(10000);
    }
}