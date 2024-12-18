package com.facebook.mobileconfig;

import X.AbstractC226018k;
import X.C09270dc;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MobileConfigMmapHandleHolder extends AbstractC226018k {
    public final HybridData mHybridData;

    public native String getFilename();

    static {
        C09270dc.A03("mobileconfig-jni");
    }

    public MobileConfigMmapHandleHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.AbstractC226118l
    public ByteBuffer getJavaByteBuffer() {
        return AbstractC226018k.A00(getFilename());
    }
}
