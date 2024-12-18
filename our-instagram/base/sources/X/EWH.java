package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EWH extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public EWH(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31841Dz0(new FHI(new FHH(this.A00)), this.A01);
    }
}
