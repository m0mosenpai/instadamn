package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BJK extends AbstractC60592pi {
    public boolean A00;
    public final FragmentActivity A01;
    public final AbstractC59962oe A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final UserSession A05;
    public final /* synthetic */ MUI A07;
    public final java.util.Set A06 = AbstractC166987dD.A1H();
    public final InterfaceC41501vz A04 = new MV0(this, 0);

    public BJK(FragmentActivity fragmentActivity, UserSession userSession, MUI mui) {
        this.A07 = mui;
        this.A01 = fragmentActivity;
        this.A02 = mui;
        this.A05 = userSession;
        this.A00 = AbstractC166987dD.A10(userSession).CQw();
        BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(EnumC151596s5.A04, userSession, mui.getModuleName(), null);
        A01.getClass();
        this.A03 = A01;
    }

    public final void A00() {
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A07.A0L);
        AbstractC166987dD.A1Z(new PZG(A0Z, (InterfaceC23621Ds) null, 4), AbstractC141776au.A00(A0Z));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void D8S(View view) {
        AbstractC25651Mw.A00(this.A05).A01(this.A04, C2AS.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        AbstractC25651Mw.A00(this.A05).A02(this.A04, C2AS.class);
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        this.A06.clear();
    }
}
