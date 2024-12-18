package com.facebook.mobileconfig.troubleshooting;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import java.util.Set;

/* loaded from: classes11.dex */
public abstract class MobileConfigValueExplainerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native String getClientDrivenInfo(String str, Set set, int i);

    static {
        C09170dP.A0C("mobileconfigtroubleshooting-jni");
    }
}
