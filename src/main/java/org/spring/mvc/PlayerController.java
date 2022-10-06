package org.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class PlayerController {

    //http://localhost:8080/springmvc/showForm
    @RequestMapping(value = "/showForm")
    public String showForm(){
        return "search-player-form"; // fetch file from WEB-INF/views
    }

    //http://localhost:8080/springmvc/showPlayerDetail?playerName=Manish
    @RequestMapping(value = "/showPlayerDetail")
    public String showPlayerDetail(HttpServletRequest request, Model model){
        String pName = request.getParameter("playerName");
        System.out.println(pName);
        model.addAttribute("name",pName);
        return "player-detail"; // fetch file from WEB-INF/views
    }




    //http://localhost:8080/springmvc/
    @RequestMapping(value = "/")
    public String welcome(){
        return "main-menu"; // fetch file from WEB-INF/views
    }

    //http://localhost:8080/springmvc/email
    @RequestMapping(value = "/email")
    public String welcomeEmail(){
        return "welcome_email"; // fetch file from WEB-INF/views
    }


    //http://localhost:8080/springmvc/displayName/Manish
    @RequestMapping(value = "/displayName/{name}")
    @ResponseBody
    public String welcomeName(@PathVariable String name){
        System.out.println(name);
        String webview = "<html>\n" +
                "<head>\n"+
                "<title>Player</title/>\n"+
                "</head>\n"+
                "<body  style=\"background-color:powderblue;\">\n"+
                "<h1>Welcome to "+name+" Player Application</h1>\n"+
                "<h2>Welcome to "+name+" Player Application</h2>\n"+
                "<h3>Welcome to "+name+" Player Application</h3>\n"+
                "<h4>Welcome to "+name+" Player Application</h4>\n"+
                "<h5>Welcome to "+name+" Player Application</h5>\n"+
                "<h6>Welcome to "+name+" Player Application</h6>\n"+
                "</body>\n"+
                "</html>";
        return webview;
    }



}
