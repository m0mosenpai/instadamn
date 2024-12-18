package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGQ extends AbstractC61132qb {
    public final long A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        long j = this.A00;
        String str = this.A02;
        UserSession userSession = this.A01;
        return new JnA(userSession, new C47407Kww(userSession), str, j);
    }

    public KGQ(UserSession userSession, String str, long j) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A01 = userSession;
        this.A00 = j;
        this.A02 = str;
    }
}
