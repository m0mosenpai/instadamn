package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.V4v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67980V4v extends AbstractC61132qb {
    public final UserSession A00;

    public C67980V4v(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new UFD(this.A00);
    }
}
