package com.facebook.mediastreaming.opt.videoqualityquery;

import X.C09170dP;
import X.C53710Noz;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public class VideoQualityDeviceModelServiceProviderHolder extends ServiceProviderHolder {
    public static final C53710Noz Companion = new Object();

    private final native void initHybrid(String str);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Noz] */
    static {
        C09170dP.A0C("mediastreaming-videoqualityquery");
    }

    public VideoQualityDeviceModelServiceProviderHolder(String str) {
        initHybrid(str);
    }
}
