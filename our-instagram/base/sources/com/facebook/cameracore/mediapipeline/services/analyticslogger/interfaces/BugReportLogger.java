package com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces;

import X.C00O;
import com.facebook.jni.HybridData;

/* loaded from: classes12.dex */
public abstract class BugReportLogger {
    public HybridData mHybridData;

    public abstract void logEvent(String str, boolean z);

    public BugReportLogger() {
        throw C00O.createAndThrow();
    }
}
