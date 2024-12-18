package com.facebook.jni.kotlin;

import X.C0T5;
import X.C14360o3;
import X.InterfaceC16660sJ;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction1 extends C0T5 implements InterfaceC16660sJ {
    public final HybridData mHybridData;

    public NativeFunction1(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC16660sJ
    public native Object invoke(Object obj);
}
