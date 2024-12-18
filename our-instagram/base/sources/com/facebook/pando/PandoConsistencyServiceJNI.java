package com.facebook.pando;

import X.C09170dP;
import X.C1DM;
import com.facebook.jni.HybridClassBase;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class PandoConsistencyServiceJNI extends HybridClassBase {
    public static final C1DM Companion = new Object();

    public static final native PandoConsistencyServiceJNI create(PandoConsistencyStackJNI pandoConsistencyStackJNI, Executor executor, int i, boolean z, int i2, boolean z2, int i3, boolean z3, boolean z4);

    public final native boolean hasSubscribersRacey();

    public final native void publishTreeUpdaters(List list, boolean z);

    public final native void setPublishPostProcessor(PandoPublishPostProcessorProvider pandoPublishPostProcessorProvider);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DM, java.lang.Object] */
    static {
        C09170dP.A0C("pando-jni");
    }
}
