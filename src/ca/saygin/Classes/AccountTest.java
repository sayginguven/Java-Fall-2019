package ca.saygin.Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        Account acc = new Account("test account", 250, 500);

        assertEquals(500,acc.deposit(250, Account.type.checking));
        assertEquals(750,acc.deposit(250, Account.type.saving));

    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(0, acc.withdraw(250, Account.type.checking));
        assertEquals(0, acc.withdraw(500, Account.type.saving));
        //test withdraw from an empty account
        assertEquals(0, acc.withdraw(250, Account.type.checking));
        assertEquals(0, acc.withdraw(500, Account.type.saving));


    }

    @org.junit.jupiter.api.Test
    void getCheckingBalance() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(250, acc.getCheckingBalance());
    }

    @org.junit.jupiter.api.Test
    void getSavingBalance() {
        Account acc = new Account("test account", 250, 500);
        assertEquals(500, acc.getSavingBalance());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account acc = new Account("test account", 250, 500);
        assertEquals("test account", acc.getName());
    }


    @org.junit.jupiter.api.Test
    void transferMoney() {

        Account acc = new Account("test account", 250, 500);
        acc.transferMoney(Account.type.checking,Account.type.saving, 250);
        assertEquals((500 + 250 + 250 * Account.interestRate), acc.getSavingBalance());

        Account acc2 = new Account("test account", 1000, 500);
        acc2.transferMoney(Account.type.saving,Account.type.checking, 400);
        assertEquals(1400, acc2.getCheckingBalance());
        assertEquals(100, acc2.getSavingBalance());


    }
}