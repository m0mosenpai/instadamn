package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.InterfaceC149876og;
import X.InterfaceC25220BDu;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class CaptureEventInputWrapper implements InterfaceC25220BDu {
    public final InterfaceC149876og mCaptureEventInput;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    @Override // X.InterfaceC25220BDu
    public native void capturePhoto();

    @Override // X.InterfaceC25220BDu
    public native void finishCapturePhoto();

    @Override // X.InterfaceC25220BDu
    public native void setCaptureContext(int i);

    @Override // X.InterfaceC25220BDu
    public native void setCaptureDevicePosition(int i);

    @Override // X.InterfaceC25220BDu
    public native void setCaptureDeviceSize(int i, int i2);

    @Override // X.InterfaceC25220BDu
    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    @Override // X.InterfaceC25220BDu
    public native void setPreviewViewInfo(int i, int i2, float f);

    @Override // X.InterfaceC25220BDu
    public native void setRotation(int i);

    @Override // X.InterfaceC25220BDu
    public native void setZoomFactor(float f);

    @Override // X.InterfaceC25220BDu
    public native void startRecording();

    @Override // X.InterfaceC25220BDu
    public native void stopRecording();

    public CaptureEventInputWrapper(InterfaceC149876og interfaceC149876og) {
        this.mCaptureEventInput = interfaceC149876og;
        this.mHybridData = initHybrid(interfaceC149876og.Bpz(), interfaceC149876og.Bpx(), interfaceC149876og.Bpw(), interfaceC149876og.Bpy(), interfaceC149876og.CIm());
        interfaceC149876og.A90(this);
    }
}
