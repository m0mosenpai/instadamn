package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.C224879wC;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public static final C224879wC Companion = new Object();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ServiceMessageChannelHybrid(X.C22859A6c r5) {
        /*
            r4 = this;
            r0 = 1
            X.C14360o3.A0B(r5, r0)
            X.ABJ r0 = r5.A01
            X.C14360o3.A07(r0)
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid r3 = new com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid
            r3.<init>(r0)
            r0.A01 = r3
            X.AG3 r0 = r0.A00
            if (r0 == 0) goto L1f
            int r2 = r0.A00
            java.nio.ByteBuffer r1 = r0.A01
            int r0 = r1.position()
            r3.setConfiguration(r2, r1, r0)
        L1f:
            X.6pz r0 = r5.A00
            int r0 = r0.A00
            com.facebook.jni.HybridData r0 = initHybrid(r3, r0)
            X.C14360o3.A0A(r0)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid.<init>(X.A6c):void");
    }

    public static final native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);
}
