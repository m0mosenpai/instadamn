package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.BCV;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class RawEditableTextListener implements BCV {
    public HybridData mHybridData;

    @Override // X.BCV
    public native void onExit();

    @Override // X.BCV
    public native void onTextChanged(String str);

    public RawEditableTextListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
