package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BwQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27046BwQ extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final java.util.Set A03;
    public final java.util.Set A04;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        String str = this.A02;
        return new C25859BcE(LEP.A02.A00(this.A00, str), str, this.A01, this.A04, this.A03);
    }

    public C27046BwQ(UserSession userSession, String str, String str2, java.util.Set set, java.util.Set set2) {
        AbstractC167027dH.A13(userSession, str, str2);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A04 = set;
        this.A03 = set2;
    }
}
