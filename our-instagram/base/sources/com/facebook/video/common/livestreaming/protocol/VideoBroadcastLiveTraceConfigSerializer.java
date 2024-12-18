package com.facebook.video.common.livestreaming.protocol;

import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class VideoBroadcastLiveTraceConfigSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(VideoBroadcastLiveTraceConfig.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        VideoBroadcastLiveTraceConfig videoBroadcastLiveTraceConfig = (VideoBroadcastLiveTraceConfig) obj;
        if (videoBroadcastLiveTraceConfig == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        boolean z = videoBroadcastLiveTraceConfig.enabled;
        anonymousClass182.A0r("enabled");
        anonymousClass182.A0y(z);
        int i = videoBroadcastLiveTraceConfig.sampleIntervalInSeconds;
        anonymousClass182.A0r("sampleIntervalInSeconds");
        anonymousClass182.A0h(i);
        int i2 = videoBroadcastLiveTraceConfig.samplingSource;
        anonymousClass182.A0r("samplingSource");
        anonymousClass182.A0h(i2);
        anonymousClass182.A0a();
    }
}
