package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHQ extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public HHQ(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = str;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44481Jln(this.A00, this.A01);
    }
}
