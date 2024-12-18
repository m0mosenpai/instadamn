package com.facebook.video.common.livestreaming.protocol;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* loaded from: classes10.dex */
public class VideoBroadcastVideoStreamingConfigSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(VideoBroadcastVideoStreamingConfig.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig = (VideoBroadcastVideoStreamingConfig) obj;
        if (videoBroadcastVideoStreamingConfig == null) {
            anonymousClass182.A0b();
        }
        anonymousClass182.A0d();
        int i = videoBroadcastVideoStreamingConfig.width;
        anonymousClass182.A0r(IgReactMediaPickerNativeModule.WIDTH);
        anonymousClass182.A0h(i);
        int i2 = videoBroadcastVideoStreamingConfig.height;
        anonymousClass182.A0r(IgReactMediaPickerNativeModule.HEIGHT);
        anonymousClass182.A0h(i2);
        int i3 = videoBroadcastVideoStreamingConfig.bitRate;
        anonymousClass182.A0r("bitRate");
        anonymousClass182.A0h(i3);
        int i4 = videoBroadcastVideoStreamingConfig.frameRate;
        anonymousClass182.A0r("frameRate");
        anonymousClass182.A0h(i4);
        AbstractC121565f4.A04(anonymousClass182, "videoProfile", videoBroadcastVideoStreamingConfig.videoProfile);
        float f = videoBroadcastVideoStreamingConfig.iFrameInterval;
        anonymousClass182.A0r("iFrameInterval");
        anonymousClass182.A0g(f);
        anonymousClass182.A0a();
    }
}
