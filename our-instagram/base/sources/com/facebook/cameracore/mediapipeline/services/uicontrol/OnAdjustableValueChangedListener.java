package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.InterfaceC25156BBa;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class OnAdjustableValueChangedListener implements InterfaceC25156BBa {
    public HybridData mHybridData;

    @Override // X.InterfaceC25156BBa
    public native void onAdjustableValueChanged(float f);

    public OnAdjustableValueChangedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
