package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class NCS extends AbstractC61132qb {
    public final UserSession A00;
    public final KZH A01;
    public final boolean A02;

    public NCS(UserSession userSession, KZH kzh, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = kzh;
        this.A02 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44547Jmr(this.A00, this.A01, this.A02);
    }
}
