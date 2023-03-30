/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sandra.controller;

import com.sandra.dto.LoginDto;
import com.sandra.service.UserService;
import com.sandra.utils.login.ValidateInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.net.http.HttpResponse;

@Controller // <1>
@RequiredArgsConstructor
public class ApplicationController {
private final HttpServletResponse httpResponse;
	private final UserService userService;

	@GetMapping(value = "/")
	public String index() {
		return "redirect:/index";
	}

	@GetMapping(value = "/index") // <2>
	public String showLogin(Model model) {

		model.addAttribute("loginDto", new LoginDto());
		return "index"; // <3>
	}

	@PostMapping (value = "/index") // <2>
	public String checkLoginData(@Valid @ModelAttribute("loginDto") LoginDto loginDto, BindingResult result, Model model) throws IOException {

		ValidateInput.checkInputData(loginDto, result, userService);
		model.addAttribute("loginDto", loginDto);

		if(!result.hasErrors()){
			httpResponse.sendRedirect("http://127:8080");
			return "map";
		}
		else {
			return "index";
		}
	}

}
// end::code[]
