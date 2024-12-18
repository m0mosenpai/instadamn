package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NC8 extends AbstractC61132qb {
    public final UserSession A00;
    public final InterfaceC16820sZ A01;

    public NC8(UserSession userSession, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50936Mf5(this.A00, this.A01);
    }
}
