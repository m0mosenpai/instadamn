package com.facebook.video.common.livestreaming.protocol;

import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class VideoBroadcastAudioStreamingConfigSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(VideoBroadcastAudioStreamingConfig.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        VideoBroadcastAudioStreamingConfig videoBroadcastAudioStreamingConfig = (VideoBroadcastAudioStreamingConfig) obj;
        if (videoBroadcastAudioStreamingConfig == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        int i = videoBroadcastAudioStreamingConfig.sampleRate;
        anonymousClass182.A0r("sampleRate");
        anonymousClass182.A0h(i);
        int i2 = videoBroadcastAudioStreamingConfig.bitRate;
        anonymousClass182.A0r("bitRate");
        anonymousClass182.A0h(i2);
        int i3 = videoBroadcastAudioStreamingConfig.channels;
        anonymousClass182.A0r("channels");
        anonymousClass182.A0h(i3);
        int i4 = videoBroadcastAudioStreamingConfig.profile;
        anonymousClass182.A0r("profile");
        anonymousClass182.A0h(i4);
        boolean z = videoBroadcastAudioStreamingConfig.useAudioASC;
        anonymousClass182.A0r("useAudioASC");
        anonymousClass182.A0y(z);
        anonymousClass182.A0a();
    }
}
