package platform.resources;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// https://www.geeksforgeeks.org/spring-boot-thymeleaf-with-example/

// https://www.geeksforgeeks.org/spring-boot-how-thymeleaf-works/?ref=rp

@Controller
public class CodeHtmlResource {

    @RequestMapping("/code")
    public String getCodeAsHtml(Model model) {
        model.addAttribute("testtext", "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        return "code";
    }

    @GetMapping("/template2")
    public String template(Model model) {
        String message = "Top 5 Cloud Service Providers";
        // creating a collection
        List<String> list = new ArrayList<>();
        list.add("Amazon Web Services");
        list.add("Microsoft Azure");
        list.add("Google Cloud");
        list.add("Alibaba Cloud");
        list.add("IBM Cloud");
        model.addAttribute("message", message);
        // adding the collection attribute
        model.addAttribute("cloudProvider", list);
        return "test";
    }

}
