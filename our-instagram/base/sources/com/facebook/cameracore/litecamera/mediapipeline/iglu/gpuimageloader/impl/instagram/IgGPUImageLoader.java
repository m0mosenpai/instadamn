package com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram;

import X.C09170dP;
import X.C224639vo;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture;

/* loaded from: classes4.dex */
public final class IgGPUImageLoader {
    public static final C224639vo Companion = new Object();
    public HybridData mHybridData = initHybrid();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    public final native int getImageAlphaFormat();

    public final native int getImageColorFormat();

    public final native int getImageDataFormat();

    public final native int getImageFileFormat();

    public final native int getImageHeight();

    public final native boolean getImageMetadata(String str);

    public final native int getImageWidth();

    public final native boolean loadImage(String str);

    public final native IglTexture loadImageToGPU(String str);

    public final native void releaseImage();

    public final native void setCropInformation(int i, int i2, int i3, int i4);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9vo, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-gpuimageloader");
    }
}
