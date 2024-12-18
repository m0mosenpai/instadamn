package com.facebook.mediastreaming.opt.mediastreamingtimer;

import X.C09170dP;
import X.C53698Non;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public final class MediaStreamingTimerProviderHolder extends ServiceProviderHolder {
    public static final C53698Non Companion = new Object();

    private final native void initHybrid(boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Non, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-mediastreamingtimer");
    }

    public MediaStreamingTimerProviderHolder(boolean z) {
        initHybrid(z);
    }
}
