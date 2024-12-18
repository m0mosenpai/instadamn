package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27009Bvo extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public C27009Bvo(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25876Bcb(userSession, new CUN(userSession), this.A01);
    }
}
