package com.meta.foa.instagram.performancelogging.messagingready;

import X.AbstractC06930Yk;
import X.AbstractC47292Ex;
import X.C14360o3;
import X.C206829Dn;
import X.C218914p;
import X.C47312Ez;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;
import java.util.Map;

/* loaded from: classes.dex */
public final class IGFOAMessagingReadyLoggingController extends AbstractC47292Ex {
    public static final C47312Ez Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGFOAMessagingReadyLoggingController(UserSession userSession) {
        super(false, userSession);
        C14360o3.A0B(userSession, 1);
    }

    public static final IGFOAMessagingReadyLoggingController getInstance(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (IGFOAMessagingReadyLoggingController) userSession.A01(IGFOAMessagingReadyLoggingController.class, new C206829Dn(userSession, 8));
    }

    @Override // X.AbstractC47292Ex, X.InterfaceC13000lm
    public void onSessionWillEnd() {
        for (Map.Entry entry : AbstractC06930Yk.A0B(this.activeLoggers).entrySet()) {
            ((Number) entry.getKey()).intValue();
            FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger = (FOAMessagingPerformanceLogger) entry.getValue();
            C14360o3.A0C(fOAMessagingPerformanceLogger, "null cannot be cast to non-null type com.meta.foa.instagram.performancelogging.messagingready.IGFOAMessagingReadyLogger");
            fOAMessagingPerformanceLogger.onEndFlowFail("session_end");
        }
        this.activeLoggers.clear();
        C218914p.A06(this.backgroundDetectorListener);
    }

    @Override // X.AbstractC47302Ey
    public IGFOAMessagingReadyLogger getLogger(Integer num) {
        return (IGFOAMessagingReadyLogger) super.getLogger(num);
    }

    @Override // X.AbstractC47302Ey
    public /* bridge */ /* synthetic */ FOAMessagingPerformanceLogger getLogger(Integer num) {
        return super.getLogger(num);
    }
}
