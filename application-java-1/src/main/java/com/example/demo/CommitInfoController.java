// src/main/java/com/example/demo/CommitInfoController.java
package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommitInfoController {

    @Value("${git.commit.id:unknown}") // Inject commit ID from properties, default to "unknown"
    private String commitId;

    @GetMapping("/commit")
    public String getCommitId() {
        return "Commit ID: " + commitId;
    }
}

