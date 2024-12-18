package com.facebook.cameracore.mediapipeline.standalonetracking;

import X.C09170dP;
import X.C54322Nzg;
import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public class ManifestBuilder {
    public final HybridData mHybridData;

    private native void enableBodyTracking();

    private native void enableCapability(String str);

    private native void enableFaceExpressions();

    private native void enableFaceTracking(int i);

    private native void enableFaceTracking3D(int i);

    private native void enableHairSegmentation();

    private native void enableHandTracking(int i, boolean z);

    private native void enableLocation();

    private native void enablePersonSegmentation();

    private native void enableWorldTracking();

    public static native HybridData initHybrid();

    public ManifestBuilder() {
        synchronized (C54322Nzg.class) {
            if (!C54322Nzg.A00) {
                C09170dP.A0C("arstandalonetracking-native-android");
                C54322Nzg.A00 = true;
            }
        }
        this.mHybridData = initHybrid();
    }
}
