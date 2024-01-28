package root.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TelegramUser {
    @Id
    @GeneratedValue
    private Long id;

    public TelegramUser() {
    }

    public String getChatId(){
        return "";
    }

}
