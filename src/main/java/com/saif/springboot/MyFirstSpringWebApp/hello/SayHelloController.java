package com.saif.springboot.MyFirstSpringWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {


    @RequestMapping({"say-hello"})
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today";
    }

    @RequestMapping({"say-hello-html"})
    @ResponseBody
    public String sayHelloHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello World</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello World</h1>");
        sb.append("</body>");
        sb.append("</html>");
        String html =
                """
                <html>
                <head>
                <title>Hello World</title>
                </head>
                <body>
                <h1>Hello World html</h1>
                </body>
                </html>
                """;
        return html;
    }

    @RequestMapping({"say-hello-jsp"})
    public String sayHelloJSP() {
        return "sayHello";
    }

}
