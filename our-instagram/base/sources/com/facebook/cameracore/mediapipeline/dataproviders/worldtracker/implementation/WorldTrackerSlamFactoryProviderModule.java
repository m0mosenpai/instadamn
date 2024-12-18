package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import X.C09170dP;
import X.C201268vA;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerSlamFactoryProvider;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class WorldTrackerSlamFactoryProviderModule extends WorldTrackerSlamFactoryProvider {
    public static final C201268vA Companion = new Object();

    public static final native HybridData initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8vA, java.lang.Object] */
    static {
        C09170dP.A0C("slamfactoryprovider");
    }

    public WorldTrackerSlamFactoryProviderModule() {
        this.mHybridData = initHybrid();
    }
}
