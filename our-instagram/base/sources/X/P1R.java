package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class P1R implements InterfaceC196338mP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ OAD A03;
    public final /* synthetic */ C54799OJt A04;
    public final /* synthetic */ ReelDashboardFragment A05;
    public final /* synthetic */ boolean A06;

    @Override // X.InterfaceC196338mP
    public final /* synthetic */ void DeN() {
    }

    public P1R(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, OAD oad, C54799OJt c54799OJt, ReelDashboardFragment reelDashboardFragment, boolean z) {
        this.A00 = context;
        this.A04 = c54799OJt;
        this.A03 = oad;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = reelDashboardFragment;
        this.A06 = z;
    }

    @Override // X.InterfaceC196338mP
    public final void DeO() {
        Context context = this.A00;
        C54799OJt c54799OJt = this.A04;
        OAD oad = this.A03;
        AbstractC59962oe abstractC59962oe = this.A01;
        UserSession userSession = this.A02;
        ReelDashboardFragment reelDashboardFragment = this.A05;
        boolean z = this.A06;
        AbstractC166987dD.A1Z(new C50118MBj(context, abstractC59962oe, userSession, oad, c54799OJt, reelDashboardFragment, null, z), AbstractC50624MWl.A03);
    }
}
