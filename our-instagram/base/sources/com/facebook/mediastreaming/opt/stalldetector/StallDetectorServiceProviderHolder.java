package com.facebook.mediastreaming.opt.stalldetector;

import X.C09170dP;
import X.C14360o3;
import X.C53704Not;
import X.EnumC53197Nft;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public final class StallDetectorServiceProviderHolder extends ServiceProviderHolder {
    public static final C53704Not Companion = new Object();

    public StallDetectorServiceProviderHolder(double d, double d2, double d3, boolean z, EnumC53197Nft enumC53197Nft) {
        C14360o3.A0B(enumC53197Nft, 5);
        initHybrid(d, d2, d3, z, enumC53197Nft.A00);
    }

    private final native void initHybrid(double d, double d2, double d3, boolean z, int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Not, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-stalldetector");
    }
}
