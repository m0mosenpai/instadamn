package X;

import android.os.Handler;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class P4A implements InterfaceC65575Tn9 {
    public C54974OTg A00;
    public final Handler A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C38321qM A04;
    public final InterfaceC60442pS A05;
    public final EnumC61217RhH A06;
    public final OAN A07;
    public final O82 A08;
    public final C50911Meg A09;

    public P4A(C51707Msc c51707Msc) {
        C141796aw A00;
        int i;
        FragmentActivity fragmentActivity = (FragmentActivity) c51707Msc.A02;
        this.A02 = fragmentActivity;
        UserSession userSession = (UserSession) c51707Msc.A04;
        this.A03 = userSession;
        C38321qM c38321qM = (C38321qM) c51707Msc.A03;
        this.A04 = c38321qM;
        EnumC61217RhH enumC61217RhH = (EnumC61217RhH) c51707Msc.A07;
        this.A06 = enumC61217RhH;
        this.A05 = new P2V(c51707Msc);
        C50911Meg c50911Meg = (C50911Meg) MSW.A0F(new C52281NBw(userSession, c38321qM), fragmentActivity).A00(C50911Meg.class);
        this.A09 = c50911Meg;
        this.A07 = new OAN(c51707Msc.A0B);
        this.A08 = new O82(new C57551PgP(this, 30), new C57551PgP(this, 31));
        this.A01 = AbstractC167007dF.A0J();
        int ordinal = enumC61217RhH.ordinal();
        if (ordinal != 5) {
            if (ordinal == 4) {
                A00 = AbstractC141776au.A00(c50911Meg);
                i = 17;
            } else {
                return;
            }
        } else {
            A00 = AbstractC141776au.A00(c50911Meg);
            i = 18;
        }
        AbstractC31177DnL.A1Q(c50911Meg, A00, i);
    }

    @Override // X.InterfaceC65575Tn9
    public final void DKZ() {
    }

    @Override // X.InterfaceC65575Tn9
    public final void Dx8(String str, Object obj) {
    }

    @Override // X.InterfaceC65575Tn9
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC65575Tn9
    public final View B7m() {
        C54974OTg c54974OTg = this.A00;
        if (c54974OTg == null) {
            C14360o3.A0F("viewBinder");
            throw C00O.createAndThrow();
        }
        return c54974OTg.A02.A01;
    }

    @Override // X.InterfaceC65575Tn9
    public final void EGj(View view) {
        ViewStub viewStub = (ViewStub) AbstractC166987dD.A0c(view, R.id.ig_expandable_footer_stub);
        FragmentActivity fragmentActivity = this.A02;
        this.A00 = new C54974OTg(viewStub, fragmentActivity, this.A05);
        if ((fragmentActivity instanceof C07X) && fragmentActivity != null) {
            C07S c07s = C07S.STARTED;
            AbstractC166987dD.A1Z(new PZP(fragmentActivity, c07s, this, null, 12), AbstractC25229BEm.A0a(fragmentActivity));
        }
    }
}
