package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45581KFv extends AbstractC61132qb {
    public final UserSession A00;
    public final String A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C44487Jlt(new OMD(userSession), this.A01);
    }

    public C45581KFv(UserSession userSession, String str) {
        this.A00 = userSession;
        this.A01 = str;
    }
}
