package com.facebook.realtime.requeststream.builder.dgw;

import X.C09170dP;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.RequestOptions;
import com.facebook.jni.HybridData;
import com.facebook.realtime.requeststream.builder.RequestStreamBuilder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class RequestStreamDGWBuilder extends RequestStreamBuilder {
    public static final RequestStreamDGWBuilder $redex_init_class = null;

    public RequestStreamDGWBuilder(DGWClient dGWClient, int i, String str, String str2, String str3, ScheduledExecutorService scheduledExecutorService) {
        super(initHybrid(dGWClient, i, str, str2, str3, scheduledExecutorService));
    }

    public static native HybridData initHybrid(DGWClient dGWClient, int i, String str, String str2, String str3, ScheduledExecutorService scheduledExecutorService);

    public native RequestStreamDGWBuilder withDGWRequestOptions(RequestOptions requestOptions);

    public native RequestStreamDGWBuilder withDGWStreamWriterConfig(DGWWriterConfig dGWWriterConfig);

    public native RequestStreamDGWBuilder withStreamGroupDecider(StreamGroupDecider streamGroupDecider);

    static {
        C09170dP.A0C("rs-dgw-builder-jni");
    }
}
