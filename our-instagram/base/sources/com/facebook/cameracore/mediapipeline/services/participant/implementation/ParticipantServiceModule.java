package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C203848zt;
import X.C224919wG;
import X.C9Y2;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class ParticipantServiceModule extends ServiceModule {
    public static final C224919wG Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wG] */
    static {
        C09170dP.A0C("participantservice");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C9Y2.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                return new ParticipantServiceConfigurationHybrid((C9Y2) anonymousClass904.A02(c203848zt));
            }
            return null;
        }
        return null;
    }

    public ParticipantServiceModule() {
        this.mHybridData = initHybrid();
    }
}
