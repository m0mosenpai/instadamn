package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.C14360o3;
import X.C224749vz;
import X.C90O;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C224749vz Companion = new Object();
    public final C90O configuration;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public PlatformEventsDataProviderConfigurationHybrid(C90O c90o) {
        C14360o3.A0B(c90o, 1);
        this.configuration = c90o;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(c90o.A01, c90o.A00);
        this.objectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}
