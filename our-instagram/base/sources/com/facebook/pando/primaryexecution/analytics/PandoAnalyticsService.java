package com.facebook.pando.primaryexecution.analytics;

import X.C09170dP;
import X.C4Io;
import com.facebook.jni.HybridData;
import com.facebook.pando.PandoPrimaryExecution;

/* loaded from: classes2.dex */
public final class PandoAnalyticsService extends PandoPrimaryExecution {
    public static final C4Io Companion = new Object();

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, int i);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Io, java.lang.Object] */
    static {
        C09170dP.A0C("pando-client-analytics-jni");
    }
}
