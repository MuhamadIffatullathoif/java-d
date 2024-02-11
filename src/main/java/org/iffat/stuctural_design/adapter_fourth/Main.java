package org.iffat.stuctural_design.adapter_fourth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CSVParser realEstate = new RealEstateMarketDataParser();
        CSVParser machineLearning = new MachineLearningDataParser();
        CSVParser stockMarket = new StockMarketAdapter(new StockMarketDateParser());

        realEstate.parseCSV();
        machineLearning.parseCSV();
        stockMarket.parseCSV();

        String[] names = {"Adam", "Kevin", "Ana", "Joe"};
        List<String> namesList = Arrays.asList(names);
        for (String name: namesList) {
            System.out.println(name);
        }
    }
}
