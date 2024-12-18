package com.facebook.react.bridge;

/* loaded from: classes10.dex */
public interface NativeModule {
    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();
}
