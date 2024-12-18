package com.facebook.jni.kotlin;

import X.C0T5;
import X.C14360o3;
import X.InterfaceC16570sA;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction6 extends C0T5 implements InterfaceC16570sA {
    public final HybridData mHybridData;

    public NativeFunction6(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC16570sA
    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);
}
