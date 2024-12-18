package com.facebook.jni.kotlin;

import X.C0T5;
import X.C0s8;
import X.C14360o3;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public final class NativeFunction8 extends C0T5 implements C0s8 {
    public final HybridData mHybridData;

    public NativeFunction8(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    @Override // X.C0s8
    public native Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);
}
