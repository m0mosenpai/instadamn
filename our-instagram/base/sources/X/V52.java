package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V52 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public V52(UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C66394UFf(this.A00, this.A01, this.A04, this.A05);
    }
}
