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

import org.slf4j.IMarkerFactory;
import org.slf4j.Marker;

public class IMarkerFactoryAdapter implements IMarkerFactory {
    private final org.apache.rocketmq.logging.org.slf4j.IMarkerFactory delegate;

    public IMarkerFactoryAdapter(org.apache.rocketmq.logging.org.slf4j.IMarkerFactory delegate) {
        this.delegate = delegate;
    }

    @Override
    public Marker getMarker(String name) {
        return new MarkerAdapter(delegate.getMarker(name));
    }

    @Override
    public boolean exists(String name) {
        return delegate.exists(name);
    }

    @Override
    public boolean detachMarker(String name) {
        return delegate.detachMarker(name);
    }

    @Override
    public Marker getDetachedMarker(String name) {
        return new MarkerAdapter(delegate.getDetachedMarker(name));
    }
}
