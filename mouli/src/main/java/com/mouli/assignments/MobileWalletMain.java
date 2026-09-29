package com.mouli.assignments;

class MobileWallet {

    private double walletBalance;

    public MobileWallet(double walletBalance) {
        if (walletBalance >= 0) {
            this.walletBalance = walletBalance;
        } else {
            this.walletBalance = 0;
        }
    }

    public void recharge(double amount) {

        if (amount > 0) {
            walletBalance = walletBalance + amount;
            System.out.println("Recharge successful");
        } else {
            System.out.println("Recharge amount must be greater than zero");
        }
    }

    public void deduct(double amount) {

        if (amount <= 0) {
            System.out.println("Deduction amount must be greater than zero");
        } 
        else if (amount > walletBalance) {
            System.out.println("Insufficient balance");
        } 
        else {
            walletBalance = walletBalance - amount;
            System.out.println("Amount deducted successfully");
        }
    }

    public double getBalance() {
        return walletBalance;
    }
}
public class MobileWalletMain {
	public static void main(String[] args) {

        MobileWallet wallet = new MobileWallet(1000);

        System.out.println("Initial Balance: " + wallet.getBalance());

        wallet.recharge(500);
        System.out.println("Balance after recharge: " + wallet.getBalance());

        wallet.deduct(300);
        System.out.println("Balance after deduction: " + wallet.getBalance());

        wallet.deduct(1500);
        System.out.println("Final Balance: " + wallet.getBalance());
    }
}
