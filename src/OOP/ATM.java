package OOP;

/**
 * Создать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * количеством купюр номиналом 20, 50 и 100.
 */

public class ATM {
    private int twenties;
    private int fifties;
    private int hundreds;

    static final int CAPACITY_BY_BANKNOTE = 2500;

    public static void main(String[] args) {
        ATM tinkoff = new ATM(45, 23622, 12);
        tinkoff.withdrawMoney(250);
    }

    public ATM(int twenties, int fifties, int hundreds) {
        try {
            validateCapacity(twenties, fifties, hundreds);
            this.twenties = twenties;
            this.fifties = fifties;
            this.hundreds = hundreds;
        } catch (CapacityOverload e) {
            System.out.println(e.getMessage());
        }
    }

    public void addTwenties(int count) {
        try {
            validateCapacity(twenties + count, 0, 0);
            twenties += count;
        } catch (CapacityOverload e) {
            System.out.println(e.getMessage());
        }
    }

    public void addFifties(int count) {
        try {
            validateCapacity(0, fifties + count, 0);
            fifties += count;
        } catch (CapacityOverload e) {
            System.out.println(e.getMessage());
        }
    }

    public void addHundreds(int count) {
        try {
            validateCapacity(0, 0, hundreds + count);
            hundreds += count;
        } catch (CapacityOverload e) {
            System.out.println(e.getMessage());
        }
    }

    public void withdrawMoney(int moneyAmount) {
        if ((moneyAmount % 20 == 0 || moneyAmount % 50 == 0) &&
                hundreds * 100 + fifties * 50 + twenties * 20 >= moneyAmount) {
            if (moneyAmount / 100 <= hundreds) {
                hundreds -= moneyAmount / 100;
            } else {
                moneyAmount -= hundreds;
                hundreds = 0;
                fifties -= moneyAmount / 50;
                twenties -= moneyAmount / 20;
            }
        }
    }

    private void validateCapacity(int twenties, int fifties, int hundreds) throws CapacityOverload {
        if (twenties < 0 || twenties > CAPACITY_BY_BANKNOTE ||
                fifties < 0 || fifties > CAPACITY_BY_BANKNOTE ||
                hundreds < 0 || hundreds > CAPACITY_BY_BANKNOTE) {
            throw new CapacityOverload("Wrong banknotes count");
        }
    }
}

class CapacityOverload extends Exception {
    public CapacityOverload(String message) {
        super(message);
    }
}

class NonWithdrawableMoneyAmount extends Exception {
    public NonWithdrawableMoneyAmount(String message) {
        super(message);
    }
}