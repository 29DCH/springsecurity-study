/**
 * 
 */
package com.ljq.security.core.social;

import org.springframework.social.security.SocialAuthenticationFilter;
import org.springframework.social.security.SpringSocialConfigurer;

/**
 * @author ljq
 *
 */
public class ljqSpringSocialConfigurer extends SpringSocialConfigurer {
	
	private String filterProcessesUrl;

public ljqSpringSocialConfigurer(String filterProcessesUrl) {
		this.filterProcessesUrl = filterProcessesUrl;
		}

@SuppressWarnings("unchecked")
@Override
protected <T> T postProcess(T object) {
		SocialAuthenticationFilter filter = (SocialAuthenticationFilter) super.postProcess(object);
		filter.setFilterProcessesUrl(filterProcessesUrl);
		return (T) filter;
		}

		}
