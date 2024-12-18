package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V4x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67982V4x extends AbstractC61132qb {
    public final UserSession A00;
    public final C154796xU A01;

    public C67982V4x(UserSession userSession, C154796xU c154796xU) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = c154796xU;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new UFL(new W56(userSession, this.A01), userSession);
    }
}
