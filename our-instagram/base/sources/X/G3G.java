package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3G implements InterfaceC37156GYt {
    public final Context A00;
    public final UserSession A01;
    public final C3o9 A02;
    public final C35003Fba A03;
    public final InterfaceC11380iw A04;
    public final Capabilities A05;
    public final E70 A06;
    public final InterfaceC190658cN A07;

    public G3G(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, E70 e70, InterfaceC190658cN interfaceC190658cN, C3o9 c3o9, C35003Fba c35003Fba) {
        AbstractC167007dF.A1F(userSession, 2, c3o9);
        C14360o3.A0B(interfaceC190658cN, 7);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = capabilities;
        this.A02 = c3o9;
        this.A06 = e70;
        this.A03 = c35003Fba;
        this.A07 = interfaceC190658cN;
        this.A04 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        UserSession userSession = this.A01;
        if (C98Q.A00(userSession).A00(JRE.A05(this.A02), 30) && this.A06.A0E(userSession.userId)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        E70 e70 = this.A06;
        C36731GHa c36731GHa = new C36731GHa(new C35745Fqd(this, 23), this.A07, 2131958690, e70.A12);
        if (C4GR.A01(e70.A09)) {
            C81543kP c81543kP = e70.A0E;
            boolean z = true;
            if (c81543kP == null || !c81543kP.A0K) {
                z = false;
            }
            c36731GHa.A0E = z;
        }
        return AbstractC166987dD.A1J(c36731GHa);
    }
}
