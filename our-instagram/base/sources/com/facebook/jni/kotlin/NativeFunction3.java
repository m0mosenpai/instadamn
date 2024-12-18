package com.facebook.jni.kotlin;

import X.C0T5;
import X.C14360o3;
import X.InterfaceC16610sE;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction3 extends C0T5 implements InterfaceC16610sE {
    public final HybridData mHybridData;

    public NativeFunction3(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC16610sE
    public native Object invoke(Object obj, Object obj2, Object obj3);
}
