package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3A implements InterfaceC37156GYt {
    public final InterfaceC11380iw A00;
    public final C41761wQ A01;
    public final InterfaceC37169GZg A02;
    public final E70 A03;
    public final UserSession A04;
    public final InterfaceC190658cN A05;
    public final boolean A06;

    public G3A(InterfaceC11380iw interfaceC11380iw, C41761wQ c41761wQ, UserSession userSession, InterfaceC37169GZg interfaceC37169GZg, E70 e70, InterfaceC190658cN interfaceC190658cN, boolean z) {
        AbstractC167007dF.A1F(userSession, 1, interfaceC190658cN);
        this.A04 = userSession;
        this.A03 = e70;
        this.A06 = z;
        this.A05 = interfaceC190658cN;
        this.A01 = c41761wQ;
        this.A02 = interfaceC37169GZg;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        int i = 2131959959;
        if (this.A03.A0D()) {
            i = 2131959960;
        }
        return AbstractC166987dD.A1J(new C36731GHa(new C35745Fqd(this, 20), this.A05, i, this.A06));
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        return C98Q.A00(this.A04).A00(this.A03.A0L, 27);
    }
}
