package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import X.C2039190d;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class LocationDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C2039190d mConfiguration;

    private native HybridData initHybrid();

    private LocationDataProvider createLocationDataProvider() {
        LocationDataProviderImpl locationDataProviderImpl = new LocationDataProviderImpl();
        this.mConfiguration.A00 = locationDataProviderImpl;
        return locationDataProviderImpl;
    }

    public LocationDataProviderConfigurationHybrid(C2039190d c2039190d) {
        this.mHybridData = initHybrid();
        this.mConfiguration = c2039190d;
    }
}
