package org.iffat.stuctural_design.adapter_fourth;

public class StockMarketAdapter implements CSVParser{

    private StockMarketDateParser stockMarketDateParser;

    public StockMarketAdapter(StockMarketDateParser stockMarketDateParser) {
        this.stockMarketDateParser = stockMarketDateParser;
    }

    @Override
    public void parseCSV() {
        stockMarketDateParser.parseXML();
    }
}
