package com.facebook.gltf.jni;

import X.C09170dP;
import com.facebook.jni.HybridData;

/* loaded from: classes11.dex */
public class GltfRenderSession {
    public static boolean isLibraryLoaded;
    public final HybridData mHybridData = initHybrid(true);

    public GltfRenderSession(boolean z) {
    }

    public static native HybridData initHybrid(boolean z);

    public native float[] getBoundingBox();

    public native float[] getBoundingFrustum();

    public native float getCameraZ();

    public native float[] getDirectionFromScreenPosition(float f, float f2);

    public native float getExtrasHFov();

    public native float getExtrasVFov();

    public native float getRayDistance(float f, float f2, float f3);

    public native long getTotalTextureSize();

    public native long getTotalTriangleCount();

    public native long getTotalVertexCount();

    public native boolean loadModelAtPath(String str);

    public native void release();

    public native void render(int i, int i2);

    public native void setCameraPosition(float f, float f2, float f3, float f4, float f5, float f6);

    public native void setClearColor(float f, float f2, float f3, float f4);

    public native void setClippingPlanes(float f, float f2);

    public native void setFixedCamera(boolean z);

    public native void setIBLPath(String str);

    public native void updateFieldOfView(float f);

    static {
        C09170dP.A0C("gltfrenderer-native-android");
        isLibraryLoaded = true;
    }
}
