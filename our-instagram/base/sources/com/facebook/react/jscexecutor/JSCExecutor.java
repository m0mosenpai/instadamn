package com.facebook.react.jscexecutor;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;

/* loaded from: classes10.dex */
public abstract class JSCExecutor extends JavaScriptExecutor {
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    static {
        C09170dP.A0C("jscexecutor");
    }
}
