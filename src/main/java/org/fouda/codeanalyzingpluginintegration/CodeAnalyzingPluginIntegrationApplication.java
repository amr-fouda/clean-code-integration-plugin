package org.fouda.codeanalyzingpluginintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeAnalyzingPluginIntegrationApplication {

    public static void main(String[] args) {
        //String s; Testing PMD plugin
        SpringApplication.run(CodeAnalyzingPluginIntegrationApplication.class, args);
    }

}
