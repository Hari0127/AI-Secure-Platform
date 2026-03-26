package com.hari.ai_secure_platform.controller;
import com.hari.ai_secure_platform.service.AnalysisService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import com.hari.ai_secure_platform.model.AnalysisResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/api")
@Tag(name = "Log Analysis API", description = "API for analyzing logs and detecting sensitive data")
public class AnalysisController {

    private final AnalysisService analyzerService;

    public AnalysisController(AnalysisService analyzerService) {
        this.analyzerService = analyzerService;
    }

    @Operation(
            summary = "Analyze logs",
            description = "Scans input logs and detects sensitive data such as emails, passwords, and API keys. Returns risk score and recommended action."
    )
    @PostMapping("/analyze")
    public AnalysisResponse analyze(@RequestBody Map<String, String> request) {

        String content = request.get("content");

        if (content == null || content.trim().isEmpty()) {
            throw new RuntimeException("Content must not be empty");
        }

        return analyzerService.analyze(content);
    }
}
//@PostMapping("/analyze")
//public Map<String, Object> analyze(@RequestBody Map<String, String> request) {
//
//    Map<String, Object> test = new HashMap<>();
//    test.put("message", "Controller working");
//
//    return test;
//}
//@PostMapping("/analyze")
//public Map<String, Object> analyze(@RequestBody Map<String, String> request) {
//
//    String content = request.get("content");
//
//    Map<String, Object> test = new HashMap<>();
//    test.put("content", content);
//
//    return test;
//}
//private final AnalysisService analyzerService;
//    public AnalysisController(AnalysisService analyzerService) {
//        this.analyzerService = analyzerService;
//    }

//    @PostMapping("/analyze")
//    public Map<String, Object> analyze(@RequestBody Map<String, String> request) {
//
//        try {
//            String content = request.get("content");
//            return analyzerService.analyze(content);
//
//        } catch (Exception e) {
//            Map<String, Object> error = new HashMap<>();
//            error.put("error", e.toString());
//            return error;
//        }
//    }

