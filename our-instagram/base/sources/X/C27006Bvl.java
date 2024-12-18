package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27006Bvl extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C166667cc(this.A00, this.A01);
    }

    public C27006Bvl(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
