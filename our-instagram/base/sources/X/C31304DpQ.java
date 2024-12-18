package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.DpQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31304DpQ extends AbstractC46524KiP implements GZA {
    public C34412FFc A00;
    public C2EC A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C2056398n A04;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        C34412FFc c34412FFc = new C34412FFc(context, this);
        this.A00 = c34412FFc;
        return c34412FFc.A00;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        C14360o3.A0B(interfaceC37159GYw, 1);
        this.A01 = c2ec;
        if (c2ec != null && AbstractC31302DpO.A00(this.A03, c2ec, this.A04)) {
            interfaceC37159GYw.Dpu(this);
        } else {
            interfaceC37159GYw.onFailure();
        }
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            C142846ck A00 = AbstractC147806l5.A00(this.A03);
            int AdZ = c2ec.AdZ();
            String C7I = c2ec.C7I();
            String C7q = c2ec.C7q();
            C25531Mh A0I = AbstractC31172DnG.A0I(A00);
            if (AbstractC25226BEj.A1Z(A0I)) {
                AbstractC31175DnJ.A1B(A0I, A00);
                AbstractC31174DnI.A1K(A0I, "view_comment_upsell_nux");
                A0I.A0o(AbstractC111324zv.A00(4158));
                A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_view", C7I, C7q, AdZ));
                A0I.Cht();
            }
        }
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        String C7I;
        C2EC c2ec = this.A01;
        if (c2ec != null && (C7I = c2ec.C7I()) != null) {
            UserSession userSession = this.A03;
            AbstractC25229BEm.A18(AbstractC34088F2q.A00(userSession, AbstractC31171DnF.A0N(C7I), "upsell_banner"), AbstractC25225BEi.A0r(this.A02, userSession));
        }
        C34412FFc c34412FFc = this.A00;
        if (c34412FFc != null) {
            c34412FFc.A00.setVisibility(8);
        }
        C2EC c2ec2 = this.A01;
        if (c2ec2 != null) {
            AbstractC147806l5.A00(this.A03).A0O(Integer.valueOf(c2ec2.AdZ()), c2ec2.C7I(), c2ec2.C7q(), true);
        }
        C2056398n c2056398n = this.A04;
        C2EC c2ec3 = this.A01;
        if (c2ec3 == null || (str = c2ec3.C7I()) == null) {
            str = "";
        }
        c2056398n.A05(str);
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String str;
        C2EC c2ec = this.A01;
        if (c2ec != null) {
            AbstractC147806l5.A00(this.A03).A0O(Integer.valueOf(c2ec.AdZ()), c2ec.C7I(), c2ec.C7q(), false);
        }
        C2056398n c2056398n = this.A04;
        C2EC c2ec2 = this.A01;
        if (c2ec2 == null || (str = c2ec2.C7I()) == null) {
            str = "";
        }
        c2056398n.A05(str);
    }

    public C31304DpQ(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = AbstractC2056298m.A00(userSession);
    }
}
