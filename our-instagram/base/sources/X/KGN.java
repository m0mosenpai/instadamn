package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGN extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;
    public final boolean A02;

    public KGN(UserSession userSession, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44524JmU(this.A00, this.A01, this.A02);
    }
}
