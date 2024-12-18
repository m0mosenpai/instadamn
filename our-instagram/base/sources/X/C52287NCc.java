package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NCc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52287NCc extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public C52287NCc(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = "highlights_grid";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50935Mf4(userSession, new C159407Da(userSession), this.A02, this.A01);
    }
}
