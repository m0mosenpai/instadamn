package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import X.C09170dP;
import X.C14360o3;
import X.C72531Xfk;
import X.EnumC222809sL;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;

/* loaded from: classes3.dex */
public final class NetworkConsentManagerJNI {
    public static final C72531Xfk Companion = new Object();
    public final HybridData mHybridData;

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        C14360o3.A0B(networkConsentStorage, 1);
        C14360o3.A0B(analyticsLogger, 2);
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private final native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    public void setUserConsent(String str, boolean z, EnumC222809sL enumC222809sL) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(enumC222809sL, 2);
        setUserConsent(str, z, enumC222809sL.A00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xfk, java.lang.Object] */
    static {
        C09170dP.A0C("ard-android-network-consent-manager-impl");
    }
}
