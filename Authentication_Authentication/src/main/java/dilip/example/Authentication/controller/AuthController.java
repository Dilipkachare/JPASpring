package dilip.example.Authentication.controller;

import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dilip.example.Authentication.dto.LoginRequest;
import dilip.example.Authentication.dto.RegisterRequest;
import dilip.example.Authentication.security.JwtUtil;
import dilip.example.Authentication.service.UserService;
import dilip.example.Authentication.entity.User;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private final UserService service;
	private final JwtUtil jwtUtil;

	public AuthController(UserService service, JwtUtil jwtUtil) {
		this.service = service;
		this.jwtUtil = jwtUtil;
	}

	@PostMapping("/register")
	public String register(@Valid @RequestBody RegisterRequest req) {
		User user = new User();
		user.setUsername(req.username);
		user.setEmail(req.email);
		user.setPassword(req.password);
		service.register(user);
		return "User Registered Successfully";
	}

	/*
	 * @PostMapping("/login") public Map<String, String> login(@Valid @RequestBody
	 * LoginRequest req) { User user = service.login(req.email, req.password);
	 * String token = jwtUtil.generateToken(user.getUsername()); return
	 * Map.of("token", token); }
	 */
	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody LoginRequest req) {

	    User user = service.login(req.getEmail(), req.getPassword());

	    String token = jwtUtil.generateToken(user.getUsername());

	    return ResponseEntity.ok(Map.of("token", token));
	}
	
	   @GetMapping("/profile")
	    public String profile() {
	        return "Welcome, you are logged in!";
	    }

}
