package com.newlight77.kata.survey.controler;

import com.newlight77.kata.survey.model.Campaign;
import com.newlight77.kata.survey.model.Survey;
import com.newlight77.kata.survey.service.ExportCampaignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurveyController {

    private ExportCampaignService exportCampaignService;
    private static final Logger logger = LoggerFactory.getLogger(SurveyController.class);

    @RequestMapping(value = "/api/survey/create", method = RequestMethod.GET)
    public void createSurvey(@RequestBody Survey survey) {
        exportCampaignService.creerSurvey(survey);
    }

    @RequestMapping(value = "/api/survey/get", method = RequestMethod.POST)
    public Survey getSurvey(@RequestParam String id) {
        return exportCampaignService.getSurvey(id);
    }

    @RequestMapping(value = "/api/survey/campaign/create", method = RequestMethod.GET)
    public void createCampaign(@RequestBody Campaign campaign) {
        exportCampaignService.createCampaign(campaign);
    }

    @RequestMapping(value = "/api/survey/campaign/get", method = RequestMethod.POST)
    public Campaign getCampaign(@RequestParam String id) {
        return exportCampaignService.getCampaign(id);
    }

    @RequestMapping(value = "/api/survey/campaign/export", method = RequestMethod.PUT)
    public void exportCampaign(@RequestParam String campaignId) {}
}

