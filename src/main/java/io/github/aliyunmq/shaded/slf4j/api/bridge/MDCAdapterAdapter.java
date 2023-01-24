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

import java.util.Deque;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

public class MDCAdapterAdapter implements MDCAdapter {

    private final org.apache.rocketmq.logging.org.slf4j.spi.MDCAdapter delegate;

    public MDCAdapterAdapter(org.apache.rocketmq.logging.org.slf4j.spi.MDCAdapter delegate) {
        this.delegate = delegate;
    }

    @Override
    public void put(String key, String val) {
        delegate.put(key, val);
    }

    @Override
    public String get(String key) {
        return delegate.get(key);
    }

    @Override
    public void remove(String key) {
        delegate.remove(key);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public Map<String, String> getCopyOfContextMap() {
        return delegate.getCopyOfContextMap();
    }

    @Override
    public void setContextMap(Map<String, String> contextMap) {
        delegate.setContextMap(contextMap);
    }

    @Override
    public void pushByKey(String key, String value) {
        delegate.pushByKey(key, value);
    }

    @Override
    public String popByKey(String key) {
        return delegate.popByKey(key);
    }

    @Override
    public Deque<String> getCopyOfDequeByKey(String key) {
        return delegate.getCopyOfDequeByKey(key);
    }

    @Override
    public void clearDequeByKey(String key) {
        delegate.clearDequeByKey(key);
    }
}
