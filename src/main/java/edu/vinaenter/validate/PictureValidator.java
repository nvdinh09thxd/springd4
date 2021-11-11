package edu.vinaenter.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

@Component
public class PictureValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public void validate(Object target, Errors errors) {
		
	}

	public void validate(MultipartFile multipartFile, Errors errors) {
		if (multipartFile.getOriginalFilename().equals("")) {
			errors.rejectValue("avatar", null, "Vui lòng chọn file hình ảnh");
		}
	}
	
}
