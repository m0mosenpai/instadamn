package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45582KFw extends AbstractC61132qb {
    public final C61972ry A00;
    public final UserSession A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A01;
        return new UFV(userSession, new C47692L3z(this.A00, userSession));
    }

    public C45582KFw(C61972ry c61972ry, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = c61972ry;
    }
}
