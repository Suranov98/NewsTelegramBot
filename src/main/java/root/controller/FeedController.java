package root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@RestController()
@RequestMapping("books")
public class Controller {

    @Autowired
    private Bot bot;

    @GetMapping("/refresh")
    public String refresh() {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId("1627562125");
        sendMessage.setText("Hello!");
        try {
            bot.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return "Greetings from Spring Boot!";
    }
}
