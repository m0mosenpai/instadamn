package com.meta.foa.instagram.performancelogging.s2s;

import X.AbstractC47292Ex;
import X.C14360o3;
import X.C163317Sr;
import X.C206829Dn;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.common.session.UserSession;
import com.meta.foa.performancelogging.FOAMessagingPerformanceLogger;

/* loaded from: classes3.dex */
public final class IGFOAMessagingSendToSentLoggingController extends AbstractC47292Ex {
    public static final C163317Sr Companion = new Object();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IGFOAMessagingSendToSentLoggingController(UserSession userSession) {
        super(true, userSession);
        C14360o3.A0B(userSession, 1);
    }

    public static final IGFOAMessagingSendToSentLoggingController getInstance(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (IGFOAMessagingSendToSentLoggingController) userSession.A01(IGFOAMessagingSendToSentLoggingController.class, new C206829Dn(userSession, 9));
    }

    @Override // X.AbstractC47302Ey
    public void onLoggerEnded(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        C14360o3.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null && this.activeLoggers.remove(instanceKey) == null) {
            debugS2STextQPL(instanceKey, "unstarted_trace");
        }
    }

    @Override // X.AbstractC47302Ey
    public boolean onLoggerStarted(FOAMessagingPerformanceLogger fOAMessagingPerformanceLogger) {
        C14360o3.A0B(fOAMessagingPerformanceLogger, 0);
        Integer instanceKey = fOAMessagingPerformanceLogger.getInstanceKey();
        if (instanceKey != null) {
            if (this.activeLoggers.putIfAbsent(instanceKey, fOAMessagingPerformanceLogger) != null) {
                debugS2STextQPL(instanceKey, "starting_duplicate_logger");
            } else {
                return true;
            }
        }
        return false;
    }

    private final void debugS2STextQPL(Integer num, String str) {
        EventBuilder markEventBuilder;
        EventBuilder annotate;
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            EventBuilder markEventBuilder2 = qPLInstance.markEventBuilder(936446320, str);
            int i = 0;
            if (markEventBuilder2 != null && markEventBuilder2.isSampled() && (markEventBuilder = qPLInstance.markEventBuilder(936446320, str)) != null) {
                if (num != null) {
                    i = num.intValue();
                }
                EventBuilder annotate2 = markEventBuilder.annotate("instanceKey", i);
                if (annotate2 != null && (annotate = annotate2.annotate("event_subtype", str)) != null) {
                    annotate.report();
                }
            }
        }
    }

    @Override // X.AbstractC47302Ey
    public IGFOAMessagingSendToSentLogger getLogger(Integer num) {
        return (IGFOAMessagingSendToSentLogger) super.getLogger(num);
    }

    @Override // X.AbstractC47302Ey
    public /* bridge */ /* synthetic */ FOAMessagingPerformanceLogger getLogger(Integer num) {
        return super.getLogger(num);
    }
}
