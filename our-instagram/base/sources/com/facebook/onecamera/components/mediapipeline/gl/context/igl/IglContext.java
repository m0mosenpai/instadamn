package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.C09170dP;
import X.C225249wn;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class IglContext {
    public static final C225249wn Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native void attachInsightsNative(GPUInsights gPUInsights);

    public final native void detachInsightsNative(GPUInsights gPUInsights);

    public final native void finish();

    public final native void flush();

    public final native void release();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wn, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-igl-context");
    }

    public IglContext(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
