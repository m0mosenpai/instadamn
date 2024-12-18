package com.facebook.cameracore.mediapipeline.services.instruction;

import X.AnonymousClass909;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class InstructionServiceConfigurationHybrid extends ServiceConfiguration {
    public final AnonymousClass909 mConfiguration;

    public static native HybridData initHybrid(InstructionServiceListenerWrapper instructionServiceListenerWrapper);

    public InstructionServiceConfigurationHybrid(AnonymousClass909 anonymousClass909) {
        super(initHybrid(anonymousClass909.A00));
        this.mConfiguration = anonymousClass909;
    }
}
