package com.facebook.mediastreaming.client.livestreaming.livetrace;

import X.C09170dP;
import X.C53685Noa;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public final class LiveTraceServiceProviderHolder extends ServiceProviderHolder {
    public static final C53685Noa Companion = new Object();

    private final native void initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Noa, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-livetrace");
    }

    public LiveTraceServiceProviderHolder() {
        initHybrid();
    }
}
