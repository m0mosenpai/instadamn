package com.facebook.distribgw.client.mns;

import X.AnonymousClass100;
import X.C09170dP;
import com.facebook.distribgw.client.DGWNetworkStackWrapperHolder;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class MNSDGWNetworkStackWrapperHolder extends DGWNetworkStackWrapperHolder {
    public static final AnonymousClass100 Companion = new Object();

    public static final native HybridData initHybrid(MNSDGWNetworkStackConfig mNSDGWNetworkStackConfig);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.100, java.lang.Object] */
    static {
        C09170dP.A0C("distribgw-mns-jni");
    }
}
