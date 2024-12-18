package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class Bw3 extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    public Bw3(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = "clips";
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C25852Bc7(this.A00, new C27831COu(), this.A01);
    }
}
