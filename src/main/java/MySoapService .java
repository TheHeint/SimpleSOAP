import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MySoapService {

    @WebMethod
    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
