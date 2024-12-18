package com.instagram.ml.bodytracking;

import X.C09170dP;
import X.C0w9;
import X.C14360o3;
import X.C203518zB;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class BodyTrackerJni {
    public static final C203518zB Companion = new Object();
    public static boolean isLibraryLoadSuccessful;
    public final HybridData mHybridData;

    public BodyTrackerJni(String str, String str2, boolean z) {
        HybridData hybridData;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        if (isLibraryLoadSuccessful) {
            hybridData = initHybrid(str, str2, z);
        } else {
            hybridData = null;
        }
        this.mHybridData = hybridData;
        if (!isLibraryLoadSuccessful) {
            C0w9.A03("BodyTrackerJni", "Failed to load library when initializing BodyTrackerJni");
        }
    }

    private final native HybridData initHybrid(String str, String str2, boolean z);

    public final native float[] getAllBoundingBoxes();

    public final native float[] getBoundingBox(int i);

    public final native int getDetectedPeopleCount();

    public final native int[] getDetectedPeopleIds();

    public final native void setupSinglePhotoDetection();

    public final native void updateFrameByteBuffer(int i, int i2, ByteBuffer byteBuffer);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8zB, java.lang.Object] */
    static {
        C09170dP.A0C("body-tracker");
        try {
            C09170dP.A0D("torch-code-gen", 16);
            C09170dP.A0D("dynamic_pytorch_impl", 16);
            isLibraryLoadSuccessful = true;
        } catch (UnsatisfiedLinkError e) {
            isLibraryLoadSuccessful = false;
            C0w9.A06("BodyTrackerJni", "SoLoader pytorch library exception:", e);
        }
    }

    public final boolean isReady() {
        if (isLibraryLoadSuccessful && this.mHybridData != null) {
            return true;
        }
        return false;
    }
}
