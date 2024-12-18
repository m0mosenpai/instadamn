package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45573KFn extends AbstractC61132qb {
    public final UserSession A00;

    public C45573KFn(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        C109494wb A00 = AbstractC109484wa.A00(userSession);
        C14360o3.A0B(userSession, 0);
        return new C44532Jmc(userSession, AbstractC44185Jfo.A00(userSession), A00);
    }
}
