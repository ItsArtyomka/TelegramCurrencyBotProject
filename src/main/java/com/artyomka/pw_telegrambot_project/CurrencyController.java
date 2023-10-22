package com.artyomka.pw_telegrambot_project;

import com.artyomka.pw_telegrambot_project.dto.ValuteCursOnDate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Rest Controller for redirecting data received from RFCB API
@RestController
@RequiredArgsConstructor
public class CurrencyController {
    private final CentralRussianBankService centralRussianBankService;

    @GetMapping  ("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
}
