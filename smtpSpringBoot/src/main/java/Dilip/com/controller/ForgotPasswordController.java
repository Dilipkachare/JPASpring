package Dilip.com.controller;

import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import Dilip.com.dto.ForgotPasswordRequest;
import Dilip.com.dto.ResetPasswordRequest;
import Dilip.com.dto.VerifyOtpRequest;
import Dilip.com.service.ForgotPasswordService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class ForgotPasswordController {

    private final ForgotPasswordService service;

    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestBody ForgotPasswordRequest request) {
        service.sendOtp(request.getEmail());
        return ResponseEntity.ok("OTP sent to email");
    }

    @PostMapping("/verify-otp")
    public ResponseEntity<String> verifyOtp(@RequestBody VerifyOtpRequest request) {
        service.verifyOtp(request.getEmail(), request.getOtp());
        return ResponseEntity.ok("OTP verified");
    }

    @PostMapping("/reset-password")
    public ResponseEntity<String> resetPassword(@RequestBody ResetPasswordRequest request) {
        service.resetPassword(request.getEmail(), request.getNewPassword());
        return ResponseEntity.ok("Password reset successful");
    }
}
