package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bw5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27025Bw5 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A01;
        String str2 = this.A02;
        UserSession userSession = this.A00;
        C4F0 A00 = C4Ez.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C25858BcD(A00, (C4F2) userSession.A01(C4F2.class, C4F1.A00), str, str2);
    }

    public C27025Bw5(UserSession userSession, String str, String str2) {
        AbstractC167027dH.A13(str, str2, userSession);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = userSession;
    }
}
