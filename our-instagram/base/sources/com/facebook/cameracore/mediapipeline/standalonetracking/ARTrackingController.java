package com.facebook.cameracore.mediapipeline.standalonetracking;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class ARTrackingController {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(EffectServiceHost effectServiceHost, ManifestBuilder manifestBuilder, List list, boolean z);

    private native TrackingResult trackNewData(long j);
}
