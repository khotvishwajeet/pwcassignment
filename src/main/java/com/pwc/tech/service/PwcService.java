package com.pwc.tech.service;

import com.pwc.tech.exception.PwcException;
import com.pwc.tech.model.Line;
import org.json.simple.JSONObject;

import java.util.List;

public interface PwcService {
    Double sum(Line line);
    JSONObject calculateTwoColumnPosForMultiColumnData(List<Line> listOfLine) throws PwcException;
}
