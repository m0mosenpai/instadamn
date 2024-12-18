package com.facebook.onecamera.components.mediagraph.iglu.nativegraph;

import X.AbstractC180237zD;
import X.AnonymousClass001;
import X.C05F;
import X.C09170dP;
import X.C199848so;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.FilterWeakPtr;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluConfigHolder;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class IgluFilterNativeGraph {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native void render();

    public native void attach(IgluConfigHolder igluConfigHolder);

    public native void detach();

    public native void setClearFramebuffer(boolean z);

    public native void setInputTexture(IgluIODescriptor igluIODescriptor);

    public native void setOutputTexture(IgluIODescriptor igluIODescriptor);

    public native void updateFilter(FilterWeakPtr filterWeakPtr);

    public native void useCurrentOutputFramebuffer(int i);

    static {
        C09170dP.A0C("onecamera-iglufilter-graph");
    }

    public void render(String str) {
        render();
        AbstractC180237zD.A02(AnonymousClass001.A0R("[IgluFilterNativeGraph#render]", str), new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.holder.IgluIODescriptor, java.lang.Object] */
    public void setInputTexture(int i, int i2, int i3, int i4) {
        Integer num;
        boolean z = false;
        if (i2 == 36197) {
            z = true;
        }
        C199848so c199848so = IgluIODescriptor.Companion;
        if (z) {
            num = C05F.A01;
        } else {
            num = C05F.A00;
        }
        int intValue = num.intValue();
        ?? obj = new Object();
        obj.mHybridData = IgluIODescriptor.initHybrid(i, i2, i3, i4, intValue, 7);
        setInputTexture(obj);
    }
}
