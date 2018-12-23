/**
 * 
 */
package com.ljq.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author ljq
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
