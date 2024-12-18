package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G31 implements InterfaceC37156GYt {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final E70 A02;
    public final C3o9 A03;
    public final InterfaceC190658cN A04;

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        int i;
        UserSession userSession = this.A01;
        E70 e70 = this.A02;
        AbstractC167017dG.A1N(userSession, e70);
        if (C98Q.A00(userSession).A00(e70.A0L, 28) && (i = e70.A07) != 6 && i != 8) {
            return true;
        }
        return false;
    }

    public G31(InterfaceC11380iw interfaceC11380iw, UserSession userSession, E70 e70, InterfaceC190658cN interfaceC190658cN, C3o9 c3o9) {
        AbstractC25234BEr.A1P(userSession, c3o9, interfaceC190658cN);
        this.A01 = userSession;
        this.A03 = c3o9;
        this.A02 = e70;
        this.A04 = interfaceC190658cN;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        return AbstractC166987dD.A1J(new C36731GHa(new C35745Fqd(this, 22), this.A04, 2131959057, this.A02.A0q));
    }
}
