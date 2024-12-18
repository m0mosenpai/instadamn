package com.meta.foa.instagram.performancelogging.navigation;

import X.AbstractC001800i;
import X.AbstractC47302Ey;
import X.C14360o3;
import X.C218914p;
import X.EnumC220415e;
import X.InterfaceC12870lZ;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes3.dex */
public final class IGFOAMessagingThreadViewNavigationLoggingController extends AbstractC47302Ey {
    public static final IGFOAMessagingThreadViewNavigationLoggingController INSTANCE = new AbstractC47302Ey(false, false);
    public static final String TAG = "IGFOAMessagingThreadViewNavigationLoggingController";
    public static final C218914p backgroundDetector = C218914p.A08;
    public static final InterfaceC12870lZ backgroundDetectorListener;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Ey, com.meta.foa.instagram.performancelogging.navigation.IGFOAMessagingThreadViewNavigationLoggingController] */
    static {
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.7Js
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-738194964);
                IGFOAMessagingThreadViewNavigationLoggingController iGFOAMessagingThreadViewNavigationLoggingController = IGFOAMessagingThreadViewNavigationLoggingController.INSTANCE;
                for (Map.Entry entry : AbstractC06930Yk.A0B(iGFOAMessagingThreadViewNavigationLoggingController.activeLoggers).entrySet()) {
                    ((Number) entry.getKey()).intValue();
                    FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
                    C218914p c218914p = C218914p.A08;
                    fOAMessagingPerformanceLogger.onAppBackgrounded(AwakeTimeSinceBootClock.INSTANCE.now() - LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                }
                iGFOAMessagingThreadViewNavigationLoggingController.activeLoggers.clear();
                C0f9.A0A(1853943309, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                C0f9.A0A(-372750726, C0f9.A03(-1733566456));
            }
        };
        backgroundDetectorListener = interfaceC12870lZ;
        C218914p.A03(EnumC220415e.A03, interfaceC12870lZ);
    }

    public IGFOAMessagingThreadViewNavigationLoggingController() {
        super(false, false);
    }

    public final IGFOAMessagingThreadViewNavigationLogger getLogger(UserSession userSession) {
        IGFOAMessagingThreadViewNavigationLogger iGFOAMessagingThreadViewNavigationLogger;
        C14360o3.A0B(userSession, 0);
        Collection values = this.activeLoggers.values();
        C14360o3.A07(values);
        Object A0A = AbstractC001800i.A0A(values);
        if (!(A0A instanceof IGFOAMessagingThreadViewNavigationLogger) || (iGFOAMessagingThreadViewNavigationLogger = (IGFOAMessagingThreadViewNavigationLogger) A0A) == null) {
            return null;
        }
        iGFOAMessagingThreadViewNavigationLogger.updateExtras(userSession);
        return iGFOAMessagingThreadViewNavigationLogger;
    }

    @Override // X.AbstractC47302Ey
    public String getTAG() {
        return TAG;
    }
}
