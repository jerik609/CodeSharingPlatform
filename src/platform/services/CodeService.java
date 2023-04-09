package platform.services;

import org.springframework.stereotype.Service;

@Service
public class CodeService {

    private static final String CODE = "public static void main(String[] args) {\\n    SpringApplication.run(CodeSharingPlatform.class, args);\\n}";

    public String getCode() {
        return CODE;
    }

}
