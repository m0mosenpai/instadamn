package X;

import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;

/* loaded from: classes8.dex */
public final class JU6 extends AbstractC46524KiP {
    public ViewStub A00;
    public DirectThreadAnalyticsParams A01;
    public String A02;
    public boolean A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final C43689JTy A06;
    public final InterfaceC50487MQp A07 = new JU7(this);

    public JU6(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A04 = fragmentActivity;
        this.A05 = userSession;
        this.A06 = new C43689JTy(userSession);
    }
}
