/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.google.api.plus.moments;

import static org.springframework.social.google.api.plus.moments.MomentTypes.BUY_ACTIVITY;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Activity representing a purchase.
 * 
 * @see {@link https://developers.google.com/+/api/moment-types/buy-activity}
 * @author Gabriel Axel
 * 
 */
@JsonTypeName(BUY_ACTIVITY)
public class BuyActivity extends Moment {

	protected BuyActivity() {
	}

	public BuyActivity(String targetUrl) {
		super(targetUrl);
	}
}
