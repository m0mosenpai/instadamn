package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155466yZ extends AbstractC61132qb {
    public final UserSession A00;

    public C155466yZ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C155476ya(userSession, AbstractC155486yb.A00(userSession));
    }
}
