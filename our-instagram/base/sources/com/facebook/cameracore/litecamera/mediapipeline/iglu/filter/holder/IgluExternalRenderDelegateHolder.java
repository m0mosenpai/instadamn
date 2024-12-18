package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.C09170dP;
import X.C224619vm;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class IgluExternalRenderDelegateHolder {
    public static final C224619vm Companion = new Object();
    public HybridData mHybridData;

    public static final native HybridData initHybrid(FilterWeakPtr filterWeakPtr, IgluExternalRenderDelegateWrapper igluExternalRenderDelegateWrapper);

    private final native void releaseNative();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9vm, java.lang.Object] */
    static {
        C09170dP.A0C("mediapipeline-iglufilter-holder");
    }

    public final void release() {
        releaseNative();
    }
}
