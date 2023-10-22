package com.artyomka.telegramcurrencybot.telegramchat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpendRepository extends JpaRepository<Spend, Long> {
}
