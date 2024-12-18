package X;

import android.app.Activity;
import android.view.View;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;

/* renamed from: X.F1b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34048F1b {
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0pQ, java.lang.Object] */
    public static final void A00(Activity activity, View view, UserSession userSession) {
        int i;
        int i2;
        AbstractC31265Don.A00();
        if (AbstractC31266Doo.A00(userSession).A00() == C05F.A0N) {
            ?? obj = new Object();
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            int i3 = interfaceC19630xq.getInt("preference_ai_home_v2_tooltip_shown_count", 0);
            C06090Tz c06090Tz = C06090Tz.A05;
            int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36606710638581247L);
            long j = interfaceC19630xq.getLong("preference_ai_home_v2_tooltip_timestamp", 0L);
            if (i3 < A07 && System.currentTimeMillis() - j > 86400000) {
                A00.A0z("preference_ai_home_v2_tooltip_shown_count", i3 + 1);
                A00.A11("preference_ai_home_v2_tooltip_timestamp", System.currentTimeMillis());
                AbstractC31265Don.A00();
                i2 = 2131955137;
            } else {
                if (!C18U.A06(c06090Tz, userSession, 36325235662271394L)) {
                    return;
                }
                C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                InterfaceC19630xq interfaceC19630xq2 = A002.A01;
                long j2 = interfaceC19630xq2.getLong("preference_ai_home_v2_tooltip_timestamp", 0L);
                if (interfaceC19630xq2.getInt("preference_ai_home_v2_tooltip_shown_count", 0) < AbstractC25225BEi.A07(c06090Tz, userSession, 36606710638581247L) || System.currentTimeMillis() - j2 <= 86400000 || (i = interfaceC19630xq2.getInt("preference_ai_home_rediscovery_tooltip_show_count", 0)) >= AbstractC25225BEi.A07(c06090Tz, userSession, 36606710639040001L)) {
                    return;
                }
                A002.A0z("preference_ai_home_rediscovery_tooltip_show_count", i + 1);
                AbstractC31265Don.A00();
                i2 = 2131952637;
            }
            obj.A00 = i2;
            view.postDelayed(new GPF(activity, view, obj), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }
}
