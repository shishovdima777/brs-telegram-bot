package ru.shishov.brs.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.shishov.brs.services.BrsUsersService;


@Component
public class BrsTelegramBot extends TelegramLongPollingBot {
	private final String botToken;
	private final String botUsername;
	private final BrsUsersService brsUsersService;

	public BrsTelegramBot(
			TelegramBotsApi telegramBotsApi,
			@Value("${BOT_NAME}") String botUsername,
			@Value("${BOT_TOKEN}") String botToken,
			BrsUsersService brsUsersService) throws TelegramApiException, TelegramApiException {
		this.botUsername = botUsername;
		this.botToken = botToken;
		this.brsUsersService = brsUsersService;

		telegramBotsApi.registerBot(this);
	}

	public String getBotUsername() {
		return botUsername;
	}
	public String getBotToken() {
		return botToken;
	}

	public void onUpdateReceived(Update update) {
		if (update.hasMessage() && update.getMessage().getText().equals("/start")) {
				// TODO
		}
	}
}
