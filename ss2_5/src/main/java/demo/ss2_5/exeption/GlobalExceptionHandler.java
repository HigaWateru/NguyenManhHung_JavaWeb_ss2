package demo.ss2_5.exeption;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public String handle(Exception ex, Model model) {

        if (ex.getMessage().startsWith("NOT_FOUND_")) {
            String code = ex.getMessage().replace("NOT_FOUND_", "");
            model.addAttribute("errorMessage",
                    "Nhân viên [" + code + "] không tồn tại trong hệ thống");
        } else {
            model.addAttribute("errorMessage", "Lỗi hệ thống");
        }

        return "error";
    }
}