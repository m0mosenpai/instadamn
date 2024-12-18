package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class V50 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;

    public V50(UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new UFH(this.A00, this.A02, this.A01);
    }
}
