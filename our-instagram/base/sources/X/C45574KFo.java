package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.KFo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45574KFo extends AbstractC61132qb {
    public final UserSession A00;

    public C45574KFo(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C45527KDs(this.A00);
    }
}