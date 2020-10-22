package com.pwc.tech;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pwc.tech.exception.PwcException;
import com.pwc.tech.model.Input;
import com.pwc.tech.model.Line;
import com.pwc.tech.service.PwcServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class PwcTechAssignment {
    private static final Logger logger = LogManager.getLogger(PwcTechAssignment.class);

    public static void main(String[] args) throws IOException, PwcException {
        logger.info("Started Pwc Tech Assignment For Calculating Position Data ....");
        ObjectMapper mapper = new ObjectMapper();
        JSONObject jsonObject = null;

        if (args.length > 1) {
            try {
                PwcServiceImpl pwcServiceimpl = new PwcServiceImpl();
                Input inputJson = mapper.readValue(new File(args[0]), Input.class);
                List<Line> listOfLines = inputJson.getLines();
                jsonObject = pwcServiceimpl.calculateTwoColumnPosForMultiColumnData(listOfLines);

                if (jsonObject != null ) {
                    mapper.writeValue(new File(args[1]), jsonObject);
                    mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject);
                }

            } catch (FileNotFoundException | PwcException e) {
                throw new PwcException("Error occurred during processing....." + e.getMessage());
            }
        } else {
            logger.error("Please pass arg[0] as Input json File Path and arg[1] as Output Json File Path.");
            throw new PwcException("Please pass valid command line arguments for processing.....");
        }

        logger.info("Completed Pwc Tech Assignment And Exported Result to Output Path :: " + args[1]);
        logger.info("Final Result In Json Format As Below \n" + jsonObject);

    }
}
