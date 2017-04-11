import com.mongodb.pojo.UserMsg;
import com.mongodb.repository.UserMsgRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by kerns on 2016/8/24.
 */
@SpringBootApplication
public class Test {
    public static void main(String[] args) throws Exception {
        UserMsg userMsg = new UserMsg();
        userMsg.setId("1123");
        userMsg.setName("1231");
        userMsg.setPwd("12312312");


    }
}
