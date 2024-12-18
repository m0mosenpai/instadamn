package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52274NBp extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C52274NBp(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "cta_selector";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C50974Mfh(C12L.A00, userSession, new O2F(userSession, this.A01), new OEM(userSession));
    }
}
