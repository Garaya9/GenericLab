package genericlab;

/**
 * Tests the DataSetGen class with BankAccount and BaseballPlayer objects.
 * @author Gebrella Araya
 * @date Feb 9, 2024
 */
public class DataSetTester {
    public static void main(String[] args) {
        DataSetGen<BankAccount> bankData = new DataSetGen<>();
        bankData.add(new BankAccount(5000));
        bankData.add(new BankAccount(10000));
        bankData.add(new BankAccount(7500));

        System.out.println("Bank Accounts:");
        System.out.println("Average balance: " + bankData.getAverage());
        System.out.println("Highest balance: " + bankData.getMaximum().getBalance());

        DataSetGen<BaseballPlayer> playerData = new DataSetGen<>();
        playerData.add(new BaseballPlayer("Player A", "Team X", 0.305));
        playerData.add(new BaseballPlayer("Player B", "Team Y", 0.298));
        playerData.add(new BaseballPlayer("Player C", "Team Z", 0.321));

        System.out.println("\nBaseball Players:");
        System.out.println("Average batting average: " + playerData.getAverage());
        System.out.println("Highest batting average: " + playerData.getMaximum().getBattingAverage());
    }
}
