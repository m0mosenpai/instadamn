package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EVl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32561EVl extends AbstractC61132qb {
    public final UserSession A00;

    public C32561EVl(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        return new C44480Jlm(new C34428FFs(AbstractC40691uc.A01(this.A00)));
    }
}
