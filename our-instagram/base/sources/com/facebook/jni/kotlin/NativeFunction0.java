package com.facebook.jni.kotlin;

import X.C0T5;
import X.C14360o3;
import X.InterfaceC16820sZ;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction0 extends C0T5 implements InterfaceC16820sZ {
    public final HybridData mHybridData;

    public NativeFunction0(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC16820sZ
    public native Object invoke();
}
