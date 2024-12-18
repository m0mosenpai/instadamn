package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.AnonymousClass904;
import X.C09170dP;
import X.C2039190d;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class LocationDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        C09170dP.A0C("locationdataprovider");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        C2039190d c2039190d;
        if (anonymousClass904 != null && (c2039190d = anonymousClass904.A03) != null) {
            return new LocationDataProviderConfigurationHybrid(c2039190d);
        }
        return null;
    }

    public LocationDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
