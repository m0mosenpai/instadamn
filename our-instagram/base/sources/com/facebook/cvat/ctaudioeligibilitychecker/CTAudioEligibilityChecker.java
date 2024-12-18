package com.facebook.cvat.ctaudioeligibilitychecker;

import X.C09170dP;
import X.C14360o3;
import X.C53678NoT;
import X.OXg;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class CTAudioEligibilityChecker {
    public static final C53678NoT Companion = new Object();
    public final HybridData mHybridData;

    private final native HybridData initHybrid(HashMap hashMap);

    private final native boolean nativeAnalyzeAudioEligibility(ByteBuffer byteBuffer, float f, int i, int i2);

    public final boolean analyzeAudioEligibility(String str) {
        C14360o3.A0B(str, 0);
        ByteBuffer A02 = OXg.A02(str, 0L, 0L);
        if (A02.capacity() == 0) {
            return false;
        }
        float A00 = (float) OXg.A00(str);
        int A01 = OXg.A01(str);
        return nativeAnalyzeAudioEligibility(A02, A00, A01, (A02.capacity() / 2) / A01);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.NoT, java.lang.Object] */
    static {
        C09170dP.A0C("ctaudioeligibilitychecker-native");
    }

    public CTAudioEligibilityChecker(HashMap hashMap) {
        this.mHybridData = initHybrid(hashMap);
    }
}
