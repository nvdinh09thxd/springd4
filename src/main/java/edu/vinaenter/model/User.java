package edu.vinaenter.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@NotEmpty
	@Size(min = 5, max = 20)
	private String name;

	@NotNull
	@Min(18)
	private Integer age;

	private String avatar;

}
