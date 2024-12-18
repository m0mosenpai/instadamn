package com.facebook.cameracore.mediapipeline.services.voiceinteraction;

import X.C2038990b;
import X.C224989wN;
import X.C90a;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class VoiceInteractionServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224989wN Companion = new Object();
    public final VoiceInteractionServiceDelegateWrapper delegateWrapper;

    public static final native HybridData initHybrid(VoiceInteractionServiceDelegateWrapper voiceInteractionServiceDelegateWrapper);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.cameracore.mediapipeline.services.voiceinteraction.VoiceInteractionServiceDelegateWrapper] */
    public VoiceInteractionServiceConfigurationHybrid(C90a c90a) {
        C2038990b c2038990b = c90a.A00;
        ?? obj = new Object();
        obj.delegate = c2038990b;
        this.delegateWrapper = obj;
        this.mHybridData = initHybrid(obj);
    }
}
