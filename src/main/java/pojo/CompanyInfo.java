package pojo;

/**
 * Created by dinamix on 9/16/16.
 */
public class CompanyInfo {
    private final String ticker;
    private final String marketValue;

    public CompanyInfo(String ticker, String marketValue) {
        this.ticker = ticker;
        this.marketValue = marketValue;
    }

    public String getTicker() {
        return ticker;
    }

    public String getMarketValue() {
        return marketValue;
    }
}
