package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* loaded from: classes6.dex */
public final class EWV extends AbstractC61132qb {
    public final UserSession A00;
    public final DirectThreadKey A01;
    public final String A02;
    public final String A03;

    public EWV(UserSession userSession, DirectThreadKey directThreadKey, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = directThreadKey;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C31835Dyu(userSession, F2D.A00(userSession), this.A01, this.A02, this.A03);
    }
}
