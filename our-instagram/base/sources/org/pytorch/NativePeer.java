package org.pytorch;

import X.C09270dc;
import X.C8A6;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class NativePeer implements C8A6 {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    @Override // X.C8A6
    public native IValue forward(IValue... iValueArr);

    @Override // X.C8A6
    public native IValue runMethod(String str, IValue... iValueArr);

    static {
        C09270dc.A01("pytorch_jni");
        try {
            C09270dc.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
