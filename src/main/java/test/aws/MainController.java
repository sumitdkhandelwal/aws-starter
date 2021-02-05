package test.aws;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("")
public class MainController {
	@GetMapping("/")
    public String getHost() throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		return "host is " + ip; 
    }
}
