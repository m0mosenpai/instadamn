package com.facebook.onecamera.components.mediapipeline.gl.context.igl;

import X.C09170dP;
import X.C225279wq;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes4.dex */
public final class IglTexture {
    public static final C225279wq Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public final native int getHandle();

    public final native int getHeight();

    public final native Map getParams();

    public final native int getTarget();

    public final native int getWidth();

    public final native void release();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wq, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-igl-context");
    }

    public IglTexture(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
