package demo.ss2_5.controller;

import demo.ss2_5.service.AuthService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            @RequestParam String username,
            @RequestParam String password,
            HttpSession session,
            Model model) {

        if (authService.login(username, password)) {
            session.setAttribute("loggedUser", username);
            session.setAttribute("role", authService.getRole(username));
            return "redirect:/employees";
        }

        model.addAttribute("errorMessage", "Sai tài khoản hoặc mật khẩu");
        return "login";
    }
}