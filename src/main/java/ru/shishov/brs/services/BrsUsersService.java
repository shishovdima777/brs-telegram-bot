package ru.shishov.brs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.shishov.brs.repositories.BrsUsersRepository;

@Service
@Transactional(readOnly = true)
public class BrsUsersService {
    private final BrsUsersRepository brsUsersRepository;

    @Autowired
    public BrsUsersService(BrsUsersRepository brsUsersRepository) {
        this.brsUsersRepository = brsUsersRepository;
    }

    @Transactional
    public void save(Update update) {

        //TODO

//        BrsUser brsUser = new BrsUser();
//        System.out.println(update);
//        Long botUserId = update.getMessage().getFrom().getId();
//        String botUserName = update.getMessage().getFrom().getUserName();
//        LocalDateTime createdAt = LocalDateTime.now();
//
//        brsUser.setBotUserId(botUserId);
//        brsUser.setBotUserName(botUserName);
//        brsUser.setCreatedAt(createdAt);
//
//        brsUsersRepository.save(brsUser);
    }

}
