package platform.resources;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// https://medium.com/@nandaras0103/spring-mvc-and-thymleaf-fa48c000f68a

// https://www.thymeleaf.org/documentation.html

@RestController
public class CodeResource {

    @GetMapping("/code")
    public ResponseEntity<String> getCode() {
        final var headers = new HttpHeaders();
        headers.setContentType(MediaType.TEXT_HTML);

        final var response = new ResponseEntity<String>(
            "<h1>hello</h1>", headers, HttpStatus.OK
        );

        return response;
    }

}
