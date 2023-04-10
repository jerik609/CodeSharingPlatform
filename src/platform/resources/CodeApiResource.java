package platform.resources;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.model.dto.CodeDTO;
import platform.services.CodeService;

// https://medium.com/@nandaras0103/spring-mvc-and-thymleaf-fa48c000f68a

// https://www.thymeleaf.org/documentation.html

@RestController
public class CodeApiResource {

    private final CodeService codeService;

    public CodeApiResource(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/api/code")
    public ResponseEntity<CodeDTO> getCode() {
        final var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(
                new CodeDTO(codeService.getCode()), headers, HttpStatus.OK
        );
    }

}
