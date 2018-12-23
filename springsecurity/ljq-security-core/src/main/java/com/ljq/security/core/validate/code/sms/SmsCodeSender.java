/**
 * 
 */
package com.ljq.security.core.validate.code.sms;

/**
 * @author ljq
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
