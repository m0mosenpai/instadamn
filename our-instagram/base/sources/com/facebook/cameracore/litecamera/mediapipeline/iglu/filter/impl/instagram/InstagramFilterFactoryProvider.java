package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram;

import X.C09170dP;
import X.C14360o3;
import X.C199528s0;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.SingleFilterFactory;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class InstagramFilterFactoryProvider {
    public static final C199528s0 Companion = new Object();
    public HybridData mHybridData;

    private final native SingleFilterFactory createFilterFactoryNative(String str);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public SingleFilterFactory createFilterFactory(String str) {
        C14360o3.A0B(str, 0);
        if (this.mHybridData == null) {
            C09170dP.A0C("mediapipeline-iglufilter-instagram");
            this.mHybridData = initHybrid();
        }
        return createFilterFactoryNative(str);
    }
}
