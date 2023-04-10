package platform.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import platform.services.CodeService;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/spring-boot-thymeleaf-with-example/

// https://www.geeksforgeeks.org/spring-boot-how-thymeleaf-works/?ref=rp

@Controller
public class CodeHtmlResource {

    // https://stackoverflow.com/questions/62080295/thymeleaf-output-variable-without-a-tag

    private final CodeService codeService;

    public CodeHtmlResource(CodeService codeService) {
        this.codeService = codeService;
    }

    @GetMapping("/code")
    public String getCodeAsHtml(Model model) {
        model.addAttribute("code", codeService.getCode());
        return "code";
    }

}
