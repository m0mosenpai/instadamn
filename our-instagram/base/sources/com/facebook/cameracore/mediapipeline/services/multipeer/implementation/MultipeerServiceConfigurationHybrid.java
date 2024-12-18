package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.C224889wD;
import X.C9Y1;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class MultipeerServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224889wD Companion = new Object();
    public final C9Y1 configuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultipeerServiceConfigurationHybrid(X.C9Y1 r3) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.BB1 r1 = r3.A00
            com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge r0 = new com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceDelegateBridge
            r0.<init>()
            r0.delegate = r1
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r2.<init>(r0)
            r2.configuration = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.multipeer.implementation.MultipeerServiceConfigurationHybrid.<init>(X.9Y1):void");
    }

    public static final native HybridData initHybrid(MultipeerServiceDelegateBridge multipeerServiceDelegateBridge);
}
