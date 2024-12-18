package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C203848zt;
import X.C224899wE;
import X.C9Y1;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class MultipeerServiceModule extends ServiceModule {
    public static final C224899wE Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9wE] */
    static {
        C09170dP.A0C("multipeerservice");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C9Y1.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                return new MultipeerServiceConfigurationHybrid((C9Y1) anonymousClass904.A02(c203848zt));
            }
            return null;
        }
        return null;
    }

    public MultipeerServiceModule() {
        this.mHybridData = initHybrid();
    }
}
