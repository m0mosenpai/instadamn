package com.facebook.react.bridge;

import X.STV;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class CxxModuleWrapperBase implements NativeModule {
    public HybridData mHybridData;

    @Override // com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public native String getName();

    @Override // com.facebook.react.bridge.NativeModule
    public void initialize() {
    }

    public /* synthetic */ void onCatalystInstanceDestroy() {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public void invalidate() {
        this.mHybridData.resetNative();
    }

    public void resetModule(HybridData hybridData) {
        HybridData hybridData2 = this.mHybridData;
        if (hybridData != hybridData2) {
            hybridData2.resetNative();
            this.mHybridData = hybridData;
        }
    }

    static {
        STV.A00();
    }

    public CxxModuleWrapperBase(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
