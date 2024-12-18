package com.facebook.cameracore.mediapipeline.services.uicontrol;

import X.InterfaceC25157BBb;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class OnPickerItemSelectedListener implements InterfaceC25157BBb {
    public HybridData mHybridData;

    @Override // X.InterfaceC25157BBb
    public native void onPickerItemSelected(int i);

    public OnPickerItemSelectedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
