package X;

import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* loaded from: classes8.dex */
public final class JU4 extends AbstractC46524KiP {
    public ViewStub A00;
    public C2EC A01;
    public DirectThreadAnalyticsParams A02;
    public MessageIdentifier A03;
    public User A04;
    public String A05;
    public boolean A06;
    public final FragmentActivity A07;
    public final UserSession A08;
    public final FFZ A09;
    public final C43689JTy A0A;
    public final InterfaceC50487MQp A0B = new JU3(this);

    public JU4(FragmentActivity fragmentActivity, UserSession userSession, FFZ ffz) {
        this.A07 = fragmentActivity;
        this.A08 = userSession;
        this.A09 = ffz;
        this.A0A = new C43689JTy(userSession);
    }
}
