package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6me, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148696me extends AbstractC61132qb {
    public final UserSession A00;

    public C148696me(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C148236lt(this.A00);
    }
}
