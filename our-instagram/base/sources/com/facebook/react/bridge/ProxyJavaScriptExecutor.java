package com.facebook.react.bridge;

import X.STV;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public abstract class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    static {
        STV.A00();
    }
}
