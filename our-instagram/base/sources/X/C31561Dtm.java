package X;

import android.app.Activity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Dtm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31561Dtm {
    public long A00;
    public long A01;
    public long A02;
    public C1M1 A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public final C0JO A08 = new Object();
    public final UserSession A09;

    public final void A00(Activity activity) {
        Long l = this.A06;
        if (l != null) {
            long now = this.A08.now() - l.longValue();
            if (C1VN.A00 != null && now >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                HashMap A1G = AbstractC166987dD.A1G();
                UserSession userSession = this.A09;
                if (C18U.A06(C06090Tz.A05, userSession, 36326240684619539L)) {
                    A1G.put("saved", String.valueOf(F7K.A00(userSession).A02));
                    A1G.put("reshared_to_message", String.valueOf(F7K.A00(userSession).A00));
                    A1G.put("reshared_to_story", String.valueOf(F7K.A00(userSession).A01));
                    A1G.put("time_spent_by_session", String.valueOf(now));
                    A1G.put("time_spent_on_grid", String.valueOf(this.A01));
                    A1G.put("time_spent_on_reels", String.valueOf(this.A02));
                    A1G.put("time_spent_on_chain", String.valueOf(this.A00));
                }
                C1M1 c1m1 = this.A03;
                if (c1m1 != null) {
                    A1G.put(AbstractC58358Pty.A00(), c1m1.getSessionId());
                }
                F7K.A00(userSession).A02 = false;
                F7K.A00(userSession).A00 = false;
                F7K.A00(userSession).A01 = false;
                this.A00 = 0L;
                this.A01 = 0L;
                this.A02 = 0L;
                AbstractC31282Dp4.A00().A00(activity, userSession, "651322380127796", A1G);
            }
            this.A06 = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0JO, java.lang.Object] */
    public C31561Dtm(UserSession userSession) {
        this.A09 = userSession;
    }
}
