package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class HJ0 extends AbstractC66422zJ {
    public final UserSession A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.upcoming_event_dual_cta, false);
        return AbstractC37300Gc1.A03(AbstractC37303Gc4.A0Q(A0D, new C38449GvW(A0D)), "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventDualCtaViewBinder.ViewHolder");
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        int i;
        C42339Ip1 c42339Ip1 = (C42339Ip1) interfaceC66482zP;
        C38449GvW c38449GvW = (C38449GvW) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c42339Ip1, c38449GvW);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 2);
        C51758Mth c51758Mth = c42339Ip1.A00;
        if (c51758Mth.A01 && !C14640oc.A00()) {
            IgdsButton igdsButton = c38449GvW.A00;
            C1QL c1ql = C1QL.A03;
            igdsButton.setOverridePrismVariant(c1ql);
            c38449GvW.A01.setOverridePrismVariant(c1ql);
        }
        IgdsButton igdsButton2 = c38449GvW.A00;
        C40984IDf c40984IDf = c42339Ip1.A02;
        int A0H = AbstractC166987dD.A0H(c51758Mth.A00);
        if (A0H != 0) {
            if (A0H == A1a) {
                igdsButton2.setStyle(EnumC99704do.A03);
                IA2.A00(igdsButton2, R.drawable.instagram_alert_pano_outline_24);
                igdsButton2.setText(igdsButton2.getContext().getString(2131976237));
                i = 42;
            } else {
                throw B4Z.A00();
            }
        } else {
            igdsButton2.setStyle(EnumC99704do.A06);
            IA2.A00(igdsButton2, R.drawable.instagram_alert_check_pano_filled_24);
            igdsButton2.setText(igdsButton2.getContext().getString(2131976238));
            i = 41;
        }
        ViewOnClickListenerC42035Ik4.A01(igdsButton2, i, c40984IDf);
        C38947HCw c38947HCw = c40984IDf.A00;
        c38947HCw.A08(igdsButton2);
        IgdsButton igdsButton3 = c38449GvW.A01;
        igdsButton3.setStyle(EnumC99704do.A06);
        C38687GzS c38687GzS = c42339Ip1.A01;
        int A0H2 = AbstractC166987dD.A0H(c38687GzS.A00);
        if (A0H2 != 0) {
            if (A0H2 == A1a) {
                IA2.A00(igdsButton3, R.drawable.instagram_new_story_pano_outline_24);
                igdsButton3.setText(igdsButton3.getContext().getString(2131976225));
                ViewOnClickListenerC42035Ik4.A01(igdsButton3, 43, c40984IDf);
                return;
            }
            return;
        }
        IA2.A00(igdsButton3, R.drawable.instagram_link_pano_outline_24);
        igdsButton3.setText(c38687GzS.A01);
        C0fQ.A00(new ViewOnClickListenerC77633dn(userSession, null, null, new C57746PjZ(c40984IDf, 34), A1a), igdsButton3);
        c38947HCw.A07(igdsButton3);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42339Ip1.class;
    }

    public HJ0(UserSession userSession) {
        this.A00 = userSession;
    }
}
