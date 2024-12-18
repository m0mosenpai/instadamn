package com.facebook.jni.kotlin;

import X.C0T5;
import X.C14360o3;
import X.InterfaceC16620sF;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction2 extends C0T5 implements InterfaceC16620sF {
    public final HybridData mHybridData;

    public NativeFunction2(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC16620sF
    public native Object invoke(Object obj, Object obj2);
}
