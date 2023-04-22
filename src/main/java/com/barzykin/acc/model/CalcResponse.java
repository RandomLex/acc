package com.barzykin.acc.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CalcResponse {
    private String result;
}
