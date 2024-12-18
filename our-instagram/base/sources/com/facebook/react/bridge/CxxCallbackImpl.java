package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;

/* loaded from: classes10.dex */
public class CxxCallbackImpl extends HybridClassBase implements Callback {
    private native void nativeInvoke(NativeArray nativeArray);

    @Override // com.facebook.react.bridge.Callback
    public void invoke(Object... objArr) {
        nativeInvoke(Arguments.fromJavaArgs(objArr));
    }
}
