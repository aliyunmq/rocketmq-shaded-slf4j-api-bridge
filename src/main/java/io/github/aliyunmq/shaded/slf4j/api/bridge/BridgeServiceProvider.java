/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.aliyunmq.shaded.slf4j.api.bridge;

import java.lang.reflect.Method;
import org.apache.rocketmq.logging.org.slf4j.Logger;
import org.apache.rocketmq.logging.org.slf4j.LoggerFactory;
import org.slf4j.ILoggerFactory;
import org.slf4j.IMarkerFactory;
import org.slf4j.spi.MDCAdapter;
import org.slf4j.spi.SLF4JServiceProvider;

public class BridgeServiceProvider implements SLF4JServiceProvider {
    private static final Logger logger = LoggerFactory.getLogger(BridgeServiceProvider.class);

    private final org.apache.rocketmq.logging.org.slf4j.spi.SLF4JServiceProvider delegate;

    public BridgeServiceProvider() {
        // Another reason why we print the log here is to make sure the real implementation we want to bridge is loaded.
        logger.debug("Try to find shaded SLF4j service provider.");
        try {
            final Method method = LoggerFactory.class.getDeclaredMethod("getProvider");
            method.setAccessible(true);
            this.delegate = (org.apache.rocketmq.logging.org.slf4j.spi.SLF4JServiceProvider) method.invoke(null);
            logger.debug("Found shaded SLF4j service provider.");
        } catch (Throwable t) {
            // Should never reach here.
            throw new RuntimeException("Failed to find shaded SLF4j service provider.", t);
        }
    }

    @Override
    public ILoggerFactory getLoggerFactory() {
        return new ILoggerFactoryAdapter(delegate.getLoggerFactory());
    }

    @Override
    public IMarkerFactory getMarkerFactory() {
        return new IMarkerFactoryAdapter(delegate.getMarkerFactory());
    }

    @Override
    public MDCAdapter getMDCAdapter() {
        return new MDCAdapterAdapter(delegate.getMDCAdapter());
    }

    @Override
    public String getRequestedApiVersion() {
        return delegate.getRequestedApiVersion();
    }

    @Override
    public void initialize() {
        // Do nothing on purpose because the delegate has been initialized.
    }
}
