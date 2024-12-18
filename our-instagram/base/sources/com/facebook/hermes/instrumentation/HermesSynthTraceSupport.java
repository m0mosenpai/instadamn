package com.facebook.hermes.instrumentation;

/* loaded from: classes10.dex */
public interface HermesSynthTraceSupport {
    boolean isEnabled();

    boolean registerTrace(String str);

    String resultPath(String str);

    String scratchPath();
}
