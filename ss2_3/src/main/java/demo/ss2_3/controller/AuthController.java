package demo.ss2_3.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {

    @GetMapping({"/","/login"})
    public String showLogin() {
        return "login";
    }

    @PostMapping({"/", "/login"})
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        Model model) {

        if ("admin".equals(username) && "admin123".equals(password)) {
            session.setAttribute("loggedUser", "Admin");
            session.setAttribute("role", "Quản lý");

            return "redirect:/orders"; // redirect sau login
        }

        if ("staff".equals(username) && "staff123".equals(password)) {
            session.setAttribute("loggedUser", "Nhân viên");
            session.setAttribute("role", "Thu ngân");

            return "redirect:/orders";
        }

        model.addAttribute("error", "Sai tài khoản hoặc mật khẩu");

        return "login";
    }
}