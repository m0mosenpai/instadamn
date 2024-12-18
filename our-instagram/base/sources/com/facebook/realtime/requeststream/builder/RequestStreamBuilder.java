package com.facebook.realtime.requeststream.builder;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.realtime.common.appstate.AppStateSyncer;
import com.facebook.realtime.common.streamid.RSStreamIdProvider;
import com.facebook.realtime.requeststream.api.BaseRequestStreamClient;
import com.facebook.realtime.requeststream.client.SandboxConfigSource;

/* loaded from: classes.dex */
public abstract class RequestStreamBuilder {
    public final HybridData mHybridData;

    public native RequestStreamClientImpl buildNative();

    public native RequestStreamBuilder disableAmendmentBuffering();

    public native RequestStreamBuilder enableE2ELogging(LoggingConfig loggingConfig);

    public native RequestStreamBuilder enableFlipperPlugin();

    public native RequestStreamBuilder enableSandboxOverride(SandboxConfigSource sandboxConfigSource);

    public native RequestStreamBuilder enableThrottling(String str);

    public native RequestStreamBuilder listenToAppState(AppStateSyncer appStateSyncer);

    public native RequestStreamBuilder logSoftErrorOnRequestIdMismatch();

    public native RequestStreamBuilder withStreamIdProvider(RSStreamIdProvider rSStreamIdProvider);

    static {
        C09170dP.A0C("rs-builder-jni");
    }

    public RequestStreamBuilder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public BaseRequestStreamClient build() {
        return buildNative();
    }
}
