package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gk3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37788Gk3 {
    public static final void A00(UserSession userSession, Integer num, String str, String str2, int i, boolean z, boolean z2) {
        C37695GiW A01 = AbstractC37654Ghn.A01(userSession);
        if (A01 != null && !A01.A00) {
            if (num == C05F.A00) {
                C37695GiW.A04(A01);
            }
            C0XJ c0xj = new C0XJ();
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36318479679887543L);
            c0xj.A00("analytics_module", str, 1);
            c0xj.A00("is_sync", String.valueOf(z), 8);
            c0xj.A00("delivery_context", AbstractC37798GkD.A01(num), 1);
            c0xj.A00("existing_post_count", String.valueOf(i), 2);
            c0xj.A00("next_max_id", str2, 1);
            c0xj.A00("chaining_head_load_flag", String.valueOf(A06), 8);
            C37695GiW.A00(c0xj, A01, "use_network_cache", String.valueOf(z2), 8).markerPoint(976032351, 0, 7, "fetch_organic_start", c0xj, System.currentTimeMillis(), TimeUnit.MILLISECONDS, 0);
        }
    }
}
