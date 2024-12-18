package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KGC extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public KGC(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        L0m l0m = new L0m(userSession, str, str2);
        return new C44498Jm4(new L2M(new C47512Kyf(userSession), l0m, userSession, str2), l0m, C12L.A00);
    }
}
