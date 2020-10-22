package com.pwc.tech.service;

import com.pwc.tech.constant.PwcConstant;
import com.pwc.tech.exception.PwcException;
import com.pwc.tech.model.Line;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import java.util.ArrayList;
import java.util.List;

public class PwcServiceImpl implements PwcService {
    private static final Logger logger = LogManager.getLogger(PwcServiceImpl.class);

    @Override
    public Double sum(Line singleLine) {
        logger.debug("Inside sum for text " + singleLine.getText());
        return singleLine.getGeometry().getBoundingBox().getHeight() + singleLine.getGeometry().getBoundingBox().getLeft()
                + singleLine.getGeometry().getBoundingBox().getTop() + singleLine.getGeometry().getBoundingBox().getWidth();

    }

    @Override
    public JSONObject calculateTwoColumnPosForMultiColumnData(List<Line> listOfLines) throws PwcException {
        logger.info("Inside calculateTwoColumnPosForMultiColumnData");
        JSONObject jsonObject = new JSONObject();
        List<String> listOfLeftString = new ArrayList<>();
        List<String> listOfRightString = new ArrayList<String>();

        if(listOfLines != null) {
            listOfLines.stream().filter(lines -> lines.getBlockType().equalsIgnoreCase(PwcConstant.STR_LINE)).forEach(
                    singleLine -> {

                        if (sum(singleLine) < 1) {
                            listOfLeftString.add(singleLine.getText());

                        } else {
                            listOfRightString.add(singleLine.getText());

                        }
                    });

            jsonObject.put(PwcConstant.STR_LEFT, listOfLeftString);
            jsonObject.put(PwcConstant.STR_RIGHT, listOfRightString);
        } else {
            logger.error("Error in processing input data json in PwcService class");
            throw new PwcException("Error in processing input data json in PwcService class");
        }

        logger.info("End Of calculateTwoColumnPosForMultiColumnData");

        return jsonObject;

    }
}
