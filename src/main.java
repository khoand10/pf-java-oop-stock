public class main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.5);
        System.out.println(String.format(stock.getChangePercent()+" %"));
    }

    static class Stock {
        public String symbol;
        public String name;
        public double previousClosingPrice;
        public double currentPrice;

        public Stock() {
            this.symbol = "ORCL";
            this.name = "Oracle Corporation";
        }

        public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
            this.symbol = symbol;
            this.name = name;
            this.previousClosingPrice = previousClosingPrice;
            this.currentPrice = currentPrice;
        }

        public double getChangePercent() {
            return ((this.currentPrice - this.previousClosingPrice) / this.currentPrice) * 100;
        }
    }
}