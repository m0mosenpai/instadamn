package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWJ extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final boolean A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31809DyT(AnonymousClass189.A00(this.A00), this.A01, this.A02);
    }

    public EWJ(UserSession userSession, String str, boolean z) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = z;
    }
}
