//updates are pushed and it looks good !!

import java.util.*;

class ATM {
    int pin=1234;
    int balance;
    public void checkpin(){
        System.out.println("Enter the pin: ");
        Scanner sc = new Scanner(System.in);
        int out=sc.nextInt();
        if(out==pin){
            menu();
        }
        else {
            System.out.println("Invalid pin. Re-enter the pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Your current balance");
        System.out.println("2. Withdraw money");
        System.out.println("3. Deposit money");
        Scanner sc= new Scanner(System.in);
        int opt=sc.nextInt();
        if(opt==1){
            System.out.println("Current balance is : "+balance);
            menu();
        }
        else if(opt==2){
            withdrawmoney();
        }
        else if(opt==3){
            depositmoney();
        }
    }
    public void withdrawmoney(){
        System.out.println("Enter the amount to be withdrawn");
        Scanner sc= new Scanner(System.in);
        int amount=sc.nextInt();
        balance=balance-amount;
        System.out.println("Final amount is : "+balance);
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter the amount to be deposited");
        Scanner sc = new Scanner(System.in);
        int amount=sc.nextInt();
        balance=balance+amount;
        System.out.println("Final amount is : "+balance);
        menu();
    }
}
class Main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
