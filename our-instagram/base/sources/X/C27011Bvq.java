package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27011Bvq extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25848Bc3(C7MQ.A00(userSession), new C7Uo(userSession), this.A01);
    }

    public C27011Bvq(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
