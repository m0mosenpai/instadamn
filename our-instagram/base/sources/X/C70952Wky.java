package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.user.model.User;

/* renamed from: X.Wky, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70952Wky implements InterfaceC190658cN {
    public final /* synthetic */ IgdsSwitch A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ C71603Jf A02;
    public final /* synthetic */ V0T A03;

    public C70952Wky(IgdsSwitch igdsSwitch, User user, C71603Jf c71603Jf, V0T v0t) {
        this.A03 = v0t;
        this.A02 = c71603Jf;
        this.A00 = igdsSwitch;
        this.A01 = user;
    }

    @Override // X.InterfaceC190658cN
    public final boolean onToggle(boolean z) {
        Boolean A0a;
        V0T v0t = this.A03;
        UserSession session = v0t.getSession();
        InterfaceC11380iw interfaceC11380iw = v0t.A0U;
        AbstractC167017dG.A1N(session, interfaceC11380iw);
        C65761Ttc c65761Ttc = new C65761Ttc(interfaceC11380iw, session);
        C71603Jf c71603Jf = this.A02;
        C69436VnL A0R = AbstractC65702TsY.A0R(c71603Jf, v0t);
        String str = v0t.A0N;
        C14360o3.A0B(str, 1);
        C65761Ttc.A02(c65761Ttc, A0R, "ig_quiet_mode_toggle_tapped", str);
        if (!z && !AbstractC206099Aq.A08(v0t.getSession())) {
            if (C18U.A06(C06090Tz.A05, v0t.getSession(), 36315980008460135L)) {
                AbstractC206099Aq.A05(AbstractC166997dE.A0L(this.A00), v0t.requireActivity(), v0t.getSession(), v0t.A0N);
                return true;
            }
        }
        UserSession session2 = v0t.getSession();
        AbstractC167017dG.A1N(session2, interfaceC11380iw);
        C65761Ttc c65761Ttc2 = new C65761Ttc(interfaceC11380iw, session2);
        C69436VnL A0R2 = AbstractC65702TsY.A0R(c71603Jf, v0t);
        User user = this.A01;
        boolean A1W = user.A1W();
        String str2 = v0t.A0N;
        Long l = null;
        if (z) {
            A0a = null;
        } else {
            A0a = AbstractC166997dE.A0a();
            l = AbstractC167007dF.A0d();
        }
        c65761Ttc2.A03(A0R2, A0a, l, l, l, str2, z, A1W);
        user.A1A(z);
        V0T.A0G(v0t, z);
        return true;
    }
}
