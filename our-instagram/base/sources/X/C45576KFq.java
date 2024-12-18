package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45576KFq extends AbstractC61132qb {
    public final UserSession A00;

    public C45576KFq(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44482Jlo(this.A00);
    }
}
