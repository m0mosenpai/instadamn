package com.facebook.cameracore.mediapipeline.services.memoryinfo;

import X.C224869wB;
import X.C90U;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class MemoryInfoServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224869wB Companion = new Object();
    public final C90U configuration;

    public static final native HybridData initHybrid(MemoryInfoServiceImpl memoryInfoServiceImpl);

    public MemoryInfoServiceConfigurationHybrid(C90U c90u) {
        super(initHybrid(c90u.A00));
        this.configuration = c90u;
    }
}
