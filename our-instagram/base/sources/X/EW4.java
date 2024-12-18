package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class EW4 extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;

    public EW4(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C32728Eat(this.A00, this.A01);
    }
}
