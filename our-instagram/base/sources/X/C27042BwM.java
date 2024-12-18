package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27042BwM extends AbstractC61132qb {
    public final long A00;
    public final UserSession A01;
    public final String A02;
    public final String A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25881Bch(this.A01, this.A02, this.A03, this.A00);
    }

    public C27042BwM(UserSession userSession, String str, String str2, long j) {
        AbstractC25234BEr.A1P(userSession, str, str2);
        this.A01 = userSession;
        this.A02 = str;
        this.A00 = j;
        this.A03 = str2;
    }
}
