package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWK extends AbstractC61132qb {
    public final UserSession A00;
    public final EnumC33411Epi A01;
    public final boolean A02;

    public EWK(UserSession userSession, EnumC33411Epi enumC33411Epi, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = enumC33411Epi;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31805DyP(this.A00, this.A01, this.A02);
    }
}
