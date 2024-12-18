package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32555EVf extends AbstractC61132qb {
    public final UserSession A00;

    public C32555EVf(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new Dz9(this.A00);
    }
}
