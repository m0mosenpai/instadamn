package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C2040490t;
import X.C224779w2;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class WorldTrackerDataProviderModule extends ServiceModule {
    public static final C224779w2 Companion = new Object();

    private final native HybridData initHybrid();

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        C2040490t c2040490t;
        if (anonymousClass904 == null || (c2040490t = anonymousClass904.A04) == null) {
            return null;
        }
        return new WorldTrackerDataProviderConfigurationHybrid(c2040490t);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9w2, java.lang.Object] */
    static {
        C09170dP.A0C("worldtrackerdataprovider");
    }

    public WorldTrackerDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
