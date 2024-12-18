package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3F implements InterfaceC37156GYt {
    public final C18920wW A00;
    public final InterfaceC37169GZg A01;
    public final E70 A02;
    public final Context A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final InterfaceC190658cN A06;

    public G3F(Context context, C18920wW c18920wW, UserSession userSession, Capabilities capabilities, InterfaceC37169GZg interfaceC37169GZg, E70 e70, InterfaceC190658cN interfaceC190658cN) {
        AbstractC167007dF.A1H(userSession, 2, interfaceC190658cN);
        this.A03 = context;
        this.A04 = userSession;
        this.A02 = e70;
        this.A05 = capabilities;
        this.A01 = interfaceC37169GZg;
        this.A00 = c18920wW;
        this.A06 = interfaceC190658cN;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        C34654FOn c34654FOn = AbstractC36357G2j.A00;
        UserSession userSession = this.A04;
        E70 e70 = this.A02;
        if (c34654FOn.A00(userSession, this.A05, e70) && e70.A13) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        E70 e70 = this.A02;
        C36731GHa c36731GHa = new C36731GHa(new C35745Fqd(this, 25), this.A06, 2131959158, e70.A0k);
        int i = 2131959157;
        if (e70.A0s) {
            i = 2131973917;
        }
        c36731GHa.A02 = i;
        return AbstractC166987dD.A1J(c36731GHa);
    }
}
