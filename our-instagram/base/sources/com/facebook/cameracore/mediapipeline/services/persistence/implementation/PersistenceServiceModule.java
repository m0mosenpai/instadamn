package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C203848zt;
import X.C224939wI;
import X.C90P;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PersistenceServiceModule extends ServiceModule {
    public static final C224939wI Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9wI, java.lang.Object] */
    static {
        C09170dP.A0C("arpersistenceservice");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90P.A05;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                return new PersistenceServiceConfigurationHybrid((C90P) anonymousClass904.A02(c203848zt));
            }
            return null;
        }
        return null;
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
