package com.facebook.gltf.jni;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public class Photo3DCameraControl {
    public static boolean isLibraryLoaded;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void enablePinch();

    public native float getPitch();

    public native float getRoll();

    public native float getYaw();

    public native void panEnd(float f, float f2);

    public native void panMove(float f, float f2);

    public native void panStart();

    public native void pinchEnd();

    public native void pinchMove(float f, float f2, float f3, float f4, float f5, float f6);

    public native void pinchStart();

    public native void resetCamera();

    public native void scrollUpdate(float f);

    public native void setBoundingBox(float[] fArr);

    public native void setHVFov(float f, float f2);

    public native void setIsFullscreen(boolean z);

    public native void stop();

    public native void tiltUpdate(float f, float f2, float f3);

    public native void update(GLTFCameraOrientation gLTFCameraOrientation, double d);

    static {
        C09170dP.A0C("gltfrenderer-native-android");
        isLibraryLoaded = true;
    }
}
