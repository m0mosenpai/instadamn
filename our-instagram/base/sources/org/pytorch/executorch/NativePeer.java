package org.pytorch.executorch;

import X.C09270dc;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class NativePeer {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, int i);

    public native EValue[] execute(String str, EValue... eValueArr);

    public native EValue[] forward(EValue... eValueArr);

    public native int loadMethod(String str);

    static {
        C09270dc.A01("executorch");
    }

    public NativePeer(String str, int i) {
        this.mHybridData = initHybrid(str, i);
    }
}
