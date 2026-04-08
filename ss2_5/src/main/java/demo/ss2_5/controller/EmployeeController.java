package demo.ss2_5.controller;

import demo.ss2_5.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public String list(Model model, HttpSession session) {

        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        model.addAttribute("employees", service.getAll());
        model.addAttribute("totalIT", service.totalSalaryIT());

        return "employees";
    }

    @GetMapping("/employees/{code}")
    public String detail(@PathVariable String code,
                         Model model,
                         HttpSession session) {

        if (session.getAttribute("loggedUser") == null) {
            return "redirect:/login";
        }

        model.addAttribute("emp", service.findByCode(code));
        return "employee-detail";
    }
}