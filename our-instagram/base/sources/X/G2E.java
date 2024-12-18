package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class G2E implements InterfaceC37193Ga4 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final User A03;
    public final String A04;
    public final String A05;

    public G2E(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3, String str4) {
        C38321qM c38321qM;
        AbstractC167007dF.A1G(str, 3, str3);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A05 = str;
        this.A04 = str2;
        User A0k = AbstractC31174DnI.A0k(userSession, str3);
        if (A0k != null) {
            this.A03 = A0k;
            if (str4 != null) {
                c38321qM = AbstractC25229BEm.A0h(userSession, str4);
            } else {
                c38321qM = null;
            }
            this.A02 = c38321qM;
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37193Ga4
    public final /* synthetic */ void DDM(C148336m3 c148336m3) {
    }

    @Override // X.InterfaceC37193Ga4
    public final void EOe(C2EC c2ec, C2DS c2ds, DirectShareTarget directShareTarget, String str, boolean z) {
        C38321qM c38321qM;
        C14360o3.A0B(str, 0);
        AbstractC167027dH.A13(c2ds, c2ec, directShareTarget);
        String str2 = this.A04;
        if (str2 != null && (c38321qM = this.A02) != null) {
            C36911no.A00().E6g(this.A01).A01(directShareTarget).EOV(null, new C32068E6u(this.A00.getModuleName(), "", z, false), c38321qM, directShareTarget, str2, this.A05, str, "direct_reply_modal", false, false);
        } else {
            AbstractC165967bO.A00(this.A01).EOZ(null, c2ec.BKb(), str, NetInfoModule.CONNECTION_TYPE_NONE, null, z);
        }
    }

    @Override // X.InterfaceC37193Ga4
    public final User CE6() {
        return this.A03;
    }

    @Override // X.InterfaceC37193Ga4
    public final void CNX(ViewStub viewStub, ViewStub viewStub2, ViewStub viewStub3) {
        AbstractC167017dG.A1N(viewStub, viewStub2);
        AbstractC31181DnP.A09(viewStub).setUrl(this.A03.Bhu(), this.A00);
        View A0E = AbstractC31173DnH.A0E(viewStub2, R.layout.fragment_direct_reply_modal_subtitle);
        C14360o3.A0C(A0E, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) A0E;
        Context context = textView.getContext();
        AbstractC166987dD.A1P(context, textView, 2131966308);
        AbstractC31177DnL.A0y(textView, context);
    }
}
