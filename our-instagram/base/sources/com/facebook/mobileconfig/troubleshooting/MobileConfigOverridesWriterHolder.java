package com.facebook.mobileconfig.troubleshooting;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;

/* loaded from: classes11.dex */
public class MobileConfigOverridesWriterHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native BisectHelperHolder getNewMCBisectHelper(BisectDefaultValuesProvider bisectDefaultValuesProvider);

    public native String importOverridesFromTask(String str);

    public native String importOverridesFromUser(String str);

    public native String loadOverridesFromTaskAndSaveResponse(String str);

    static {
        C09170dP.A0C("mobileconfigtroubleshooting-jni");
    }

    public MobileConfigOverridesWriterHolder(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl) {
        this.mHybridData = initHybrid(mobileConfigManagerHolderImpl);
    }
}
