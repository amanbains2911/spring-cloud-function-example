/**
 * 
 */
package com.aman.spring.cloud.function.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author amanb
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
	
	private int id;
	private String name;

}
