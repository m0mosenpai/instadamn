package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52267NBi extends AbstractC61132qb {
    public final UserSession A00;

    public C52267NBi(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C50919Meo(new O9N(this.A00));
    }
}
