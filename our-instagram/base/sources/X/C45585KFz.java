package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45585KFz extends AbstractC61132qb {
    public final UserSession A00;
    public final Integer A01;

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C44477Jlj(userSession, AbstractC46739Klw.A00(userSession), this.A01);
    }

    public C45585KFz(UserSession userSession, Integer num) {
        AbstractC167017dG.A1P(userSession, num);
        this.A00 = userSession;
        this.A01 = num;
    }
}
