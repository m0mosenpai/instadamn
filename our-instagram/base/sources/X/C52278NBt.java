package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NBt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52278NBt extends AbstractC61132qb {
    public final UserSession A00;
    public final boolean A01;

    public C52278NBt(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = z;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        boolean z = this.A01;
        return new C51022MgU(userSession, C196068lw.A00(userSession), AbstractC46542Bs.A00(userSession), z);
    }
}
