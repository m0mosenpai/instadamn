package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27019Bvy extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25836Bbr(this.A00, this.A01);
    }

    public C27019Bvy(UserSession userSession, String str) {
        AbstractC167017dG.A1P(userSession, str);
        this.A00 = userSession;
        this.A01 = str;
    }
}
