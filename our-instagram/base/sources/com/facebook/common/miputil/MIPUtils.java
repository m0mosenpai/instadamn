package com.facebook.common.miputil;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class MIPUtils {
    public final HybridData mHybridData = initHybrid();

    private native byte[] getProfileRawData(boolean z, byte b);

    public static native HybridData initHybrid();

    public native void dumpProfileInfoToFile(String str, boolean z, byte b);

    public native void resetProfileRawData(byte b);

    static {
        C09170dP.A0C("mip_utils_jni");
    }
}
