package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.G7o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36490G7o implements GXl {
    public final /* synthetic */ C3CZ A00;

    public C36490G7o(C3CZ c3cz) {
        this.A00 = c3cz;
    }

    @Override // X.GXl
    public final void D6t() {
        boolean z = C3CZ.A0G;
        C3CZ c3cz = this.A00;
        UserSession userSession = c3cz.A04;
        Fragment fragment = c3cz.A01;
        User user = c3cz.A05;
        AbstractC10360h2 abstractC10360h2 = c3cz.A02;
        InterfaceC114785Gl interfaceC114785Gl = c3cz.A03;
        InterfaceC16660sJ interfaceC16660sJ = c3cz.A06;
        C32529EUf c32529EUf = new C32529EUf(fragment, abstractC10360h2, interfaceC114785Gl, userSession, user, interfaceC16660sJ);
        if (interfaceC16660sJ != null) {
            AbstractC25227BEk.A1Q(interfaceC16660sJ, true);
        }
        C1ON A00 = AbstractC34756FSv.A00(userSession);
        A00.A00 = c32529EUf;
        AbstractC31177DnL.A19(fragment, A00);
    }
}
