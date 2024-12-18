package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class JU1 extends AbstractC46524KiP {
    public C2EC A00;
    public DirectThreadAnalyticsParams A01;
    public C189478aR A02;
    public MessageIdentifier A03;
    public User A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final FragmentActivity A08;
    public final UserSession A09;
    public final FFZ A0A;
    public final C43689JTy A0B;

    public JU1(FragmentActivity fragmentActivity, UserSession userSession, FFZ ffz) {
        this.A08 = fragmentActivity;
        this.A09 = userSession;
        this.A0A = ffz;
        this.A0B = new C43689JTy(userSession);
    }
}
