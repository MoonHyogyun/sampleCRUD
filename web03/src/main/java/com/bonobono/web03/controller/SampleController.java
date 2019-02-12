package com.bonobono.web03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonobono.web03.service.SampleService;

@Controller
public class SampleController {
	@Autowired		// 객체 생성
	private SampleService sampleService;
	
	// 1. 입력 폼 // Get방식
	@GetMapping("/addSample")
	public String addSample() {
		
		// 자동으로 view 파일로 forward
		return "addSample";		// view 이름은 tampleate폴더(생략)의 addSample.html
	}
	
	// 2. 입력 액션 // Post방식
	@PostMapping 
	public String addSample(@RequestParam(value="") String sampleName) {
							// request.getParameter("sampleName")
		int result = sampleService.addSample(sampleName);
		// redirect가 앞에 붙을경우 request.sendRedirect
		return "redirect:/sampleList";
	}
	
	// 3. 목록
	@GetMapping("/sampleList")
	public String sampleList(Model model) {
		// list라는 이름으로 view에 forward
		model.addAttribute("list", sampleService.getSampleList());
		return "sampleList";
	}
	
	// 4. 삭제
	@GetMapping("/removeSample")
	public String removeSample(@RequestParam(value="") int sampleId) {
		int result = sampleService.removeSample(sampleId);
		
		return "redirect:/sampleList";
		
	}
	// 5. 수정 폼
	
	// 6. 수정 액션
}