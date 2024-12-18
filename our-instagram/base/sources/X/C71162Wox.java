package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;
import java.util.Date;

/* renamed from: X.Wox, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71162Wox implements InterfaceC58092PpH {
    public final int A00;
    public final Object A01;

    public C71162Wox(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC58092PpH
    public final void DEO(Long l, Long l2, long j, long j2, boolean z) {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                V0T v0t = (V0T) this.A01;
                C9GR.A0B(v0t.getActivity(), "something_went_wrong");
                IgdsSwitch igdsSwitch = v0t.A0L;
                if (igdsSwitch == null) {
                    C14360o3.A0F("quietModeToggle");
                    throw C00O.createAndThrow();
                }
                igdsSwitch.setChecked(!z);
                return;
            default:
                C9GR.A0B(((Fragment) this.A01).getActivity(), "something_went_wrong");
                return;
        }
    }

    @Override // X.InterfaceC58092PpH
    public final void DqU(Long l, Long l2, long j, long j2, boolean z) {
        String str;
        switch (this.A00) {
            case 0:
                WjS wjS = (WjS) this.A01;
                UserSession userSession = wjS.A01;
                AbstractC206099Aq.A06(userSession);
                AbstractC25651Mw.A00(userSession).E4s(new C2AT(true));
                ((C7U0) wjS.A02.get()).BT6().FBv();
                AbstractC59962oe abstractC59962oe = wjS.A00;
                AbstractC34914Fa0.A00(abstractC59962oe.requireContext(), abstractC59962oe.requireActivity(), userSession, AbstractC111324zv.A00(2247));
                return;
            case 1:
                V0T v0t = (V0T) this.A01;
                V0T.A0F(v0t, z);
                User A01 = C17060sy.A01.A01(v0t.getSession());
                if (!z) {
                    A01.A0u(C16930sl.A00);
                } else if (l != null && l2 != null) {
                    new C71603Jf(v0t.getSession()).A05(l.longValue(), l2.longValue());
                }
                V0T.A0E(v0t, z);
                return;
            default:
                long A00 = AbstractC35218FgB.A00() / 1000;
                long j3 = A00 + j;
                long j4 = A00 + j2;
                V0T v0t2 = (V0T) this.A01;
                IgTextView igTextView = v0t2.A05;
                if (igTextView == null) {
                    str = "fromRowValue";
                } else {
                    igTextView.setText(AbstractC35218FgB.A02(v0t2.requireContext()).format(new Date(j3 * 1000)));
                    IgTextView igTextView2 = v0t2.A0J;
                    if (igTextView2 == null) {
                        str = "toRowValue";
                    } else {
                        igTextView2.setText(AbstractC35218FgB.A02(v0t2.requireContext()).format(new Date(j4 * 1000)));
                        User A012 = C17060sy.A01.A01(v0t2.getSession());
                        AbstractC206099Aq.A07(v0t2.getSession(), A012, null, j, j2);
                        AbstractC206099Aq.A06(v0t2.getSession());
                        if (!z) {
                            A012.A0u(C16930sl.A00);
                        } else if (l != null && l2 != null) {
                            new C71603Jf(v0t2.getSession()).A05(l.longValue(), l2.longValue());
                        }
                        V0T.A0E(v0t2, z);
                        AbstractC25651Mw.A00(v0t2.getSession()).E4s(new C2AT(z));
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
