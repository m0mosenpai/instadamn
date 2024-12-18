package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32560EVk extends AbstractC61132qb {
    public final UserSession A00;

    public C32560EVk(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C45526KDr(this.A00);
    }
}
