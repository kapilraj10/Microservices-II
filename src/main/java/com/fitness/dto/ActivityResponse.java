package com.fitness.dto;

import lombok.Data;
import com.fitness.models.ActivityType;

import java.time.LocalDateTime;
import java.util.Map;
@Data
public class ActivityResponse {
    private String id;
    private String userId;
    private ActivityType type;
    private Integer duration;
    private Integer caloriesBurned;
    private LocalDateTime startTimne;
    private Map<String, Object> additionalMetrics;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
