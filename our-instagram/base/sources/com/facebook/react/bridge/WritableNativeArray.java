package com.facebook.react.bridge;

import X.InterfaceC65656Tqi;
import X.STV;

/* loaded from: classes10.dex */
public class WritableNativeArray extends ReadableNativeArray implements InterfaceC65656Tqi {
    private native void initHybrid();

    private native void pushNativeArray(ReadableNativeArray readableNativeArray);

    private native void pushNativeMap(ReadableNativeMap readableNativeMap);

    public native void pushBoolean(boolean z);

    public native void pushDouble(double d);

    @Override // X.InterfaceC65656Tqi
    public native void pushInt(int i);

    public native void pushLong(long j);

    public native void pushNull();

    public native void pushString(String str);

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if ((r3 instanceof com.facebook.react.bridge.ReadableNativeArray) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pushArray(com.facebook.react.bridge.ReadableArray r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L7
            boolean r0 = r3 instanceof com.facebook.react.bridge.ReadableNativeArray
            r1 = 0
            if (r0 == 0) goto L8
        L7:
            r1 = 1
        L8:
            java.lang.String r0 = "Illegal type provided"
            X.AbstractC05810Sj.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeArray r3 = (com.facebook.react.bridge.ReadableNativeArray) r3
            r2.pushNativeArray(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeArray.pushArray(com.facebook.react.bridge.ReadableArray):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        if ((r3 instanceof com.facebook.react.bridge.ReadableNativeMap) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void pushMap(com.facebook.react.bridge.ReadableMap r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L7
            boolean r0 = r3 instanceof com.facebook.react.bridge.ReadableNativeMap
            r1 = 0
            if (r0 == 0) goto L8
        L7:
            r1 = 1
        L8:
            java.lang.String r0 = "Illegal type provided"
            X.AbstractC05810Sj.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeMap r3 = (com.facebook.react.bridge.ReadableNativeMap) r3
            r2.pushNativeMap(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeArray.pushMap(com.facebook.react.bridge.ReadableMap):void");
    }

    static {
        STV.A00();
    }

    public WritableNativeArray() {
        initHybrid();
    }
}
