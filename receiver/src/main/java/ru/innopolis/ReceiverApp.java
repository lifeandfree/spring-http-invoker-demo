package ru.innopolis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.innopolis.api.PhoneService;

@Controller
public class ReceiverApp {

    @Autowired
    private PhoneService phoneService;

    @RequestMapping("/getPhone")
    public String getService(Model model) {
        System.out.println("123");
        model.addAttribute("phone", phoneService.getPhone());
        model.addAttribute("person", phoneService.getPerson());
        return "/WEB-INF/phone.jsp";
    }

}
