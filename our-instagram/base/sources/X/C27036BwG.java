package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27036BwG extends AbstractC61132qb {
    public final int A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str = this.A03;
        C14360o3.A0B(userSession, 0);
        return new C25877Bcc(new C27266C1j(userSession), interfaceC11380iw, userSession, str, this.A00);
    }

    public C27036BwG(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        AbstractC167017dG.A1P(userSession, str);
        this.A02 = userSession;
        this.A03 = str;
        this.A00 = i;
        this.A01 = interfaceC11380iw;
    }
}
