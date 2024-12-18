package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Gg1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37545Gg1 extends AbstractC61132qb {
    public final int A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C37642Ghb(this.A01, this.A02, this.A00);
    }

    public C37545Gg1(UserSession userSession, InterfaceC60442pS interfaceC60442pS, int i) {
        AbstractC167017dG.A1P(userSession, interfaceC60442pS);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A00 = i;
    }
}
