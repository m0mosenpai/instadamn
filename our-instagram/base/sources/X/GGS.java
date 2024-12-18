package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GGS implements GYK {
    public final AbstractC59962oe A00;

    @Override // X.GYK
    public final void Crs(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        C34699FQk c34699FQk;
        int A06 = AbstractC167007dF.A06(1, userSession, fragmentActivity);
        if (AbstractC166987dD.A0x(userSession).getInt("nelson_nux_shown_count", 0) < 3) {
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            AbstractC167007dF.A18(A0x, "nelson_nux_shown_count", A0x.getInt("nelson_nux_shown_count", 0) + 1);
            C34931FaH c34931FaH = new C34931FaH(userSession);
            AbstractC59962oe abstractC59962oe = this.A00;
            GUP gup = GUP.A00;
            C14360o3.A0B("com.instagram.bullying.restrict_nux_action", A06);
            UserSession userSession2 = c34931FaH.A00;
            C62862tP A01 = C62862tP.A01(null, fragmentActivity, AbstractC31171DnF.A0D("SETTINGS"), userSession2);
            AbstractC192798gL A05 = C192108fB.A05(userSession2, "com.instagram.bullying.restrict_nux_action", null);
            C32394EOv.A00(A05, A01, gup, 16);
            abstractC59962oe.schedule(A05);
            return;
        }
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt == null || (c34699FQk = (C34699FQk) c28151Xt.A00.getValue()) == null) {
            return;
        }
        AbstractC31177DnL.A16(c34699FQk.A00(userSession), fragmentActivity, userSession);
    }

    public GGS(AbstractC59962oe abstractC59962oe) {
        this.A00 = abstractC59962oe;
    }
}
