package com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder;

import X.AbstractC193298h9;
import X.C09170dP;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.insights.GPUInsights;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class IgluConfigHolder {
    public final HybridData mHybridData;

    private native void attachInsightsNative(GPUInsights gPUInsights);

    private native void detachInsightsNative(GPUInsights gPUInsights);

    private native void releaseNative();

    static {
        C09170dP.A0C("mediapipeline-iglufilter-holder");
    }

    public void release() {
        GPUInsights gPUInsights = AbstractC193298h9.A00;
        if (gPUInsights != null) {
            gPUInsights.logExistingEvents("IgluConfigHolder");
            detachInsightsNative(gPUInsights);
        }
        releaseNative();
    }

    public IgluConfigHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
        if (AbstractC193298h9.A01 && AbstractC193298h9.A00 == null) {
            AbstractC193298h9.A00 = new GPUInsights();
        }
        GPUInsights gPUInsights = AbstractC193298h9.A00;
        if (gPUInsights != null) {
            attachInsightsNative(gPUInsights);
        }
    }
}
