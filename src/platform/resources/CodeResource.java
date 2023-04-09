package platform.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeResource {

    @GetMapping("/code")
    public String getCode() {
        return "";
    }

}
