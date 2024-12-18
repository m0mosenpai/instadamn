package com.facebook.video.common.livestreaming.protocol;

import X.AbstractC166987dD;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes10.dex */
public class VideoBroadcastLiveWithConfigSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(VideoBroadcastLiveWithConfig.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        anonymousClass182.A0b();
        anonymousClass182.A0d();
        throw AbstractC166987dD.A15("isUseRtmpDimensionsForLiveSwapEnabled");
    }
}
