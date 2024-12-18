package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.instagram.common.session.UserSession;

/* renamed from: X.1L8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1L8 {
    public static final C1L8 A00 = new Object();

    public final void A00(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36314317855001104L);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36314317854935567L);
        if (A06) {
            QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
            if (qPLInstance != null) {
                qPLInstance.sampleRateForMarker(11279966);
                qPLInstance.markerStart(11279966);
                qPLInstance.markerEnd(11279966, (short) 2);
            } else {
                throw new RuntimeException("we need qpl, test will assert on this event");
            }
        }
        if (A062) {
            AbstractC115265Ix.A00(context, true);
        }
    }
}
