package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;

/* loaded from: classes6.dex */
public final class G39 implements InterfaceC37156GYt {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC37169GZg A03;
    public final E70 A04;
    public final C3o9 A05;
    public final InterfaceC190658cN A06;

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        E70 e70 = this.A04;
        UserSession userSession = this.A02;
        C3o9 A08 = e70.A08();
        if (C98Q.A00(userSession).A00(e70.A0L, 26) && e70.A0z && ((JRE.A02(A08) != null || !(A08 instanceof MsysThreadId) || C18U.A06(C06090Tz.A05, userSession, 36312419479585896L)) && !C4GR.A02(e70.A09))) {
            return true;
        }
        return false;
    }

    public G39(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC37169GZg interfaceC37169GZg, E70 e70, InterfaceC190658cN interfaceC190658cN, C3o9 c3o9) {
        AbstractC25234BEr.A1P(userSession, c3o9, interfaceC190658cN);
        this.A02 = userSession;
        this.A05 = c3o9;
        this.A04 = e70;
        this.A06 = interfaceC190658cN;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC37169GZg;
        this.A00 = context;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        return AbstractC166987dD.A1J(new C36731GHa(new C35745Fqd(this, 19), this.A06, 2131959967, this.A04.A10));
    }
}
