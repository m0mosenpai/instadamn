package com.facebook.react.bridge;

import X.AbstractC05810Sj;
import X.AbstractC58321PtD;
import X.C62154S0b;
import X.InterfaceC65657Tqj;
import X.STV;

/* loaded from: classes10.dex */
public final class WritableNativeMap extends ReadableNativeMap implements InterfaceC65657Tqj {
    public static final C62154S0b Companion = new Object();

    private final native void initHybrid();

    private final native void mergeNativeMap(ReadableNativeMap readableNativeMap);

    private final native void putNativeArray(String str, ReadableNativeArray readableNativeArray);

    private final native void putNativeMap(String str, ReadableNativeMap readableNativeMap);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if ((r4 instanceof com.facebook.react.bridge.ReadableNativeArray) != false) goto L6;
     */
    @Override // X.InterfaceC65657Tqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putArray(java.lang.String r3, com.facebook.react.bridge.ReadableArray r4) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            if (r4 == 0) goto Lb
            boolean r0 = r4 instanceof com.facebook.react.bridge.ReadableNativeArray
            r1 = 0
            if (r0 == 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            java.lang.String r0 = "Illegal type provided"
            X.AbstractC05810Sj.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeArray r4 = (com.facebook.react.bridge.ReadableNativeArray) r4
            r2.putNativeArray(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeMap.putArray(java.lang.String, com.facebook.react.bridge.ReadableArray):void");
    }

    public native void putBoolean(String str, boolean z);

    @Override // X.InterfaceC65657Tqj
    public native void putDouble(String str, double d);

    public native void putInt(String str, int i);

    public native void putLong(String str, long j);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if ((r4 instanceof com.facebook.react.bridge.ReadableNativeMap) != false) goto L6;
     */
    @Override // X.InterfaceC65657Tqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void putMap(java.lang.String r3, com.facebook.react.bridge.ReadableMap r4) {
        /*
            r2 = this;
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            if (r4 == 0) goto Lb
            boolean r0 = r4 instanceof com.facebook.react.bridge.ReadableNativeMap
            r1 = 0
            if (r0 == 0) goto Lc
        Lb:
            r1 = 1
        Lc:
            java.lang.String r0 = "Illegal type provided"
            X.AbstractC05810Sj.A03(r1, r0)
            com.facebook.react.bridge.ReadableNativeMap r4 = (com.facebook.react.bridge.ReadableNativeMap) r4
            r2.putNativeMap(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.WritableNativeMap.putMap(java.lang.String, com.facebook.react.bridge.ReadableMap):void");
    }

    public native void putNull(String str);

    @Override // X.InterfaceC65657Tqj
    public native void putString(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.S0b, java.lang.Object] */
    static {
        STV.A00();
    }

    public WritableNativeMap() {
        initHybrid();
    }

    @Override // X.InterfaceC65657Tqj
    public InterfaceC65657Tqj copy() {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        AbstractC05810Sj.A03(this instanceof ReadableNativeMap, "Illegal type provided");
        A0c.mergeNativeMap(this);
        return A0c;
    }
}
