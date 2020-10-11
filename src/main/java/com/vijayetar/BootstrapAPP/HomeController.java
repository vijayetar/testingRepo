package com.vijayetar.BootstrapAPP;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.Session;
import java.net.PasswordAuthentication;
import java.util.Properties;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping("/")
    public String homePage(Model model) {
        return "home";
    }

}
