package tr.com.agem.alfalms.controller;

import tr.com.agem.alfalms.dto.EducationReportDto;
import tr.com.agem.alfalms.model.*;
import tr.com.agem.alfalms.service.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tr.com.agem.alfalms.service.UserService;

@RestController
public class ApiController {

	private static final Logger log = LoggerFactory.getLogger(ApiController.class);
	
	@Autowired
	EducationReportService educationReportService;
	
	@Autowired
	EducationService educationService;

	@Autowired
	UserService userService;
	
	@Autowired
	EducationReportDto educationReportDto;
	
	// TODO https://agem-bilisim.github.io/alfa-server/lms-integration.html

	// TODO 1: apiusers
	/*
	 * @Autowired UserService userService = new UserService();
	 */
	@PostMapping("/apiusers")
	public List<User> getApiUsers() {

		List<User> userList = userService.getUserList();
	//	List<User> userList = userService.findAll();
		return userList;
	}

	// TODO 2: apieducations
	@PostMapping("/apieducations")
	public List<Education> getApiEducations() {

		List<Education> educationList = educationService.getEducationList();
	//	List<Education> educationList = educationService.findAll();
		return educationList;
	}

	// TODO 3: apieducationreport
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/apieducationreports" )
	public @ResponseBody List<EducationReportDto> getApiEducationReports() {

//		List<EducationReport> educationReportList = educationReportService.findAll(); 
		List<EducationReportDto> educationReportDtoList = educationReportService.getEducationReportList(); 
		return educationReportDtoList;
		
		
	}
	
	

	
	
	
	
	
}
