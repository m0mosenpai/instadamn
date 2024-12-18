package com.facebook.react.bridge;

import com.facebook.jni.HybridClassBase;

/* loaded from: classes10.dex */
public final class DynamicNative extends HybridClassBase implements Dynamic {
    private final native ReadableType getTypeNative();

    private final native boolean isNullNative();

    @Override // com.facebook.react.bridge.Dynamic
    public native ReadableArray asArray();

    @Override // com.facebook.react.bridge.Dynamic
    public native boolean asBoolean();

    @Override // com.facebook.react.bridge.Dynamic
    public native double asDouble();

    @Override // com.facebook.react.bridge.Dynamic
    public native ReadableMap asMap();

    @Override // com.facebook.react.bridge.Dynamic
    public native String asString();

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return (int) asDouble();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        return getTypeNative();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return isNullNative();
    }
}
