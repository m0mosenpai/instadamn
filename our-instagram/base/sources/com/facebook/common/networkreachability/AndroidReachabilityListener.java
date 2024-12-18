package com.facebook.common.networkreachability;

import X.C09170dP;
import X.C62686SMa;
import X.C63985SxB;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class AndroidReachabilityListener {
    public static final AndroidReachabilityListener $redex_init_class = null;
    public final HybridData mHybridData;
    public final NetworkStateInfo mNetworkStateInfo;
    public final C62686SMa mNetworkTypeProvider;

    private native HybridData initHybrid(NetworkStateInfo networkStateInfo);

    public native void networkStateChanged(int i, int i2);

    static {
        C09170dP.A0C("android-reachability-announcer");
    }

    public AndroidReachabilityListener(C62686SMa c62686SMa) {
        C63985SxB c63985SxB = new C63985SxB(this);
        this.mNetworkStateInfo = c63985SxB;
        this.mHybridData = initHybrid(c63985SxB);
        this.mNetworkTypeProvider = c62686SMa;
    }
}
