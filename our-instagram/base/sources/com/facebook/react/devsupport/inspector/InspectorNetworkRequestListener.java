package com.facebook.react.devsupport.inspector;

import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes10.dex */
public class InspectorNetworkRequestListener {
    public final HybridData mHybridData;

    public native void onCompletion();

    public native void onData(String str);

    public native void onError(String str);

    public native void onHeaders(int i, Map map);

    public InspectorNetworkRequestListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
