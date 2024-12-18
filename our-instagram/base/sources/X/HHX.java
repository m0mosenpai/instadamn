package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HHX extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public HHX(UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C38324GtJ(this.A00, this.A02, this.A01, this.A03);
    }
}
