package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27040BwK extends AbstractC61132qb {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new C25871BcS(this.A00, userSession, new CUN(userSession), this.A02, this.A03);
    }

    public C27040BwK(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = str;
        this.A03 = str2;
    }
}
