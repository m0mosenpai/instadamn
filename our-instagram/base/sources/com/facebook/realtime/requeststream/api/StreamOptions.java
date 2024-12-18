package com.facebook.realtime.requeststream.api;

/* loaded from: classes12.dex */
public interface StreamOptions {
    String getRequestLogContext();

    long getRetryBackoffInterval();

    boolean shouldGenNewStreamIdPerRetry();
}
