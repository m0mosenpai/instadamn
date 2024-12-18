package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.C224909wF;
import X.C9Y2;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class ParticipantServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224909wF Companion = new Object();
    public final C9Y2 configuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParticipantServiceConfigurationHybrid(X.C9Y2 r3) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            X.BB2 r1 = r3.A00
            com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge r0 = new com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceDelegateBridge
            r0.<init>()
            r0.delegate = r1
            com.facebook.jni.HybridData r0 = initHybrid(r0)
            r2.<init>(r0)
            r2.configuration = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.participant.implementation.ParticipantServiceConfigurationHybrid.<init>(X.9Y2):void");
    }

    public static final native HybridData initHybrid(ParticipantServiceDelegateBridge participantServiceDelegateBridge);
}
