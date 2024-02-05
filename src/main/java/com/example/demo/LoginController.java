package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class LoginController {
    @Autowired
    private FacultyRepository facultyRepository;


    @GetMapping("/login")
    public String showLoginPage(Model model) {
        return "login";
    }


    @PostMapping("/login-process")
    public String processLoginForm(@RequestParam String username, @RequestParam String password, Model model) {
        // Fetch faculty details based on username and password
        Faculty faculty = facultyRepository.findByUsernameAndPassword(username, password);

        if (faculty != null) {
            model.addAttribute("faculty", faculty);
            return "faculty-details";
        } else {
            model.addAttribute("error", "Invalid username or password.");
            return "login"; // Redirect back to the login page
        }
    }
}