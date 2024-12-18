package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.GIo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36765GIo implements InterfaceC37219GaU {
    public final int A00;
    public final Object A01;

    @Override // X.InterfaceC37219GaU
    public final void D6t() {
    }

    public C36765GIo(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00() {
        C35015Fbo A00;
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null && (A00 = c28151Xt.A00()) != null) {
            C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
            A00.A01(c36006Fv4.A04, c36006Fv4.A06, c36006Fv4.A07, c36006Fv4.A0C);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void Czi() {
        switch (this.A00) {
            case 2:
                C36006Fv4.A02((C36006Fv4) this.A01, true);
                return;
            case 3:
                C28189Cbd.A00((C28189Cbd) this.A01, true);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void DFf() {
        if (8 - this.A00 == 0) {
            AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, false);
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void DqX() {
        if (2 - this.A00 == 0) {
            A00();
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ((InterfaceC37152GYp) this.A01).D1h(2);
                return;
            case 1:
            default:
                return;
            case 2:
                A00();
                return;
        }
    }

    @Override // X.InterfaceC37219GaU
    public final void onSuccess() {
        C1VN c1vn;
        String str;
        switch (this.A00) {
            case 0:
            case 3:
                return;
            case 1:
                C48757LhP.A00((C48757LhP) this.A01);
                return;
            case 2:
                C36006Fv4 c36006Fv4 = (C36006Fv4) this.A01;
                FragmentActivity activity = c36006Fv4.A04.getActivity();
                InterfaceC11380iw interfaceC11380iw = c36006Fv4.A05;
                User user = c36006Fv4.A0C;
                UserSession userSession = c36006Fv4.A07;
                C19280xC A00 = C19280xC.A00(interfaceC11380iw, "report_user");
                A00.A0C("actor_id", userSession.userId);
                A00.A0C("action", "ACTION_BLOCK_UNBLOCK_USER");
                A00.A0C("target_id", user.getId());
                A00.A0C("follow_status", AbstractC167007dF.A0h(user.B7L().toString()));
                VXI.A00(activity, A00, userSession);
                AbstractC31173DnH.A1S(A00, userSession);
                if (!user.CQf() || (c1vn = C1VN.A00) == null) {
                    return;
                }
                FragmentActivity fragmentActivity = c36006Fv4.A02;
                if (user.CQw()) {
                    str = "2333587946872064";
                } else {
                    str = "308597689866606";
                }
                c1vn.A02(userSession, fragmentActivity, str);
                return;
            case 4:
                AbstractC25226BEj.A1P((Fragment) this.A01);
                return;
            case 5:
                EJW ejw = (EJW) this.A01;
                FragmentActivity activity2 = ejw.getActivity();
                if (activity2 == null || C1VN.A00 == null) {
                    return;
                }
                AbstractC31282Dp4.A00().A02(AbstractC166987dD.A0r(ejw.A08), activity2, "1062958464864852");
                return;
            case 6:
            case 7:
            default:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 8:
                AbstractC25227BEk.A1Q((InterfaceC16660sJ) this.A01, true);
                return;
        }
    }
}
