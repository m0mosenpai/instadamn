package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* loaded from: classes8.dex */
public final class JU5 extends AbstractC46524KiP {
    public DirectThreadAnalyticsParams A00;
    public C189478aR A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final UserSession A06;
    public final C43689JTy A07;

    public JU5(Activity activity, UserSession userSession) {
        this.A05 = activity;
        this.A06 = userSession;
        this.A07 = new C43689JTy(userSession);
    }
}
