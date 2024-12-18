package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bw6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27026Bw6 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public C27026Bw6(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        return new C25851Bc6((C27268C1l) userSession.A01(C27268C1l.class, DBK.A00), AbstractC27688CJh.A00(userSession), this.A02, this.A01);
    }
}
