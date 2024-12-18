package X;

import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes9.dex */
public final class P49 implements InterfaceC65575Tn9 {
    public OET A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C38321qM A03;
    public final InterfaceC60442pS A04;
    public final PIR A05;
    public final C50920Mep A06;
    public final C146076i5 A07;
    public final UpcomingEvent A08;

    @Override // X.InterfaceC65575Tn9
    public final void Dx8(String str, Object obj) {
    }

    @Override // X.InterfaceC65575Tn9
    public final void EGj(View view) {
        UpcomingEvent upcomingEvent = this.A08;
        if (upcomingEvent != null) {
            ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.ig_expandable_footer_stub);
            FragmentActivity fragmentActivity = this.A01;
            this.A00 = new OET(viewStub, fragmentActivity, this.A04, this.A02, this.A05, upcomingEvent);
            if ((fragmentActivity instanceof C07X) && fragmentActivity != null) {
                C07S c07s = C07S.STARTED;
                AbstractC166987dD.A1Z(new PZP(fragmentActivity, c07s, this, null, 11), AbstractC25229BEm.A0a(fragmentActivity));
            }
        }
    }

    @Override // X.InterfaceC65575Tn9
    public final View B7m() {
        OET oet = this.A00;
        if (oet == null) {
            C14360o3.A0F("viewBinder");
            throw C00O.createAndThrow();
        }
        return oet.A02.A01;
    }

    @Override // X.InterfaceC65575Tn9
    public final void DKZ() {
        C3O0 c3o0;
        OET oet = this.A00;
        if (oet == null) {
            C14360o3.A0F("viewBinder");
            throw C00O.createAndThrow();
        }
        IN8 in8 = (IN8) oet.A05.getValue();
        C31349DqE c31349DqE = in8.A00;
        if (c31349DqE != null && (c3o0 = in8.A01) != null) {
            c3o0.A09(c31349DqE);
        }
    }

    @Override // X.InterfaceC65575Tn9
    public final void onDestroyView() {
        C3O0 c3o0;
        if (this.A08 != null) {
            OET oet = this.A00;
            if (oet == null) {
                C14360o3.A0F("viewBinder");
                throw C00O.createAndThrow();
            }
            IN8 in8 = (IN8) oet.A05.getValue();
            C31349DqE c31349DqE = in8.A00;
            if (c31349DqE != null && (c3o0 = in8.A01) != null) {
                c3o0.A09(c31349DqE);
            }
        }
    }

    public P49(C51707Msc c51707Msc) {
        FragmentActivity fragmentActivity = (FragmentActivity) c51707Msc.A02;
        this.A01 = fragmentActivity;
        UserSession userSession = (UserSession) c51707Msc.A04;
        this.A02 = userSession;
        C38321qM c38321qM = (C38321qM) c51707Msc.A03;
        this.A03 = c38321qM;
        UpcomingEvent A00 = AbstractC146056i3.A00(userSession).A00(c51707Msc.A0C);
        this.A08 = A00;
        P2U p2u = new P2U(c51707Msc);
        this.A04 = p2u;
        this.A07 = new C146076i5(p2u, userSession, c51707Msc.A0D);
        this.A06 = (C50920Mep) MSW.A0F(new ND7(userSession, c38321qM, p2u, A00), fragmentActivity).A00(C50920Mep.class);
        this.A05 = new PIR(c51707Msc, this);
    }
}
