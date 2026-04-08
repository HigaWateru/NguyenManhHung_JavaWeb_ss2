package demo.ss2_5.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean login(String username, String password) {
        return ("hr_manager".equals(username) && "hr123".equals(password)) || ("hr_staff".equals(username) && "staff456".equals(password));
    }
    public String getRole(String username) {
        if ("hr_manager".equals(username)) return "hr_manager";
        if ("hr_staff".equals(username)) return "hr_staff";
        return null;
    }
}