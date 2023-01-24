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

import java.util.Iterator;
import org.slf4j.Marker;

public class MarkerAdapter implements Marker {
    final org.apache.rocketmq.logging.org.slf4j.Marker delegate;

    public MarkerAdapter(org.apache.rocketmq.logging.org.slf4j.Marker delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    public void add(Marker reference) {
        final MarkerAdapter marker = (MarkerAdapter) reference;
        delegate.add(marker.delegate);
    }

    @Override
    public boolean remove(Marker reference) {
        final MarkerAdapter marker = (MarkerAdapter) reference;
        return delegate.remove(marker.delegate);
    }

    @Override
    public boolean hasChildren() {
        return delegate.hasReferences();
    }

    @Override
    public boolean hasReferences() {
        return delegate.hasReferences();
    }

    @Override
    public Iterator<Marker> iterator() {
        final Iterator<org.apache.rocketmq.logging.org.slf4j.Marker> iterator = delegate.iterator();
        return new Iterator<Marker>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Marker next() {
                return new MarkerAdapter(iterator.next());
            }

            @Override
            public void remove() {
                iterator.remove();
            }
        };
    }

    @Override
    public boolean contains(Marker other) {
        final MarkerAdapter marker = (MarkerAdapter) other;
        return delegate.contains(marker.delegate);
    }

    @Override
    public boolean contains(String name) {
        return delegate.contains(name);
    }
}
