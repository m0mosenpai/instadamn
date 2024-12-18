package org.pytorch;

import X.C09270dc;
import X.C8A6;
import X.EnumC193198gz;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes4.dex */
public class LiteNativePeer implements C8A6 {
    public final HybridData mHybridData;

    public LiteNativePeer(String str, Map map, EnumC193198gz enumC193198gz) {
        this.mHybridData = initHybrid(str, null, 1);
    }

    public static native HybridData initHybrid(String str, Map map, int i);

    public static native HybridData initHybridAndroidAsset(String str, Object obj, int i);

    @Override // X.C8A6
    public native IValue forward(IValue... iValueArr);

    @Override // X.C8A6
    public native IValue runMethod(String str, IValue... iValueArr);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0dd, java.lang.Object] */
    static {
        if (!C09270dc.A02()) {
            C09270dc.A00(new Object());
        }
        C09270dc.A01("pytorch_jni_lite");
        try {
            C09270dc.A01("torch-code-gen");
        } catch (Throwable unused) {
        }
    }
}
