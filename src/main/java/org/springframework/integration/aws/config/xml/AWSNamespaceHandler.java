/*
 * Copyright 2013-2015 the original author or authors.
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

package org.springframework.integration.aws.config.xml;

import org.springframework.integration.aws.s3.config.xml.AmazonS3InboundChannelAdapterParser;
import org.springframework.integration.aws.s3.config.xml.AmazonS3OutboundChannelAdapterParser;
import org.springframework.integration.config.xml.AbstractIntegrationNamespaceHandler;

/**
 * The namespace handler for "int-aws" namespace
 *
 * @author Amol Nayak
 * @author Artem Bilan
 * @since 0.5
 */
public class AWSNamespaceHandler extends AbstractIntegrationNamespaceHandler {


	public void init() {
		this.registerBeanDefinitionParser("s3-outbound-channel-adapter", new AmazonS3OutboundChannelAdapterParser());
		this.registerBeanDefinitionParser("s3-inbound-channel-adapter", new AmazonS3InboundChannelAdapterParser());
		this.registerBeanDefinitionParser("sqs-outbound-channel-adapter", new SqsOutboundChannelAdapterParser());
		this.registerBeanDefinitionParser("sqs-message-driven-channel-adapter", 
				new SqsMessageDrivenChannelAdapterParser());
	}

}
