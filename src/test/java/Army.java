public class Army {
    public static void main(String[] args) {
        final int LANNISTER_ARMY = 1000;
        final int SARUMAN_ORKS = 1500;

        int TOTAL_ARMY = LANNISTER_ARMY + SARUMAN_ORKS;
        System.out.println("У Ланнисторов в войске " + LANNISTER_ARMY + " пехотинцев");
        System.out.println("У Сарумана в войске " + SARUMAN_ORKS + " орков");
        System.out.println("Общая численность армии составляет " + TOTAL_ARMY + " тел");
    }
}
