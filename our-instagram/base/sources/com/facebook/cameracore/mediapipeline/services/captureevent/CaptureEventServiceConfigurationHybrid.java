package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.AnonymousClass901;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final AnonymousClass901 mConfiguration;

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(AnonymousClass901 anonymousClass901) {
        this.mConfiguration = anonymousClass901;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(anonymousClass901.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}
