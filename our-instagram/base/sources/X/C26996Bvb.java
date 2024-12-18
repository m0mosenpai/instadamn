package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Bvb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26996Bvb extends AbstractC61132qb {
    public final UserSession A00;

    public C26996Bvb(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.AbstractC61132qb
    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
        UserSession userSession = this.A00;
        return new C25840Bbv(new C159407Da(userSession), new CSB(userSession));
    }
}
