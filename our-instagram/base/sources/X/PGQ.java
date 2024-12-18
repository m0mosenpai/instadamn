package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* loaded from: classes9.dex */
public final class PGQ implements InterfaceC57991Pnb {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ OAD A03;
    public final /* synthetic */ C54799OJt A04;
    public final /* synthetic */ ReelDashboardFragment A05;

    public PGQ(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, OAD oad, C54799OJt c54799OJt, ReelDashboardFragment reelDashboardFragment) {
        this.A04 = c54799OJt;
        this.A00 = context;
        this.A03 = oad;
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A05 = reelDashboardFragment;
    }

    @Override // X.InterfaceC57991Pnb
    public final void E33(Integer num) {
        int A03 = AbstractC43592JPx.A03(num, 0);
        if (A03 != 0) {
            if (A03 == 1) {
                CallerContext callerContext = AbstractC50624MWl.A01;
                C54799OJt c54799OJt = this.A04;
                IgdsButton A00 = c54799OJt.A00();
                A00.setLoading(true);
                A00.setEnabled(false);
                C55156OdK.A01(this.A00, this.A01, this.A02, this.A03, c54799OJt, this.A05, false, false);
                return;
            }
            return;
        }
        CallerContext callerContext2 = AbstractC50624MWl.A01;
        C54799OJt c54799OJt2 = this.A04;
        IgdsButton A002 = c54799OJt2.A00();
        A002.setLoading(true);
        A002.setEnabled(false);
        Context context = this.A00;
        OAD oad = this.A03;
        AbstractC59962oe abstractC59962oe = this.A01;
        UserSession userSession = this.A02;
        ReelDashboardFragment reelDashboardFragment = this.A05;
        C55156OdK.A01(context, abstractC59962oe, userSession, oad, c54799OJt2, reelDashboardFragment, true, false);
        PG0 pg0 = new PG0(oad, reelDashboardFragment);
        C14360o3.A0B(userSession, 0);
        new C195918ld(userSession, pg0).A05(true, "ig_story_viewers_dashboard");
    }
}
