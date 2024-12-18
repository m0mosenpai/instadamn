package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BvM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26981BvM extends AbstractC61132qb {
    public final UserSession A00;

    public C26981BvM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25878Bcd(this.A00);
    }
}
