package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BvR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26986BvR extends AbstractC61132qb {
    public final UserSession A00;

    public C26986BvR(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25820Bbb(this.A00);
    }
}
