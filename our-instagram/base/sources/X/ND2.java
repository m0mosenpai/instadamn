package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ND2 extends AbstractC61132qb {
    public final UserSession A00;
    public final C28162Cb9 A01;
    public final C28457Ch7 A02;
    public final boolean A03;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C68079V9k c68079V9k = new C68079V9k(new O2I(userSession));
        boolean z = this.A03;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        return new C25870BcR(userSession, c68079V9k, this.A01, this.A02, A00, z);
    }

    public ND2(UserSession userSession, C28162Cb9 c28162Cb9, C28457Ch7 c28457Ch7, boolean z) {
        MSZ.A1O(userSession, c28162Cb9);
        this.A00 = userSession;
        this.A03 = z;
        this.A02 = c28457Ch7;
        this.A01 = c28162Cb9;
    }
}
