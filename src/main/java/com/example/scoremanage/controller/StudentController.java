package com.example.scoremanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.scoremanage.model.STUDENT;
import com.example.scoremanage.service.STUDENTService;

import io.micrometer.common.lang.NonNull;

@Controller
public class StudentController {
	@Autowired
	private STUDENTService scheduleBookService;
	
	@GetMapping("/top/")
	public String index(Model model) {
		// TODO: model.addAttributeに一覧取得結果を追加
		model.addAttribute("list",this.scheduleBookService.getScheduleList(userBook));
		return "top";
	}
    @GetMapping("/StudentAdd/")
  	public ModelAndView add(STUDENT student, ModelAndView model) {
  		model.addObject("student", student);
  		model.setViewName("form");
  		return model;
  	}
   
// 
//   @GetMapping("/delete/{id}")
//	public ModelAndView delete(@PathVariable(name = "id")Long id, ScheduleBook scheduleBook, ModelAndView model) {
//		this.scheduleBookService.delete(id);
//		model.setViewName("detail");
//		return model;
//	}
   
   @PostMapping("/add/")
  	public String add(@Validated @ModelAttribute @NonNull ScheduleBook scheduleBook, RedirectAttributes result,
  			ModelAndView model,
  			RedirectAttributes redirectAttributes) {
  		try {
  			this.scheduleBookService.save(scheduleBook);
  			redirectAttributes.addFlashAttribute("exception", "");
  		} catch (Exception e) {
  			redirectAttributes.addFlashAttribute("exception", e.getMessage());
  		}
  		return "redirect:/top/";
  }
}