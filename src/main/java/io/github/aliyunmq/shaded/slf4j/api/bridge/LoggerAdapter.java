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

import org.slf4j.Logger;
import org.slf4j.Marker;

public class LoggerAdapter implements Logger {
    private final org.apache.rocketmq.logging.org.slf4j.Logger delegate;

    public LoggerAdapter(org.apache.rocketmq.logging.org.slf4j.Logger delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return delegate.isTraceEnabled();
    }

    @Override
    public void trace(String msg) {
        delegate.trace(msg);
    }

    @Override
    public void trace(String format, Object arg) {
        delegate.trace(format, arg);
    }

    @Override
    public void trace(String format, Object arg1, Object arg2) {
        delegate.trace(format, arg1, arg2);
    }

    @Override
    public void trace(String format, Object... arguments) {
        delegate.trace(format, arguments);
    }

    @Override
    public void trace(String msg, Throwable t) {
        delegate.trace(msg, t);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        return delegate.isTraceEnabled(markerAdapter.delegate);
    }

    @Override
    public void trace(Marker marker, String msg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.trace(markerAdapter.delegate, msg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.trace(markerAdapter.delegate, format, arg);
    }

    @Override
    public void trace(Marker marker, String format, Object arg1, Object arg2) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.trace(markerAdapter.delegate, format, arg1, arg2);
    }

    @Override
    public void trace(Marker marker, String format, Object... argArray) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.trace(markerAdapter.delegate, format, argArray);
    }

    @Override
    public void trace(Marker marker, String msg, Throwable t) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.trace(markerAdapter.delegate, msg, t);
    }

    @Override
    public boolean isDebugEnabled() {
        return delegate.isDebugEnabled();
    }

    @Override
    public void debug(String msg) {
        delegate.debug(msg);
    }

    @Override
    public void debug(String format, Object arg) {
        delegate.debug(format, arg);
    }

    @Override
    public void debug(String format, Object arg1, Object arg2) {
        delegate.debug(format, arg1, arg2);
    }

    @Override
    public void debug(String format, Object... arguments) {
        delegate.debug(format, arguments);
    }

    @Override
    public void debug(String msg, Throwable t) {
        delegate.debug(msg, t);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        return delegate.isDebugEnabled(markerAdapter.delegate);
    }

    @Override
    public void debug(Marker marker, String msg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.debug(markerAdapter.delegate, msg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.debug(markerAdapter.delegate, format, arg);
    }

    @Override
    public void debug(Marker marker, String format, Object arg1, Object arg2) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.debug(markerAdapter.delegate, format, arg1, arg2);
    }

    @Override
    public void debug(Marker marker, String format, Object... arguments) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.debug(markerAdapter.delegate, format, arguments);
    }

    @Override
    public void debug(Marker marker, String msg, Throwable t) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.debug(markerAdapter.delegate, msg, t);
    }

    @Override
    public boolean isInfoEnabled() {
        return delegate.isInfoEnabled();
    }

    @Override
    public void info(String msg) {
        delegate.info(msg);
    }

    @Override
    public void info(String format, Object arg) {
        delegate.info(format, arg);
    }

    @Override
    public void info(String format, Object arg1, Object arg2) {
        delegate.info(format, arg1, arg2);
    }

    @Override
    public void info(String format, Object... arguments) {
        delegate.info(format, arguments);
    }

    @Override
    public void info(String msg, Throwable t) {
        delegate.info(msg, t);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        return delegate.isInfoEnabled(markerAdapter.delegate);
    }

    @Override
    public void info(Marker marker, String msg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.info(markerAdapter.delegate, msg);
    }

    @Override
    public void info(Marker marker, String format, Object arg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.info(markerAdapter.delegate, format, arg);
    }

    @Override
    public void info(Marker marker, String format, Object arg1, Object arg2) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.info(markerAdapter.delegate, format, arg1, arg2);
    }

    @Override
    public void info(Marker marker, String format, Object... arguments) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.info(markerAdapter.delegate, format, arguments);
    }

    @Override
    public void info(Marker marker, String msg, Throwable t) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.info(markerAdapter.delegate, msg, t);
    }

    @Override
    public boolean isWarnEnabled() {
        return delegate.isWarnEnabled();
    }

    @Override
    public void warn(String msg) {
        delegate.warn(msg);
    }

    @Override
    public void warn(String format, Object arg) {
        delegate.warn(format, arg);
    }

    @Override
    public void warn(String format, Object... arguments) {
        delegate.warn(format, arguments);
    }

    @Override
    public void warn(String format, Object arg1, Object arg2) {
        delegate.warn(format, arg1, arg2);
    }

    @Override
    public void warn(String msg, Throwable t) {
        delegate.warn(msg, t);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return delegate.isWarnEnabled();
    }

    @Override
    public void warn(Marker marker, String msg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.warn(markerAdapter.delegate, msg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.warn(markerAdapter.delegate, format, arg);
    }

    @Override
    public void warn(Marker marker, String format, Object arg1, Object arg2) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.warn(markerAdapter.delegate, format, arg1, arg2);
    }

    @Override
    public void warn(Marker marker, String format, Object... arguments) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.warn(markerAdapter.delegate, format, arguments);
    }

    @Override
    public void warn(Marker marker, String msg, Throwable t) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.warn(markerAdapter.delegate, msg, t);
    }

    @Override
    public boolean isErrorEnabled() {
        return delegate.isErrorEnabled();
    }

    @Override
    public void error(String msg) {
        delegate.error(msg);
    }

    @Override
    public void error(String format, Object arg) {
        delegate.error(format, arg);
    }

    @Override
    public void error(String format, Object arg1, Object arg2) {
        delegate.error(format, arg1, arg2);
    }

    @Override
    public void error(String format, Object... arguments) {
        delegate.error(format, arguments);
    }

    @Override
    public void error(String msg, Throwable t) {
        delegate.error(msg, t);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        return delegate.isErrorEnabled(markerAdapter.delegate);
    }

    @Override
    public void error(Marker marker, String msg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.error(markerAdapter.delegate, msg);
    }

    @Override
    public void error(Marker marker, String format, Object arg) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.error(markerAdapter.delegate, format, arg);
    }

    @Override
    public void error(Marker marker, String format, Object arg1, Object arg2) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.error(markerAdapter.delegate, format, arg1, arg2);
    }

    @Override
    public void error(Marker marker, String format, Object... arguments) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.error(markerAdapter.delegate, format, arguments);
    }

    @Override
    public void error(Marker marker, String msg, Throwable t) {
        final MarkerAdapter markerAdapter = (MarkerAdapter) marker;
        delegate.error(markerAdapter.delegate, msg, t);
    }
}
