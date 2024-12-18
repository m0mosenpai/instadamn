package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32573EVy extends AbstractC61132qb {
    public final UserSession A00;

    public C32573EVy(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C31818Dyc(this.A00);
    }
}
