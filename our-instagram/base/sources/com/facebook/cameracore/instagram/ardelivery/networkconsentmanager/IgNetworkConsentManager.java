package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import X.C09170dP;
import X.C150556q8;
import X.C72531Xfk;
import X.EnumC150606qD;
import X.EnumC222809sL;
import X.InterfaceC13050lr;
import X.InterfaceC150566q9;
import X.InterfaceC16820sZ;
import com.facebook.cameracore.ardelivery.networkconsentmanager.impl.NetworkConsentManagerJNI;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentManager;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.instagram.common.session.UserSession;

/* loaded from: classes3.dex */
public class IgNetworkConsentManager implements InterfaceC13050lr {
    public static boolean sStaticLoaded;
    public final AnalyticsLogger mAnalyticsLogger;
    public final NetworkConsentManagerJNI mCameraCoreNetworkConsentManager;

    @Override // X.InterfaceC13050lr
    public void onUserSessionWillEnd(boolean z) {
    }

    static {
        C09170dP.A0C("ard-android-network-consent-manager-impl");
        sStaticLoaded = true;
    }

    public static IgNetworkConsentManager getInstance(final UserSession userSession) {
        return (IgNetworkConsentManager) userSession.A01(IgNetworkConsentManager.class, new InterfaceC16820sZ() { // from class: X.B2W
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new IgNetworkConsentManager(UserSession.this);
            }
        });
    }

    public static boolean isAnalyticsLoggerAvailable() {
        return sStaticLoaded;
    }

    public static /* synthetic */ IgNetworkConsentManager lambda$getInstance$0(UserSession userSession) {
        return new IgNetworkConsentManager(userSession);
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public NetworkConsentManagerJNI getNetworkConsentManagerJNI() {
        return this.mCameraCoreNetworkConsentManager;
    }

    public TriState hasUserAllowedNetworking(String str) {
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.mAnalyticsLogger;
        analyticsLoggerImpl.mProductName = "camera_core";
        InterfaceC150566q9 interfaceC150566q9 = analyticsLoggerImpl.mCameraARAnalyticsLogger;
        if (interfaceC150566q9 != null) {
            interfaceC150566q9.EW7(null, "camera_core", "", str, null, null, null, false);
        }
        return this.mCameraCoreNetworkConsentManager.hasUserAllowedNetworking(str);
    }

    public void setUserConsent(String str, boolean z, EnumC222809sL enumC222809sL) {
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.mAnalyticsLogger;
        analyticsLoggerImpl.mProductName = "camera_core";
        InterfaceC150566q9 interfaceC150566q9 = analyticsLoggerImpl.mCameraARAnalyticsLogger;
        if (interfaceC150566q9 != null) {
            interfaceC150566q9.EW7(null, "camera_core", "", str, null, null, null, false);
        }
        this.mCameraCoreNetworkConsentManager.setUserConsent(str, z, enumC222809sL);
    }

    public IgNetworkConsentManager(UserSession userSession) {
        AnalyticsLoggerImpl analyticsLoggerImpl = new AnalyticsLoggerImpl(new C150556q8(userSession), null, EnumC150606qD.USE_DEFAULT);
        this.mAnalyticsLogger = analyticsLoggerImpl;
        C72531Xfk c72531Xfk = NetworkConsentManagerJNI.Companion;
        this.mCameraCoreNetworkConsentManager = new NetworkConsentManagerJNI(IgNetworkConsentStorage.getInstance(userSession), analyticsLoggerImpl);
    }
}
