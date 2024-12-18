package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.1Ag */
/* loaded from: classes.dex */
public final class C23011Ag {
    public static final C23011Ag A00 = new Object();

    public static /* synthetic */ void A00(C229419w c229419w, C229419w c229419w2, C1AS c1as, C1AS c1as2, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, UserSession userSession, Integer num, List list, List list2, int i) {
        C23031Ai c23031Ai;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
        C23051Ak c23051Ak = null;
        if ((i & 256) != 0) {
            lightweightQuickPerformanceLogger2 = C1IN.A00(new C1IN());
        }
        if ((i & 512) != 0) {
            c23031Ai = AbstractC23021Ah.A00(userSession);
        } else {
            c23031Ai = null;
        }
        if ((i & 1024) != 0) {
            boolean z = C23051Ak.A05;
            c23051Ak = C23061Al.A00(userSession);
        }
        C14360o3.A0B(c1as, 1);
        C14360o3.A0B(lightweightQuickPerformanceLogger2, 8);
        C14360o3.A0B(c23031Ai, 9);
        C14360o3.A0B(c23051Ak, 10);
        long j = c23031Ai.A01.getLong("mobile_config_last_sync_time_peak", 0L);
        boolean A002 = c23051Ak.A00(EnumC23071Am.A0K);
        Integer num2 = C05F.A01;
        AbstractC23081An.A00(c229419w2, c1as2, lightweightQuickPerformanceLogger2, num2, num, list2, 1, j, A002);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger3 = lightweightQuickPerformanceLogger2;
        AbstractC23081An.A00(c229419w, c1as, lightweightQuickPerformanceLogger3, num2, num, list, 2, j, A002);
        Integer num3 = C05F.A00;
        AbstractC23081An.A00(c229419w2, c1as2, lightweightQuickPerformanceLogger2, num3, num, list2, 1, j, A002);
        AbstractC23081An.A00(c229419w, c1as, lightweightQuickPerformanceLogger3, num3, num, list, 2, j, A002);
    }
}
