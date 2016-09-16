package com.tano.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pojo.CompanyInfo;

/**
 * Created by dinamix on 9/16/16.
 */
@RestController
public class StockController {
    @RequestMapping(value = "/stock", method = RequestMethod.GET)
    public CompanyInfo checkBookValue(@RequestParam(value="ticker", defaultValue="BCE") String ticker) {
        return new CompanyInfo(ticker, "Test Value");
    }
}
