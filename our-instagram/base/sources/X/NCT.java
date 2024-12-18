package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCT extends AbstractC61132qb {
    public final UserSession A00;
    public final AnonymousClass841 A01;
    public final boolean A02;

    public NCT(UserSession userSession, AnonymousClass841 anonymousClass841, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = anonymousClass841;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50725MaQ(userSession, this.A01, MX1.A01(userSession), this.A02);
    }
}
