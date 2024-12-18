package com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces;

import X.C00O;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class ComponentSyncListener {
    public HybridData mHybridData;

    public final native void flushLogs();

    public ComponentSyncListener() {
        throw C00O.createAndThrow();
    }
}
