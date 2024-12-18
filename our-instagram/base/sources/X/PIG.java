package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PIG implements InterfaceC58086PpB {
    public final /* synthetic */ P1E A00;

    @Override // X.InterfaceC58086PpB
    public final void Cio(String str) {
        C14360o3.A0B(str, 0);
        P1E p1e = this.A00;
        UserSession userSession = p1e.A0J;
        AbstractC73317Y7a.A09(p1e.A0I, userSession, null, p1e.A0P, "composer", str);
        MX1.A00(userSession).A04("SHARE_TO_OPTION_TOGGLE_TAPPED");
    }

    @Override // X.InterfaceC58086PpB
    public final void Ck9(String str) {
        C14360o3.A0B(str, 0);
        P1E p1e = this.A00;
        AbstractC73317Y7a.A0E(p1e.A0I, p1e.A0J, p1e.A0P, "composer", str);
    }

    public PIG(P1E p1e) {
        this.A00 = p1e;
    }
}
