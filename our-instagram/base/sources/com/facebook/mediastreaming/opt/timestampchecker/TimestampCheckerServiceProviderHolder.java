package com.facebook.mediastreaming.opt.timestampchecker;

import X.C09170dP;
import X.C14360o3;
import X.C53705Nou;
import X.EnumC53198Nfu;
import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;

/* loaded from: classes9.dex */
public class TimestampCheckerServiceProviderHolder extends ServiceProviderHolder {
    public static final C53705Nou Companion = new Object();

    public TimestampCheckerServiceProviderHolder(double d, double d2, double d3, int i, EnumC53198Nfu enumC53198Nfu) {
        C14360o3.A0B(enumC53198Nfu, 5);
        initHybrid(d, d2, d3, i, enumC53198Nfu.A00);
    }

    private final native void initHybrid(double d, double d2, double d3, int i, int i2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Nou, java.lang.Object] */
    static {
        C09170dP.A0C("mediastreaming-timestampchecker");
    }
}
